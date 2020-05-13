/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

    import java.time.DayOfWeek;
    import java.time.LocalDate;

/**
 *
 * @author dmanu
 */
public class JumbHipermarket extends Hipermarket{

    public JumbHipermarket(double taxaAnual, double potatoesPrice, String name, int number) {
        super(taxaAnual, potatoesPrice, name, number);
    }
    
    @Override
    public int getPoints(double purchaseValue) {
        
        LocalDate date = LocalDate.now();
        DayOfWeek day = DayOfWeek.from(date);
        int points, valor;
        
        if(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY){
            
            valor = (int) (purchaseValue / 10);
            points = 1 * valor;
        }
        else{
            valor = (int) (purchaseValue / 10);
            points = 3 * valor;
        }
        return points;
    }
}
