/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_07;



public class BycicleManagement {
    
    private Bicicleta[] bicicleta;
    private static int numBikes = 0;
    private static final int MAX_Bikes = 20;

    public BycicleManagement() {
        
        this.bicicleta = new Bicicleta[MAX_Bikes];
    }
    
    public void setLoja(Bicicleta bicicleta){
        
        if(numBikes < MAX_Bikes){
            
            this.bicicleta[numBikes] = bicicleta;
            this.numBikes++;
  
        }
    }
    
    public void listarLoja(Bicicleta bicicleta){
        
        for (int i=0; i < numBikes; i++){
            System.out.println("Id: " + this.bicicleta[i].getId());
            System.out.println("Cor: "+ this.bicicleta[i].getCor());
            System.out.println("Number of Gear: " + this.bicicleta[i].getNumOfGears());
            System.out.println("Roda Tamanho: " + this.bicicleta[i].getRodaTam());
            System.out.println("Travões: " + this.bicicleta[i].getTravoes());
            System.out.println("Material: " + this.bicicleta[i].getMaterial());
            System.out.println("Preço: " + this.bicicleta[i].getPreco());
            System.out.println("Garantia: " + this.bicicleta[i].getGarantia());

            if(this.bicicleta[i] instanceof Montanha){
                
                
            }
        }    
    }
}
