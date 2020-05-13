/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_08;

    import Enum.Origem;
    import Enum.Condicao;
    import java.time.LocalDate;
    import java.util.ArrayList;
    import Enum.TruckType;
    import Enum.TrailerType;
/**
 *
 * @author dmanu
 */
public class VeiculoDemo {

    
    public static void main(String[] args) {
        
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Trailer> trailer = new ArrayList<>();
        Veiculo veiculo1 =  new Automovel(5, 5, 1453, "VW", "Golf", LocalDate.now(), Origem.imported, 20.5, Condicao.usado, 12500);
        Veiculo veiculo2 =  new Automovel(2, 5678, "BMW", "M4", LocalDate.now(), Origem.national, 0, Condicao.novo, 47500);
        Veiculo motociclo1 = new Motociclo(125, 20.5, 423, "Ducati", "Z2", LocalDate.now(), Origem.imported, 72.3, Condicao.usado, 14250);
        Veiculo motociclo2 = new Motociclo(200, 20.5, 423, "Ducati", "Z3", LocalDate.now(), Origem.national, 272.3, Condicao.usado, 25000);
        Trailer trailer1 = new Reboque(TrailerType.open, 5, 50000.1);
        Veiculo pesado1 = new Pesado(35.8, 3788.32, TruckType.truck, trailer1, 14, "MAN", "chines", LocalDate.now(), Origem.national, 0, Condicao.novo, 123000);
        
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(motociclo1);
        veiculos.add(motociclo2);
        trailer.add(trailer1);
        veiculos.add(pesado1);
        ((Automovel)veiculo1).listarAutomovel();
        //((Automovel)veiculo2).listarAutomovel();
        //((Motociclo)motociclo1).listarMotociclo();
        //((Motociclo)motociclo2).listarMotociclo();
        ((Pesado)pesado1).listarPesado();
        
        for(int i=0; i<veiculos.size(); i++){
            
            System.out.println(veiculos.get(i).getPrice());
        }
        
        
    }
    
}
