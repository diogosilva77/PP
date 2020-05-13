/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_09;

    import java.time.LocalDate;
    import java.time.Month;
    import java.time.Period;
/**
 *
 * @author dmanu
 */
public class ProjectManager extends Pessoa{
    
    protected int code;
    protected static int numberOfProjects;
    protected LocalDate contractDate;
    protected String[]Projects;

    public ProjectManager(int code, LocalDate contractDate, String name, String birthDate, String address, int cc, int vatNumber, double baseSalary) {
        super(name, birthDate, address, cc, vatNumber, baseSalary);
        this.code = code;
        this.contractDate = contractDate;
        this.Projects = new String[5];
        this.numberOfProjects = 0;
    }

    public double SalarioFinal(){
        
        LocalDate data = LocalDate.now();
        Period p = Period.between(contractDate, data);
        
        int contractYears = p.getYears();
        System.out.println(contractYears);
        double salarioFinal = super.getBaseSalary() * 1.15;
        
        salarioFinal += (salarioFinal * 0.015) * contractYears;
        salarioFinal += this.numberOfProjects * (0.01 * salarioFinal);
        
        return salarioFinal;
    }
    
    public void addProject(String Projeto){
        
        this.Projects[this.numberOfProjects] = Projeto;
        this.numberOfProjects++;
        
    }
}
