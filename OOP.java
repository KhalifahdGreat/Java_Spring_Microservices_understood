class Calculator {

    public int add(int c, int d){
        return c + d;
    }
}


public class OOP {
    
    public static void main(String args[]){
        // Creating an object of the class
        int num1 = 5;
        int num2 = 7;

        Calculator calc = new Calculator();
        

        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
