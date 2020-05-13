/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_06.pizza_restaurant;

import Enum.Origem;
import Enum.Tamanho;
/**
 *
 * @author dmanu
 */
public class Restaurant {

    public static void main(String[] args) {
        
        Ingrediente cebola = new Ingrediente("Cebola", Origem.Vegetal, 12);
        Ingrediente tomate = new Ingrediente("Tomate", Origem.Vegetal, 5);
        Pizza QuatroEstacoes = new Pizza(1, "QuatroEstacoes", "caide", 8.50, Tamanho.Média);
        Pizza CincoEstacoes = new Pizza(2, "CincoEstacoes", "meinedo", 12.50, Tamanho.Familiar);
        Ementa BC = new Ementa("Menu Estudante", "Ementa1", 1, "15/01/1887", "16/01/1887");
        System.out.println(BC.getNumEmentas());
        Ementa Mc = new Ementa("Mc", "Ementa2", 2, "16/78/9963", "14/47/2222");
        System.out.println(Mc.getNumEmentas());
        Ementa [] ementas = new Ementa[20];

        QuatroEstacoes.setIngredientes(tomate);
        QuatroEstacoes.setIngredientes(cebola);
        CincoEstacoes.setIngredientes(tomate);
        CincoEstacoes.setIngredientes(cebola);
        Mc.setPizzas(CincoEstacoes);
        //System.out.println(cebola.getCodigo());

        //QuatroEstacoes.listar();
        //QuatroEstacoes.somarCalorias();
        BC.setPizzas(QuatroEstacoes);
        BC.setPizzas(CincoEstacoes);
        //BC.removerPizza(1);
        ementas[0] = BC;
        ementas[1] = Mc;
        ementas[0].ativarEmenta(ementas);
        ementas[0].listarEmenta(ementas);
        ementas[1].ativarEmenta(ementas);
        ementas[1].listarEmenta(ementas);
        
        

        
    }   
}
