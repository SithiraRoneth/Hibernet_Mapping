package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.Entity.Laptop;
import lk.ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setModel("Asus");

        Laptop laptop2 = new Laptop();
        laptop2.setId(2);
        laptop2.setModel("Acer");

        List<Laptop>laptopList = new ArrayList<>();
        laptopList.add(laptop);
        laptopList.add(laptop2);

        Student student = new Student();
        student.setId(1);
        student.setName("Sihtira");
        student.setAddress("Thalahena");
        student.setLaptop(laptopList);

        laptop.setStudent(student);
        laptop2.setStudent(student);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop);
        session.save(laptop2);
        session.save(student);

        transaction.commit();
        session.close();
    }
}