/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMarket;

import Company.Company;

/**
 *
 * @author dmanu
 */
public class SuperMarket extends Company implements MarketService{
    
    private double potatoesPrice;

    public SuperMarket(double potatoesPrice, String name, int number) {
        super(name, number);
        this.potatoesPrice = potatoesPrice;
    }


    @Override
    public double getPotatoesPrice() {
        
        return this.potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double potatoesPrice) {
        
        this.potatoesPrice = potatoesPrice;
    }

    @Override
    public double getMarketTotal(double kilos) {
        
        return this.getPotatoesPrice() * kilos;
    }
}
