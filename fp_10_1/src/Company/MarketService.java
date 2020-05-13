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
public interface MarketService {
    
    public double getPotatoesPrice();
    
    public void setPotatoesPrice(double potatoesPrice);
    
    public double getMarketTotal(double kilos);
}
