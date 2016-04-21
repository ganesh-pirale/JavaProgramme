/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.mypackage.exceptionhandlig;

/**
 *
 * @author Ganesh
 */
public class MyException extends RuntimeException /*Exception*/{

    @Override
    public String getMessage() {
        return super.getMessage() +"Exception occured due to wrong phone num"; 
    }
}
