/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projet;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class App {

    static ArrayList<Etudient> E = new ArrayList<>();
    static ArrayList<Course> C = new ArrayList<Course>();

    static void initialCourse() {
        Course c1 = new Course("Data Structur", "I2206", "4", "5");
        Course c2 = new Course("Computer Architecture", "I2207", "4", "4");
        Course c3 = new Course("Computer Networks", "I2208", "4", "4");
        Course c4 = new Course("Logical programming", "I2209", "4", "4");
        Course c5 = new Course("Database1", "I2210", "4", "5");
        Course c6 = new Course("Java", "I2211", "5", "4");
        Course c7 = new Course("InfoGraphics", "I2233", "3", "4");

        C.add(c1);
        C.add(c2);
        C.add(c3);
        C.add(c4);
        C.add(c5);
        C.add(c6);
        C.add(c7);

    }

    static void initial() {
        Etudient e1 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "90");
        Etudient e2 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "70");
        Etudient e3 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "80");
        Etudient e4 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "60");
        Etudient e5 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "70");
        Etudient e6 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "50");
        Etudient e7 = new Etudient("Mustafa", "Almheimid", "01-01-2003", "105457", "45");

        C.get(0).getStudents().add(e1);
        C.get(1).getStudents().add(e2);
        C.get(2).getStudents().add(e3);
        C.get(3).getStudents().add(e4);
        C.get(4).getStudents().add(e5);
        C.get(5).getStudents().add(e6);
        C.get(6).getStudents().add(e7);

    }

    static void initial1() {

        Etudient e1 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "60");
        Etudient e2 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "80");
        Etudient e3 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "40");
        Etudient e4 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "30");
        Etudient e5 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "70");
        Etudient e6 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "50");
        Etudient e7 = new Etudient("HIBA", "Esber", "01-01-2003", "105550", "45");

        C.get(0).getStudents().add(e1);
        C.get(1).getStudents().add(e2);
        C.get(2).getStudents().add(e3);
        C.get(3).getStudents().add(e4);
        C.get(4).getStudents().add(e5);
        C.get(5).getStudents().add(e6);
        C.get(6).getStudents().add(e7);

    }

    static void initial2() {

        Etudient e1 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "90");
        Etudient e2 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "70");
        Etudient e3 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "80");
        Etudient e4 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "60");
        Etudient e5 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "70");
        Etudient e6 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "50");
        Etudient e7 = new Etudient("Adraa", "Aladraa", "01-01-2003", "109647", "45");

        C.get(0).getStudents().add(e1);
        C.get(1).getStudents().add(e2);
        C.get(2).getStudents().add(e3);
        C.get(3).getStudents().add(e4);
        C.get(4).getStudents().add(e5);
        C.get(5).getStudents().add(e6);
        C.get(6).getStudents().add(e7);

    }

    static void initial3() {

        Etudient e1 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "70");
        Etudient e2 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "50");
        Etudient e3 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "50");
        Etudient e4 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "30");
        Etudient e5 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "86");
        Etudient e6 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "67");
        Etudient e7 = new Etudient("Hussein", "Abdallah", "01-01-1998", "107456", "79");

        C.get(0).getStudents().add(e1);
        C.get(1).getStudents().add(e2);
        C.get(2).getStudents().add(e3);
        C.get(3).getStudents().add(e4);
        C.get(4).getStudents().add(e5);
        C.get(5).getStudents().add(e6);
        C.get(6).getStudents().add(e7);

    }

    public static void main(String[] args) {

        initialCourse();
        initial();
        initial1();
        initial2();
        initial3();
        Courses f3 = new Courses(E, C);
        Student f1 = new Student(E, C);

        AddCourse f = new AddCourse(E, C);

        Home f4 = new Home(E, C);
        f4.setVisible(true);
//        f3.setVisible(true);
//        f1.setVisible(true);
//        f.setVisible(true);

    }
}
