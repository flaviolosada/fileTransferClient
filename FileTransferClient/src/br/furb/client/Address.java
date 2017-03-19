/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.client;

/**
 *
 * @author usuario
 */
public class Address {
    private String ipAddress;
    private int portNumber;

    public Address() {
        
    }

    public Address(String ipAddress, int portNumber) {
        this.setIpAddress(ipAddress);
        this.setPortNumber(portNumber);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
    
    
    
}
