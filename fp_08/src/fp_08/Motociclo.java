/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

import Enum.Condicao;
import Enum.Origem;
import java.time.LocalDate;


/**
 *
 * @author dmanu
 */
public class Motociclo extends Veiculo{
    
    private double cubicCapacity;
    private double whellSize;

    public Motociclo(double cubicCapacity, double whellSize, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.cubicCapacity = cubicCapacity;
        this.whellSize = whellSize;
    }
    
     public void listarMotociclo(){
        
        System.out.println("***MOTOCICLO***");
        System.out.println("------------------------------------");
        System.out.println("ID: " + super.getId());
        System.out.println("Marca: " + super.getBrand());
        System.out.println("Modelo: " + super.getModel());
        System.out.println("Data de Fabrico: " + super.getManufacturingDate());
        System.out.println("KMs: " + super.getKms());
        System.out.println("Preço: " + super.getPrice());
        System.out.println("Origem: " + super.getOrigin());
        System.out.println("Condição: " + super.getCondition());
        System.out.println("------------------------------------");
        System.out.println("*Informações Adicionais*");       
        System.out.println("Cilindrada " + this.cubicCapacity);
        System.out.println("Diametro das Rodas: " + this.whellSize);
        System.out.println("Número do chassis: " + this.getVin());
        System.out.println();
    }
    
   
}
