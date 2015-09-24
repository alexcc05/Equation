/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

/**
 *
 * @author alex
 */
public class Control {
    
    public static void main(String[] args){
        ParameterEquationDialog aux= new ParameterEquationDialog();
        (aux ).execute();
        EquationDisplay aux2;
        aux2 = new EquationDisplay(
                new EquationSolver(aux.getEquation()));
        aux2.execute();
        
    
    }
 }
