package Array_ArrayList;

import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

}

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vikram", 3.6));
        students.add(new Student("Krish", 3.0));
        students.add(new Student("Akriti", 3.0));
        students.add(new Student("Shubham", 4.8));
        students.add(new Student("Ram", 9.6));
        Comparator<Student> compare = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(compare);
        // students.sort((a, b) -> {
        // if (b.getGpa() - a.getGpa() > 0) {
        // return -1;
        // } else if (b.getGpa() - a.getGpa() < 0) {

        // return 1;
        // } else {
        // return 0;
        // }

        // });
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }

    }
}
