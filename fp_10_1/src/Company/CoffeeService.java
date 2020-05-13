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
public interface CoffeeService {
    
    public double getCoffeePrice();
    
    public void setCoffeePrice(double precoCoffee);
    
    public double getCoffeeTotal(int coffes);
}
