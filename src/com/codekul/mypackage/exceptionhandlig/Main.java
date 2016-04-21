/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.mypackage.exceptionhandlig;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganesh
 */
public class Main {

    public static void main(String[] args)  throws MyException{

        Computer computer = new Computer();
        computer.showPart(10);
        
        try {
            computer.showSimple();
            System.out.println("Success");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error");
        }
        
        try {
            computer.mobileNumber("9w490w8693086");
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        
         computer.mobileNumber("9w490w8693086");
        
        
    }
}
