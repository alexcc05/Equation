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
public class EquationDisplay {
    private  EquationSolver solved;

    public EquationDisplay(EquationSolver solved) {
        this.solved = solved;
    }
    
    
    
    public void execute(){
        System.out.println("Las respuestas a su ecuación es: ");
        System.out.println("x1= " + solved.solver1());
        System.out.println("x2= " + solved.solver2());

        
    }
    
}
