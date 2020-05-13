/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HipermarketService;

/**
 *
 * @author Diogo Silva 8170332
 */
public class HipermarketDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hipermarket h1 = new JumbHipermarket(0.50, 1.31, 2.1, 0.23, "Lidl", 2223);
        System.out.println(h1.getPoints(0));
        
    }
    
}
