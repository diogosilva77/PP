/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;
import Enum.TrailerType;
/**
 *
 * @author dmanu
 */
public class Reboque extends Trailer{
    
    private TrailerType trailer;

    public Reboque(TrailerType trailer, int axesNumber, double load) {
        super(axesNumber, load);
        this.trailer = trailer;
    }

    

   
    
    
}
