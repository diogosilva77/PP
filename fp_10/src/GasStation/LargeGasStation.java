/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GasStation;

import Company.GasStation;

/**
 *
 * @author dmanu
 */
public class LargeGasStation extends GasStation implements CoffeeService {

    private double precoCoffee;

    public LargeGasStation(double precoCoffee, double preco, String name, int number) {
        super(preco, name, number);
        this.precoCoffee = precoCoffee;
    }
    
    @Override
    public double getCoffeePrice() {
        return this.precoCoffee;
    }
    @Override
    public void setCoffeePrice(double precoCoffee) {
        this.precoCoffee = precoCoffee;
    }
    
    @Override
    public double getCoffeeTotal(int coffes){
        
        return this.getCoffeePrice() * coffes;
    }
    
    @Override
    public String toString(){
        return "Preço Café: " + this.precoCoffee;
    }
}
    
  
