package ecceptionsource;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.printDivide(1,2);
            calculator.printDivide(1,0); //If second value is zero, the result will be infinity;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void printDivide(double d1, double d2) throws Exception{
            if (d2 == 0) {
                throw new Exception("Second value can't Zero");
            }
        double result = d1 / d2;
        System.out.println(result);
    }
}
