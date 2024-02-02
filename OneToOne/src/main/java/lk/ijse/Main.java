package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.Entity.Laptop;
import lk.ijse.Entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setModel("Asus");

        Student student = new Student();
        student.setId(1);
        student.setName("Sithira");
        student.setAddress("Thalahena");
        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop);
        session.save(student);

        transaction.commit();
        session.close();
    }
}