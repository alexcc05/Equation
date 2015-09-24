package equation;

import java.util.Scanner;
public class ParameterEquationDialog {

    public ParameterEquationDialog() {
    }
    private Equation equation;
    
    
    public void execute(){
        Scanner read= new Scanner(System.in);
        System.out.println("Por favor introduzca la variable a: ");
        float a= read.nextFloat();
        System.out.println("Por favor introduzca la variable b: ");
        float b= read.nextFloat();
        System.out.println("Por favor introduzca la variable c: ");
        float c= read.nextFloat();
        
        equation= new Equation(a,b,c);
        
    }
    public Equation getEquation(){
        return equation;
    }
        
   

}
