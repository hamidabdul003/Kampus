package School.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students.
 * Using ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpend=0;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudent() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public static void updateTotalMoneySpend(int moneySpendt) {
        totalMoneySpend-=moneySpendt;
    }
}
