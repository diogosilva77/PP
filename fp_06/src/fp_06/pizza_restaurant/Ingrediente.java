/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_06.pizza_restaurant;
import Enum.Origem;
/**
 *
 * @author dmanu
 */
public class Ingrediente {
    
    private int codigo;
    private String nome;
    private Origem origem;
    private float numCal;
    private static int id = 0;

    public Ingrediente(String nome, Origem origem, float numCal) {
        this.codigo = id;
        this.nome = nome;
        this.origem = origem;
        this.numCal = numCal;
        this.id = id++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Origem getOrigem() {
        return origem;
    }

    public float getNumCal() {
        return numCal;
    }
    
    public void listar(){
        
        System.out.println("Id: "+ this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Origem: " + this.origem);
        System.out.println("Numero Calorias: " + this.numCal);
    }
    
    
    
    
    
    
}
