package School.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy",500);
        Teacher mellisa = new Teacher(2, "Mellisa",700);
        Teacher vanderson = new Teacher(3, "Vanderson",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderson);

        Student tamasha = new Student(1, "Tamasha",4);
        Student tasya = new Student(2, "Tasya",12);
        Student robi = new Student(3, "Robi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(tasya);
        studentList.add(robi);

        School ghs = new School(teacherList,studentList);

        tamasha.payFees(5000);
        tasya.payFees(6000);
        System.out.println("GHS has earned : $"+ghs.getTotalMoneyEarned());

        System.out.println("-----Making SCHOOL PAY SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to "+lizzy.getName()
        +" and now has "+ghs.getTotalMoneyEarned());
    }
}
