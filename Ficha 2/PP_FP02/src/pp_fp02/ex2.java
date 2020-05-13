/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp02;

/**
 *
 * @author dmanu
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] lista = {{11, 7, 333},{-20, -23, 63},{ -22, 501, 10000}};
        int soma = 0;
        int media = 0;
        
        for (int i=0; i < lista.length; i++){
            for (int j=0; j < lista.length; j++){
                soma += lista[i][j];
            }
        }
        media = soma/lista.length;   
        System.out.println("Soma = "+ soma);
        System.out.println("Media = "+ media);
        
        }
        
    }
   
   
