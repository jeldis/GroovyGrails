/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jeldis

import groovy.sql.Sql

public class GroovyWSTest{
    
    public static void main(String[] args){
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Hola")
        }
        
        println("Help ".execute().getClass().name)
    }
    
    
}