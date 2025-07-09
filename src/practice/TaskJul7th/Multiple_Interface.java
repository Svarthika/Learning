package practice.TaskJul7th;

public class Multiple_Interface {
    public static void main(String[] args) {
        document d = new document();
        d.show();
        d.print();
    }
}


interface  Printable{
    void print();
    }

interface  showable{
    void show();
}

class document implements Printable, showable{

    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");

    }
}