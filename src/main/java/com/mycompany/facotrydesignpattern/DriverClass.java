 
package com.mycompany.facotrydesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) {
        TV myTV = new TVSetFactory().getInstance("4K");
        
        myTV.specs();
    }
    
}
