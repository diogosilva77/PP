/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HipermarketService;

    import SuperMarket.SuperMarket;
    
/**
 *
 * @author Diogo Silva 8170332
 */
public abstract class Hipermarket extends SuperMarket implements HipermarketService{

    private double coffeePrice;
    private double gasPrice;
    private double potatoesPrice;
    private double rate;

    public Hipermarket(double coffeePrice, double gasPrice, double potatoesPrice, double rate, String name, int number) {
        super(potatoesPrice, name, number);
        this.coffeePrice = coffeePrice;
        this.gasPrice = gasPrice;
        this.potatoesPrice = potatoesPrice;
        this.rate = rate;
    }

    @Override
    public double getGasPrice() {
        return gasPrice;
    }

    @Override
    public void setPrice(double preco) {
        this.gasPrice = preco;
    }
    /**
     * 
     * @param litres 
     * @return o preco total do gas
     */
    @Override
    public double getGasTotal(double litres) {
        return this.gasPrice * litres;
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }
    
    /**
     *Metodo setter 
     * @param precoCoffee 
     */
    @Override
    public void setCoffeePrice(double precoCoffee) {
        this.coffeePrice = precoCoffee;
    }

    /**
     *Metodo para obter preco total dos cafes
     * @param coffes recebe o numero de cafes
     * @return o preço total dos cafes
     */
    @Override
    public double getCoffeeTotal(int coffes) {
        return this.coffeePrice * coffes;
    }

    @Override
    public double getAnnualRate(){
        
        return rate;
    }
    
    @Override
    public void setAnnualRate(double rate){
        
        this.rate = rate;
    }
    
    @Override
    public double computeMonthlyPayment(double ammount, int months){
        
        double taxaMensal = Math.pow((1 + this.rate), 1/12) - 1;
        
        return ((taxaMensal * ammount) / (1 - (Math.pow((1 + taxaMensal), - months))));
        
    }
    
    public abstract int getPoints(double purchaseValue);

}

    

