public class Calculator {
       public int add(int a, int b) {
           return a + b;
       }

       public static void main(String[] args) {
           Calculator calculator = new Calculator();
           System.out.println("2 + 3 = " + calculator.add(2, 3));
       }
   }
   
