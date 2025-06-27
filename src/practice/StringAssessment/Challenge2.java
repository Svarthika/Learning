package practice.StringAssessment;

public class Challenge2 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2 = "hello";
        String s3= "Hello";
        String.valueOf(s1);

        System.out.println(s1);
                System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s3);
        System.out.println(s3.compareTo(s2));
    }
}
