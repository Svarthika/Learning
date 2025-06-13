package TernaryOperators;

public class NestedTernary {
    public static void main(String[] args) {
        int Marks =79;
        String grade;

        grade = (Marks<40)?"Fail":((Marks>=40&&Marks<60)?"Grade C":(Marks>=60&&Marks<75)?"Grade B":(Marks>=75&&Marks<=90)?"Grade A":"A+");
        System.out.println(grade);

    }
}
