/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

/**
 *
 * @author dmanu
 */
public class Company {
   
    private String name;
    private int number;

    public Company(String name, int number) {
        this.name = name;
        this.number = number;
    }
    /**
     * @return devolve o nome da empresa
     * */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return devolve o numero de contribuinte
     **/
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

}
