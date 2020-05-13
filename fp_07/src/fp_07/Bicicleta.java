/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_07;

import Enum.Material;
import Enum.Travoes;
/**
 *
 * @author dmanu
 */
public class Bicicleta {
    
    private int id;
    private int numOfGears;
    private String cor;
    private double rodaTam;
    private Travoes travoes;
    private Material material;
    private double preco;
    private int garantia;

    public Bicicleta(int id, int numOfGears, String cor, double rodaTam, Travoes travoes, Material material, double preco, int garantia) {
        this.id = id;
        this.numOfGears = numOfGears;
        this.cor = cor;
        this.rodaTam = rodaTam;
        this.travoes = travoes;
        this.material = material;
        this.preco = preco;
        this.garantia = garantia;
    }

    public int getId() {
        return id;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public String getCor() {
        return cor;
    }

    public double getRodaTam() {
        return rodaTam;
    }

    public Travoes getTravoes() {
        return travoes;
    }

    public Material getMaterial() {
        return material;
    }

    public double getPreco() {
        return preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodaTam(double rodaTam) {
        this.rodaTam = rodaTam;
    }

    public void setTravoes(Travoes travoes) {
        this.travoes = travoes;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
    
    
}
