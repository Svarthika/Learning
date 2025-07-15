package practice.Task_jul11_list;

import java.util.ArrayList;

public class Students {

    private String name;
    private String rollNo;


        public Students(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Students s1= new Students("Amit", "101");
        Students s2= new Students("Amar", "102");
        Students s3= new Students("Akbar", "103");

        ArrayList<Students> al = new ArrayList<Students>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        s1.PrintDetails();
        s2.PrintDetails();


    }
    public void PrintDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Rollno: "+this.rollNo);
    }
}
