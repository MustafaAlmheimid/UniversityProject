/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Course {

    //private String intstructorName;
    private String courseName;
    private String courseNumber;
    private String courseSemester;
    private String credit;
    private int courseAverage;
    private int numberOfStudents;
    private ArrayList<Etudient> students;

    public Course(String courseName, String courseNumber,
            String courseSemester, String credit) {
        //  super();
        // this.intstructorName = intstructorName;
        this.credit = credit;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseSemester = courseSemester;
        this.students = new ArrayList<Etudient>();
//       this.courseAverage = 0;
//        this.numberOfStudents = 0;
    }

    public void print() {
        System.out.println("Course{" + "courseName=" + courseName + ", courseNumber=" + courseNumber + ", courseSemester=" + courseSemester + ", credit=" + credit + ", courseAverage=" + courseAverage + ", numberOfStudents=" + numberOfStudents + ", students=" + students + '}');

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setStudents(ArrayList<Etudient> students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public String getCredit() {
        return credit;
    }

    public ArrayList<Etudient> getStudents() {
        return students;
    }

}
