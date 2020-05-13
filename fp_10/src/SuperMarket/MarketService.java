/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMarket;

    
/**
 *
 * @author Diogo Silva 8170332
 */
public interface MarketService {
    
    public double getPotatoesPrice();
    
    public void setPotatoesPrice(double potatoesPrice);
    
    public double getMarketTotal(double kilos);
}
