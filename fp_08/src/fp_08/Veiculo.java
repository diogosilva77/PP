/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

    import Enum.Origem;
    import Enum.Condicao;
    import Enum.TruckType;

    import java.time.LocalDate;
/**
 *
 * @author dmanu
 */
public class Veiculo {
    
    private int id;
    private int vin;
    private String brand;
    private String model;
    static LocalDate manufacturingDate;
    private Origem origin;
    private double kms;
    private Condicao condition;
    private int price;
    private static int ID;

    public Veiculo(int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.condition = condition;
        this.price = price;
        this.id = this.ID;
        this.ID++;
    }

    public int getId() {
        return id;
    }

    public int getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public static LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public Origem getOrigin() {
        return origin;
    }

    public double getKms() {
        return kms;
    }

    public Condicao getCondition() {
        return condition;
    }

    public static int getID() {
        return ID;
    }
   
    public double getPrice() {
        return (double)price;
    }
    
    
    

}
