/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_06.pizza_restaurant;

/**
 *
 * @author dmanu
 */
public class Ementa {

    private String Designação;
    private String Descrição;
    private int codigoIdent;
    private String dataInicio;
    private String dataFim;
    private int numPizzas;
    private Pizza [] pizzas;
    private static final int MAX_Pizzas = 10;
    private boolean ativa = false;
    private static int numEmentas = 0;

    /**
     *
     * @param Designação
     * @param Descrição
     * @param codigoIdent
     * @param dataInicio
     * @param dataFim
     */
    public Ementa(String Designação, String Descrição, int codigoIdent, String dataInicio, String dataFim) {
        this.Designação = Designação;
        this.Descrição = Descrição;
        this.codigoIdent = codigoIdent;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.numPizzas = 0;
        this.pizzas = new Pizza [MAX_Pizzas];
        this.numEmentas++;
    }

    /**
     *
     * @return
     */
    public Pizza[] getPizzas() {
        return pizzas;
    }

    /**
     *
     * @param pizzas
     */
    public void setPizzas(Pizza pizzas) {
        
        if(this.numPizzas < MAX_Pizzas){
            this.pizzas [numPizzas]= pizzas;
            this.numPizzas++;
        }
    }

    /**
     *
     * @return
     */
    public int getNumEmentas() {
        return numEmentas;
    }

    /**
     *
     * @param codigo
     */
    public void removerPizza(int codigo){
        
        if(numPizzas == 0){
                System.out.println("Ementa sem pizzas");            
            }
        else{
        
            for (int i = 0; i < numPizzas; i++){
               
                if (pizzas[i].getCodigo() == codigo){

                    if (numPizzas == 1){
                        pizzas[i] = null;
                        numPizzas--;
                    }
                    else{
                        for(int j = i; j < numPizzas-1; j++){
                            pizzas[i] = pizzas[i+1];
                            numPizzas--;
                        }
                    }
                }
            }
        }    
    }    
    
    /**
     *
     */
    public void listarPizzasEmenta(){
        
        for (int i = 0; i < this.numPizzas; i++){
            
            System.out.println("Pizza: "+ (i+1));
            pizzas[i].listar();
        }
        
    }
    
    /**
     *
     * @param ementas
     */
    public void ativarEmenta(Ementa[] ementas){
        
        for(int i = 0; i < this.numEmentas; i++){
            if(ementas[i].ativa == true){
                ementas[i].ativa = false;
            }      
        }
        this.ativa = true;

    }
    
    /**
     *
     * @param ementas
     */
    public void listarEmenta(Ementa[] ementas){
        
        for (int i = 0; i < this.numEmentas; i++){
            System.out.println("Ativa: " + ementas[i].ativa);
            
        }
    }
    
}
