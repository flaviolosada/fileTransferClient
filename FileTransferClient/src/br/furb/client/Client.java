package br.furb.client;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        this.rbGoogleDrive.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupServer = new javax.swing.ButtonGroup();
        btnSelecionarArquivo = new javax.swing.JButton();
        panelServer = new javax.swing.JPanel();
        rbGoogleDrive = new javax.swing.JRadioButton();
        rbDropbox = new javax.swing.JRadioButton();
        rbOneDrive = new javax.swing.JRadioButton();
        arquivoPB = new javax.swing.JProgressBar();
        totalLB = new javax.swing.JLabel();
        enviadoLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Envio de arquivo");
        setResizable(false);

        btnSelecionarArquivo.setText("Enviar arquivo");
        btnSelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarArquivoActionPerformed(evt);
            }
        });

        panelServer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Server", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N

        btnGroupServer.add(rbGoogleDrive);
        rbGoogleDrive.setText("GoogleDrive");
        rbGoogleDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGoogleDriveActionPerformed(evt);
            }
        });

        btnGroupServer.add(rbDropbox);
        rbDropbox.setText("Dropbox");
        rbDropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDropboxActionPerformed(evt);
            }
        });

        btnGroupServer.add(rbOneDrive);
        rbOneDrive.setText("OneDrive");
        rbOneDrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOneDriveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelServerLayout = new javax.swing.GroupLayout(panelServer);
        panelServer.setLayout(panelServerLayout);
        panelServerLayout.setHorizontalGroup(
            panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbGoogleDrive)
                .addGap(18, 18, 18)
                .addComponent(rbOneDrive)
                .addGap(18, 18, 18)
                .addComponent(rbDropbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelServerLayout.setVerticalGroup(
            panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelServerLayout.createSequentialGroup()
                .addGroup(panelServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGoogleDrive)
                    .addComponent(rbOneDrive)
                    .addComponent(rbDropbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        arquivoPB.setStringPainted(true);

        totalLB.setText("Total:");

        enviadoLB.setText("Enviado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arquivoPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarArquivo)
                    .addComponent(enviadoLB)
                    .addComponent(totalLB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviadoLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arquivoPB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelServer.getAccessibleContext().setAccessibleName("panel_server");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarArquivoActionPerformed
        arquivoPB.setValue(0);
        File file = openFile();
        try {
            if (file != null) {
                sendMessageMulticast();
                Address serverAddress = receiveServerAddress();
                if (serverAddress != null) { 
                    sendFileSocket(serverAddress, file);
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível obter o endereço do servidor", "Não foi possível obter o endereço do servidor", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Não foi possível obter o endereço do servidor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarArquivoActionPerformed

    private void rbGoogleDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGoogleDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbGoogleDriveActionPerformed

    private void rbDropboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDropboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDropboxActionPerformed

    private void rbOneDriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOneDriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOneDriveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
    public void sendMessageMulticast() throws IOException {
        byte[] sendData = new byte[1024];
        byte ttl = (byte) 10;

        int porta = 5000;
        MulticastSocket clientSocket = new MulticastSocket();
        InetAddress endereco = InetAddress.getByName("227.55.77.99");
        clientSocket.joinGroup(endereco);
        sendData = getTipoArquivoSelecionado().getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, endereco, porta);
        clientSocket.setTimeToLive(ttl);
        clientSocket.send(sendPacket);            
        clientSocket.leaveGroup(endereco);
        clientSocket.close();            
    }
    
    private String getTipoArquivoSelecionado() {
        if (this.rbGoogleDrive.isSelected()) {
            return "[GoogleDrive]";
        } else if (this.rbOneDrive.isSelected()) {
            return "[OneDrive]";
        } else {
            return "[Dropbox]";
        }
    }
    
    private Address receiveServerAddress() throws Exception {
        byte[] buf = new byte[1024];
        DatagramPacket request = null;
        DatagramSocket socket = new DatagramSocket(5005);
        try {
            request = new DatagramPacket (buf, buf.length);
            String result = "";
            int attempt = 0;
            while ("".equals(result.trim()) || attempt >= 10) {
                socket.receive(request);
                result = new String(request.getData(),0,request.getLength());
                if (!"".equals(result.trim())) {
                    Address address = new Address();
                    result = result.substring(4);
                    String[] aResult = result.split(":");
                    address.setIpAddress(aResult[0]);
                    address.setPortNumber(Integer.parseInt(aResult[1]));
                    return address;
                }
                ++attempt;
            }     
            return null;
        } finally {
            socket.close();
        }
    }
    
    private void sendFileSocket(Address serverAddress, File file) throws Exception {              
        new SwingWorker<String, Long>() {
            @Override
            protected String doInBackground() throws Exception {
                btnSelecionarArquivo.setEnabled(false);
                rbDropbox.setEnabled(false);
                rbGoogleDrive.setEnabled(false);
                rbOneDrive.setEnabled(false);
                Socket socket;
                byte[] sendData = new byte[1024];
                if (file != null ) {
                    /* Inicializacao de socket TCP */
                    socket = new Socket(serverAddress.getIpAddress(), serverAddress.getPortNumber());

                    FileInputStream in = new FileInputStream(file);
                    OutputStream out = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(out);
                    BufferedWriter writer = new BufferedWriter(osw);
                    writer.write(file.getName() + "\n");
                    writer.flush();
                    long sizeFile = file.length();            
                    int sizeBuffer = 4096; // buffer de 4KB  
                    arquivoPB.setMaximum(100);
                    totalLB.setText("Total: " + sizeFile + "B");
                    enviadoLB.setText("Enviado: 0B");
                    byte[] buffer = new byte[sizeBuffer];
                    int reads = -1;  
                    double acumPercent = 0;
                    long acumRead = 0;
                    while ((reads = in.read(buffer, 0, sizeBuffer)) != -1) {  
                        acumPercent += (reads * 100.0) / sizeFile;
                        acumRead += reads;
                        publish(Math.round(acumPercent), acumRead);
                        out.write(buffer, 0, reads); 
                    }  
                    socket.close();
                    Thread.sleep(800);
                    publish(100L, sizeFile);
                    return "Success";
                }  
                publish(0L);
                return "Failed";
            }
            @Override
            protected void process(List<Long> chunks) {
                long percent = chunks.get(0);
                long value = chunks.get(1);
                enviadoLB.setText("Enviado: " + value + "B");
                arquivoPB.setValue((int) percent);
                arquivoPB.setString(percent + "%");
            }
            @Override
            protected void done() {
                try {
                    if ("Success".equals(get())) {
                        JOptionPane.showMessageDialog(Client.this, "Envio concluído", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(Client.this, "Falha ao enviar arquivo - Arquivo não informado", "Erro na finalização do envio", JOptionPane.ERROR);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Client.this, ex.getMessage(), "Erro na finalização do envio", JOptionPane.ERROR);
                } finally {
                    btnSelecionarArquivo.setEnabled(true);
                    rbDropbox.setEnabled(true);
                    rbGoogleDrive.setEnabled(true);
                    rbOneDrive.setEnabled(true);
                    totalLB.setText("Total: 0B");
                    enviadoLB.setText("Enviado: 0B");
                    arquivoPB.setValue(0);
                    arquivoPB.setString("0%");
                }
;
            }
        }.execute();
    }
    
    private File openFile() {
        JFileChooser openFile = new JFileChooser();
        openFile.setAcceptAllFileFilterUsed(false);
        openFile.setDialogType(JFileChooser.OPEN_DIALOG);
        if (openFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return openFile.getSelectedFile();
        }
        return null;
    }        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar arquivoPB;
    private javax.swing.ButtonGroup btnGroupServer;
    private javax.swing.JButton btnSelecionarArquivo;
    private javax.swing.JLabel enviadoLB;
    private javax.swing.JPanel panelServer;
    private javax.swing.JRadioButton rbDropbox;
    private javax.swing.JRadioButton rbGoogleDrive;
    private javax.swing.JRadioButton rbOneDrive;
    private javax.swing.JLabel totalLB;
    // End of variables declaration//GEN-END:variables
}
