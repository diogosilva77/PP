/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

/**
 *
 * @author dmanu
 */
public class SemiReboque extends Trailer{
    
    private int num_pneus_sub;

    public SemiReboque(int num_pneus_sub, int axesNumber, double load) {
        super(axesNumber, load);
        this.num_pneus_sub = num_pneus_sub;
    }

 
    
    
}
