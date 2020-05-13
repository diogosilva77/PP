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
public abstract class Hipermarket extends SuperMarket implements HipermarketService{
    
    private double coffeePrice;
    private double gasPrice;
    private double potatoesPrice;
    private double rate;
    public Hipermarket(double taxaAnual, double potatoesPrice, String name, int number) {
        super(potatoesPrice, name, number);
        this.taxaAnual = taxaAnual;
    }


    @Override
    public double getMarketTotal(double kilos) {
        return 0;
    }

    @Override
    public void setPotatoesPrice(double potatoesPrice) {
    }

    @Override
    public double getPotatoesPrice() {
        return 0;
    }

    @Override
    public double getGasTotal(double litres) {
        return 0;
    }

    @Override
    public void setPrice(double preco) {
    }

    @Override
    public double getGasPrice() {
        return 0;
    }

    @Override
    public double getCoffeePrice() {
        return 0;
    }

    @Override
    public void setCoffeePrice(double precoCoffee) {
    }

    @Override
    public double getCoffeeTotal(int coffes) {
        return 0;
    }

    private double taxaAnual;
    
    @Override
    public double getAnnualRate(){
        
        return this.taxaAnual;
    }
    
    @Override
    public void setAnnualRate(double rate){
        
        this.taxaAnual = rate;
    }
    
    @Override
    public double computeMonthlyPayment(double ammount, int months){
        
        double taxaMensal = Math.pow((1 + this.taxaAnual), 1/12) - 1;
        
        return ((taxaMensal * ammount) / (1 - (Math.pow((1 + taxaMensal), - months))));
        
    }
    
    public abstract int getPoints(double purchaseValue);
}

    

