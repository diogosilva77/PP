/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author dmanu
 */
public enum Condicao {
    
    novo, usado;
    
    public String ConditionType(Condicao condition){
        
        switch(condition){
            
            case novo:
                return "Novo";
                
            case usado:
                return "Usado";
        }
        return null;
    }
}
