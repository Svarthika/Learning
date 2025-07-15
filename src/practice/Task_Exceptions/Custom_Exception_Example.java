package practice.Task_Exceptions;

public class Custom_Exception_Example {
    public static void main(String[] args) throws CurrencyMisMatchCustomException {
       Bank sbi = new Bank("inr", 100);
       Bank icici = new Bank("inr",123);
       int total = sbi.add(icici);
        System.out.println(total);

        Bank jp_chase = new Bank("USD",101);
        int total_new = sbi.add(jp_chase);
        System.out.println(total_new);
    }
}
