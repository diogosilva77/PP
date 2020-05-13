/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HipermarketService;

/**
 *
 * @author dmanu
 */
public interface CreditService {
    
    public double getAnnualRate();
    
    public void setAnnualRate(double rate);
    
    public double computeMonthlyPayment(double ammount, int months);
}
