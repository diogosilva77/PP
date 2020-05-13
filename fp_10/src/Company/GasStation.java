/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;
/**
 *
 * @author dmanu
 */
public class GasStation extends Company implements GasService {
    
    private double preco;
   
    
    public GasStation(double preco, String name, int number) {
        super(name, number);
        this.preco = preco;
        
    }
    
    @Override
    public double getGasPrice(){
        return this.preco;
    }
    
    @Override
    public void setPrice(double preco){
        
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Preço maior que 0");
        }
    }
    
    @Override
    public double getGasTotal(double litres){
        return this.preco * litres;
    }
    
}
