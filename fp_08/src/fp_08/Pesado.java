/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

    import Enum.Condicao;
    import Enum.Origem;
    import Enum.TruckType;

    import java.time.LocalDate;
/**
 *
 * @author dmanu
 */
public class Pesado extends Veiculo{
    
    private double length;
    private double load;
    private TruckType truckType;
    private Trailer trailer;

    public Pesado(double length, double load, TruckType truckType, Trailer trailer, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailer = trailer;
    }

    public Pesado(double length, double load, TruckType truckType, int vin, String brand, String model, LocalDate manufacturingDate, Origem origin, double kms, Condicao condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.truckType = truckType;
        this.trailer = null;
    }
    
    public void listarPesado(){
        
        System.out.println("***PESADO***");
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
        if(this.trailer instanceof SemiReboque){
            System.out.println("Tipo de Trailer: Semi Reboque");
        }
            else{
                System.out.println("Tipo de Trailer: Reboque");   
                    }
        System.out.println("Tipo de Truck: " + this.truckType);
        System.out.println("Número do chassis: " + this.getVin());
        System.out.println("Tamanho: " + this.length);
        System.out.println("Capacidade: " + this.load);
        System.out.println();
    }
    
    public double getPrice(){
        if(this.trailer != null && super.getCondition() == Condicao.novo){
            return super.getPrice() - super.getPrice() * 0.05;
        }
        else{
            if(this.trailer == null && super.getCondition() == Condicao.novo){
                return super.getPrice();
            }
            else{
                return super.getPrice() - super.getPrice() * 0.15;
            }
        }
    }
}
