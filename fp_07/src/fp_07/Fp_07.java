/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_07;

import Enum.BikeTools;
import Enum.Material;
import Enum.Suspensao;
import Enum.Travoes;
/**
 *
 * @author dmanu
 */
public class Fp_07 {

    
    public static void main(String[] args) {
        
        Estrada BikedoAlmeida = new Estrada("Guia1", 4.3, "Sem selim", 1, 7, "Cor de Rosa", 20.2, 1050.87, 2);
        Montanha BikedoPedro = new Montanha(3, Suspensao.dupla, 69, 9, "Amarelo", 69.69, Travoes.hidraulicos, Material.aluminio, 45, 10);
        BikedoPedro.setBikeTools(BikeTools.garrafaAgua);
        BikedoPedro.setBikeTools(BikeTools.contaKM);
        //BikedoAlmeida.listarBikeE();
        //BikedoPedro.listarBikeM();
        //System.out.println();
        //BikedoPedro.setBikeTools(BikeTools.reparacaoPneu);
        //BikedoPedro.setBikeTools(BikeTools.telemovel);
        //BikedoPedro.setBikeTools(BikeTools.alforje);
        //BikedoPedro.setBikeTools(BikeTools.reparacaoPneu);
        //BikedoPedro.setCor("azul");
        //BikedoPedro.setTravoes(Travoes.pincas);
        //System.out.println();
        //BikedoPedro.listarBikeM();
        BycicleManagement loja = new BycicleManagement();
        System.out.println();
        loja.setLoja(BikedoPedro);
        //MountainBike teste = new mountainBike("");
        
    }
    
}
