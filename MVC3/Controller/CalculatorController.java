package MVC3.Controller;

import MVC3.Model.Calculator;

public class CalculatorController {

    public CalculatorController(){

    }

    public int add(int a, int b){
        return Calculator.add(a,b);
    }

    public int subtract(int a, int b){
        return Calculator.subtract(a,b);
    }

    public float divide(int over, int under){
        return Calculator.divide(over,under);
    }

    public int multiply(int a, int b) throws Exception {
        return Calculator.multiply(a,b);
    }
}
