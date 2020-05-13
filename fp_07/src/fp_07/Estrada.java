/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_07;
 
import Enum.Material;
import Enum.Travoes;

/**
 *
 * @author dmanu
 */
public class Estrada extends Bicicleta{
    
    private String guias;
    private double tamQuadro;
    private String observacoes;
    

    public Estrada(String guias, double tamQuadro, String observacoes, int id, int numOfGears, String cor, double rodaTam, double preco, int garantia) {
        super(id, numOfGears, cor, rodaTam, Travoes.hidraulicos, Material.carbono, preco, garantia);
        this.guias = guias;
        this.tamQuadro = tamQuadro;
        
        if(observacoes.length() <= 50){
            
            this.observacoes = observacoes;
        }
        else{
            this.observacoes = observacoes.substring(0,50);
        }
    }
    
    public void listarBikeE(){
        
        System.out.println("Guias" + this.guias);
        System.out.println("Tamanho Quadro" + this.tamQuadro);
        System.out.println("Observações" + this.observacoes);
        System.out.println(super.getCor());
        System.out.println(super.getGarantia());
        System.out.println(super.getId());
        System.out.println(super.getMaterial());
        System.out.println(super.getNumOfGears());
        System.out.println(super.getPreco());
        System.out.println(super.getRodaTam());
        System.out.println(super.getTravoes());
    }
    
    public void setTravoes(Travoes travoes){
        
       super.setTravoes(travoes);
    }

}
