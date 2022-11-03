 
package com.mycompany.facotrydesignpattern;


public class DriverClass {
    
    public static void main(String[] args) {
        
        // use the factory class to get an instance of a 4k tv
        TV myTV = new TVSetFactory().getInstance("4K");
        
        myTV.specs();
    }
    
}
