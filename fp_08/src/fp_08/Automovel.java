/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

import Enum.Condicao;
import Enum.Origem;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author dmanu
 */
public class Automovel extends Veiculo{
    
    private int occupantsNumber;
    private int doorsNumber;

    public Automovel(int occupantsNumber, int doorsNumber, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }

    public Automovel(int occupantsNumber, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = 3;
    }

    public void listarAutomovel(){
        
        System.out.println("***AUTOMOVEL***");
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
        System.out.println("Número de Portas: " + this.doorsNumber);
        System.out.println("Número de Lugares: " + this.occupantsNumber);
        System.out.println("Número do chassis: " + this.getVin());
        System.out.println();
    }
    
   
    public double getPrice(){
        if(super.getCondition() == Condicao.novo){
            return super.getPrice();
        }
        else{
            return super.getPrice() - (super.getPrice() * 0.30);
        }
    }
}
