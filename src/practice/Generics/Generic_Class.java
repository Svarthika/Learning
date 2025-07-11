package practice.Generics;
public class Generic_Class{
    public static void main(String[] args) {

        GenericClass g = new GenericClass();
        g.setData("test");
        g.setData(234);
        g.setData(45.678d);
        System.out.println(g.getData());
    }

}


 class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    GenericClass(){
        System.out.println("DC");
    }
}
