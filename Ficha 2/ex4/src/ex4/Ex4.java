/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author dmanu
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int vogal = 0;
        int consoante = 0;
        
        for (int i = 4; i < nome.length; i++){
            System.out.print(nome[i]); 
        }
        
        for (int j = 0; j < nome.length; j++){
            if (nome[j] == 'a' || nome[j] == 'e' || nome[j] == 'i' || nome[j] == 'o' || nome[j] == 'u' || nome[j] == 'A'){
                ++vogal;
                
            }else if(nome[j] != ' '){
                ++consoante;
            }
        }
        System.out.println(vogal);
        System.out.println(consoante);
                       
          
    }
}
