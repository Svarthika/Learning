package practice.polymorphism.overloading;

   class multiply {

      int product(int a, int b){
          return a*b;
      }

      int product(int a, int b, int c){
          return a*b*c;
      }

}

public class MathOperations {

      public static void main(String[] args) {
          multiply m  = new multiply();
          int result = m.product(87,76);
          int result1 = m.product(4, 78,90);
          System.out.println(result);
          System.out.println(result1);
      }

  }

