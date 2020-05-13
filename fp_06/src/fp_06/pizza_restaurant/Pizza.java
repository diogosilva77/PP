/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_06.pizza_restaurant;
import Enum.Tamanho;

/**
 *
 * @author dmanu
 */
public class Pizza {
    
    private int codigo;
    private String Nome;
    private String Descricao;
    private double preco;
    private Tamanho tamanho;
    private int numIngredientes;
    private Ingrediente []  ingredientes;
    private static final int MAX_Ingredientes = 5;

    public Pizza(int codigo, String Nome, String Descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.numIngredientes = 0;
        this.ingredientes = new Ingrediente [MAX_Ingredientes]; 
            
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente ingredientes) {
        
        if(this.numIngredientes < MAX_Ingredientes){
            this.ingredientes [numIngredientes] = ingredientes;
            this.numIngredientes++;
        }
    }
    
    public void removerIngrediente(int codigo){
        
        for (int i = 0; i < numIngredientes; i++){
            
            if (ingredientes[i].getCodigo() == codigo){
                for(int j = i; j < numIngredientes-1; j++){
                    ingredientes[i] = ingredientes[i+1];
                    numIngredientes--;
                }
            }
        }
    }
    
    public void idIngrediente(int id){
        
        for(int i = 0; i < numIngredientes; i++){
            if(id == ingredientes[i].getCodigo()){
               ingredientes[i].listar();
            }
        }
    }
    
    public void listar(){
        
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Descrição: "+ this.Descricao);
        System.out.println("Nome: " + this.Nome);
        listarIngredientes();
       

    }
    
    public void listarIngredientes(){
        
        for (int i = 0; i < numIngredientes; i++){
            System.out.println("Ingrediente: "+ (i+1));
            ingredientes[i].listar();
        }
    }
    
    public void somarCalorias(){
        
        double soma = 0;
        
        for(int i = 0; i < numIngredientes; i++){
            
            soma += ingredientes[i].getNumCal();
        }
        System.out.println("Número Calorias: "+ soma);
    }

    public int getCodigo() {
        return codigo;
    }
    
    
}
