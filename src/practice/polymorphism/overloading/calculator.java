package practice.polymorphism.overloading;

public class calculator {

        int add(int a, int b){
            return a+b;
        }
        double add(double a, double b){
            return a+b;
        }

        public static void main(String[] args) {
            System.out.println("Overloading exampke");
            calculator s = new calculator();
            int sum1 =s.add(10,789);
            double sum2 =s.add(87.98,67.98);
            System.out.println(sum1);
            System.out.println(sum2);


        }
    }

