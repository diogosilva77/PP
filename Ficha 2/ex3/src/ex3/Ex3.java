/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author dmanu
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int mult = 1;
        int contador = 0;
        int maior = 0;
        maior = lista[0];
        
        for (int i = 0; i < lista.length; i++){
            if(lista[i] > 0){
                mult *= lista[i];
            }
            else{
                contador++;
            }
        
        }
        System.out.println("Multiplicação = " +mult);
        System.out.println("Números negativos = " +contador);
       
        for (int j = 0; j < lista.length; j++){
            if(lista[j] > lista[0]){
                maior = lista[j];
               
            }
        
        }
        System.out.println("Maior Número = " +maior);
    }
}
