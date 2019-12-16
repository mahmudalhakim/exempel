package MVC3.Model;

public class Calculator {

    public static float divide(int over, int under){
        return (float)over/(float)under;
    }

    public static int multiply(int a, int b) throws Exception {
        if(a * b > Integer.MAX_VALUE){
            throw new Exception("a mutiplied by b is over Integer.MAX_Value");
        }
        return a*b;
    }

    public static int add(int a, int b){
        //oskyddad
        return a + b;
    }

    public static int subtract(int a, int b){
        //oskyddad
        return a - b;
    }
}
