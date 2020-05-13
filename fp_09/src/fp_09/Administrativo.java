/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_09;

    import Enum.ContractType;
    import Enum.Habilitacao;
    import java.time.LocalDate;

/**
 *
 * @author dmanu
 */
public class Administrativo extends Pessoa{
    
    private String sigla;
    private ContractType contractType;
    private  Habilitacao habilitacao;
    private LocalDate beginContract;
    private String endContract;

    public Administrativo(String sigla, ContractType contractType, Habilitacao habilitacao, LocalDate beginContract, String endContract, String name, String birthDate, String address, int cc, int vatNumber, double baseSalary) {
        super(name, birthDate, address, cc, vatNumber, baseSalary);
        this.sigla = sigla;
        this.contractType = contractType;
        this.habilitacao = habilitacao;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }

    public double SalarioFinal(){
        
        if(this.habilitacao == Habilitacao.LICENCIATURA){
            
            return (super.getBaseSalary() + (super.getBaseSalary() * 0.10));
        }else{
            if(this.habilitacao == Habilitacao.MESTRADO){
               return (super.getBaseSalary() + (super.getBaseSalary() * 0.20));
                
            }else{
                return (super.getBaseSalary() + (super.getBaseSalary() * 0.30));
            }
        }
    }
 
}