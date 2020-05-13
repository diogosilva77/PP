/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_07;

import Enum.BikeTools;
import Enum.Material;
import Enum.Suspensao;
import Enum.Travoes;

public class Montanha extends Bicicleta {
    
    private int numLuzes;
    private Suspensao suspensao;
    private BikeTools[] bikeTools;
    private int numTools = 0;
    private static final int MAX_Tools = 5;

    public Montanha(int numLuzes, Suspensao suspensao, int id, int numOfGears, String cor, double rodaTam, Travoes travoes, Material material, double preco, int garantia) {
        super(id, numOfGears, cor, rodaTam, travoes, material, preco, garantia);
        this.numLuzes = numLuzes;
        this.suspensao = suspensao;
        this.bikeTools = bikeTools;
        this.bikeTools = new BikeTools[MAX_Tools];
    }

    public BikeTools[] getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(BikeTools bikeTools) {
        
        boolean repetido = false;
        
        if(numTools < MAX_Tools){
            for(int i=0; i < numTools; i++){
                if(this.bikeTools[i] == bikeTools){
                    System.out.println("Ja existe!");
                    repetido = true;
                }  
            }
            if(repetido == false){
                this.bikeTools[numTools] = bikeTools;
                numTools++;
            }
        }
        else{
            System.out.println("Cheio!");
        }
    }
    
     public void listarBikeM(){
        
        System.out.println("Numero de luzes: " + this.numLuzes);
        System.out.println("Suspensao: " + this.suspensao);
        listarTools();
        System.out.println(super.getCor());
        System.out.println(super.getGarantia());
        System.out.println(super.getId());
        System.out.println(super.getMaterial());
        System.out.println(super.getNumOfGears());
        System.out.println(super.getPreco());
        System.out.println(super.getRodaTam());
        System.out.println(super.getTravoes());
    }
     
    public void listarTools(){
        
        for(int i = 0; i < numTools; i++){
            System.out.println("Tool n " + (i+1) + " " + bikeTools[i]);
        }
    }
    
    public void removerTools(BikeTools bikeTools) {

        for (int i = 0; i < numTools; i++) {

            if (this.bikeTools[i] == bikeTools) {
                for (int j = i; j < numTools - 1; j++) {
                    this.bikeTools[i] = this.bikeTools[i + 1];
                    numTools--;
                }
            }
        }
    }
    
   
    

}
