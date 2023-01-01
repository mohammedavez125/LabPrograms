package Lab__Internals.P4;

//B) Write a Java program to implement serialization concept.

import java.io.*;

class Employee implements Serializable {
    String name;
    String address;
    int age;
}

class Serdemo {
    public static void main(String[] args) throws Exception{
        Employee emp = new Employee();
        emp.name = "John";
        emp.address = "Hyderabad";
        emp.age = 24;
        FileOutputStream out = new FileOutputStream("new.txt");
        ObjectOutputStream obj = new ObjectOutputStream(out);
        obj.writeObject(emp);
        obj.close();
        out.close();
        System.out.println("data saved to file");
        Employee emp2 = null;
        FileInputStream in = new FileInputStream("new.txt");
        ObjectInputStream ob = new ObjectInputStream(in);
        emp2 = (Employee) ob.readObject();
        System.out.println("Emp name : " + emp2.name + "\nAddress : " + emp2.address + "\nage : "+emp2.age); 
        ob.close();
        in.close();
        System.out.println("Exception has occured while fetching data");
    }
}
