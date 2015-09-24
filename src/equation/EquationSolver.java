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
public class EquationSolver {
    private final Equation equation;

    public EquationSolver(Equation equation) {
        this.equation = equation;
    }
    
    public float solver1(){
        if(equation.getA()==0){
            return 0;
        }
        if(Math.sqrt(Math.pow(equation.getB(),2)
                -4*equation.getA()*equation.getC())>0){
            return (float) (((-1*equation.getA())+ Math.sqrt(Math.pow(equation.getB(),2)
                -4*equation.getA()*equation.getC()))/(2*equation.getA()));
        }else{
            return ((-1*equation.getA())/(2*equation.getA()));
        }
       
       
    }  
    public float solver2(){
        if(equation.getA()==0){
            return 0;
        }
        if(Math.sqrt(Math.pow(equation.getB(),2)
                -4*equation.getA()*equation.getC())>0){
            return (float) (((-1*equation.getA())- Math.sqrt(Math.pow(equation.getB(),2)
                -4*equation.getA()*equation.getC()))/(2*equation.getA()));
        }else{
            return (-1*equation.getA())/(2*equation.getA());
        }
       
    }    



}
