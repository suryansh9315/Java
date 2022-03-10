package com.company.oops.Generics.ObjectCompare;

public class Student implements Comparable<Student> {
    int marks;
    int rollno;

    public Student(int marks, int rollno) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return marks + " " + rollno;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
    }
}
