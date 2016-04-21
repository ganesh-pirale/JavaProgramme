/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.mypackage.exceptionhandlig;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Ganesh
 */
public class Computer {

    private int screen;
    private int[] refs = new int[5];
    private String[] parts = {"mouse", "keyboard", "battery"};

    public int getScreen() {
        return this.screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public void showPart(int position) {
        try {
            // open db connection 
            System.out.println("Part is " + parts[position]); // throw new ArrayIndexOutOfBoundException(); // unhandled exception, unchecked
            // close db
        } catch (Exception e) {
            System.out.println("in catch 0");
        } finally {
            // close db
            System.out.println("in finally");
        }
        System.out.println("show p[art");
    }

    public void showSimple() throws IOException {
        FileWriter writer = new FileWriter("");
    }
    
    public void mobileNumber(String mobile) /*throws MyException*/{
        
        if(mobile.length() > 10) try {
            throw new MyException();
        } catch (MyException ex) {
            Logger.getLogger(Computer.class.getName()).log(Level.SEVERE, null, ex);
           // throw ex;
        }
        
        System.out.println("Mobile Number");
    }
}