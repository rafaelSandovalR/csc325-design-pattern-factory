 
package com.mycompany.facotrydesignpattern;


public class TVSetFactory {
    
    public TV getInstance(String str){
        
        // creates a specific tv object based on input
        switch (str){
            case "4K":
            case "8K":
            case "16K":
            case "LED": return new LedTV();
            case "LCD": return new LCDTV();
            case "PLASMA": return new PlasmaTV();
            default: return new CRTTV();
            
        }
    }
    
}
