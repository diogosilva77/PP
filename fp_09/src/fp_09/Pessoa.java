/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_09;

/**
 *
 * @author dmanu
 */
public abstract class Pessoa {
    
    private String name;
    private String birthDate;
    private String address;
    private int cc;
    private int vatNumber;
    private double baseSalary;

    public Pessoa(String name, String birthDate, String address, int cc, int vatNumber, double baseSalary) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.cc = cc;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }
    
    abstract double SalarioFinal();
    

    public double getBaseSalary() {
       return this.baseSalary;
    }
    
    
        
        
}
