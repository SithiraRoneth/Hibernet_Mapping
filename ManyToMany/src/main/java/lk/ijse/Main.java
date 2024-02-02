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
        Student student = new Student();
        student.setId(1);
        student.setName("Sithira");
        student.setAddress("Thalahena");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Nadil");
        student2.setAddress("Banadaragama");

        List<Student>studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);

        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setModel("Asus");

        List<Laptop>laptopList = new ArrayList<>();
        laptopList.add(laptop);

        laptop.setStudent(studentList);
        student.setLaptop(laptopList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(student2);
        session.save(laptop);
        transaction.commit();
        session.close();
    }
}