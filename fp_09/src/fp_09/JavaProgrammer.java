/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_09;

    import Enum.ProgrammerType;
/**
 *
 * @author dmanu
 */
public class JavaProgrammer extends Pessoa{
    
    private int code;
    private int programmingYears;
    private String projectName;
    private ProgrammerType programmerType;

    public JavaProgrammer(int code, int programmingYears, String projectName, ProgrammerType programmerType, String name, String birthDate, String address, int cc, int vatNumber, double baseSalary) {
        super(name, birthDate, address, cc, vatNumber, baseSalary);
        this.code = code;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
    }
 
    public double SalarioFinal(){
        
        double salarioInicial = (super.getBaseSalary() * 1.05);
        
        if(this.programmerType == ProgrammerType.JUNIOR){
            
           salarioInicial += (salarioInicial * 0.05);
        }else{
            salarioInicial += (salarioInicial * 0.15);
        }
        salarioInicial += (salarioInicial * 0.005) * this.programmingYears;
        
        return salarioInicial;
        
    }
}
