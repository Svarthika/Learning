package practice.polymorphism.overloading;

public class printer {

    int printData(int data)
    {
        System.out.println("Print Data Int!");
        return data;
    }
    String printData(String data)
    {
        System.out.println("Print String type data!");
        return data;
    }
    float printData(float data)
    {
        System.out.println("Print Datatype float!'");
        return data;
    }

}
class print{
    public static void main(String[] args) {
        printer p = new printer();
        System.out.println(p.printData(98));
        System.out.println(p.printData("Overloading demo with different paramaneters"));
        System.out.println(p.printData(98.876f));
    }
}