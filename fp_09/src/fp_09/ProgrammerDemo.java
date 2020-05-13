/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_09;

    import Enum.ContractType;
    import Enum.Habilitacao;
    import java.time.LocalDate;
    import Enum.ProgrammerType;
    import java.time.Month;
/**
 *
 * @author dmanu
 */
public class ProgrammerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Administrativo("FFF", ContractType.PARTIAL, Habilitacao.MESTRADO, LocalDate.now(), "25/05/2022", "Almeida", "15/02/2222", "Rua", 34535, 345, 100);
        Pessoa p2 = new JavaProgrammer(1, 3, "fghfh", ProgrammerType.SENIOR, "Almeida", "15/02/2222", "Rua", 34535, 345, 100);
        Pessoa p3 = new ProjectManager(2, LocalDate.of(2018, Month.APRIL, 28), "Diogo", "15/02,15", "ghfdgh", 34254252,3434, 100);
        ((ProjectManager)p3).addProject("P1");
        System.out.println(p3.SalarioFinal());
        
        
    }
}
