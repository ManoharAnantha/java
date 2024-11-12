package java1.java2.java3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        return 0;
    }
}

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age, o2.age);
    }

}

public class charan {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(
                List.of(1, 2, 3, 4, 5));
        Collections.sort(l);

        List<Student> stus = new ArrayList<>(List.of(
                new Student("Sai", 25),
                new Student("Manohar", 66),
                new Student("Sunil", 24),
                new Student("Suresh", 22),
                new Student("Pavan", 23)));

        System.out.println(stus);
        Collections.sort(stus, new StudentNameComparator());
        System.out.println(stus);

        Collections.sort(stus, new StudentAgeComparator());
        System.out.println(stus);

    }
}


