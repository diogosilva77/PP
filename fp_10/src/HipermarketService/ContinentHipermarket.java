/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HipermarketService;

    import java.util.Calendar;    
   
/**
 *
 * @author Diogo Silva 8170332
 */

public class ContinentHipermarket extends Hipermarket{

    public ContinentHipermarket(double coffeePrice, double gasPrice, double potatoesPrice, double rate, String name, int number) {
        super(coffeePrice, gasPrice, potatoesPrice, rate, name, number);
    }

    @Override
    public int getPoints(double purchaseValue) {
        Calendar c = Calendar.getInstance();
        double less20 = ((1 * purchaseValue) / 5);
        double more21 = ((3 * purchaseValue) / 20);

        if (c.get(Calendar.DAY_OF_MONTH) < 21) {
            return (int) less20;
        } else if (c.get(Calendar.DAY_OF_MONTH) > 20) {
            return (int) more21;
        }
        return 0;
    }

}
