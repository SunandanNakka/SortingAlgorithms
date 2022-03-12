package ComparatorUsage.UserDefinedClass;

import java.util.Comparator;

public class Student {
    public static final Comparator<Student> SortByName = new NameComparator();
    public static final Comparator<Student> SortByRollNo = new RollNoComparator();
    public static final Comparator<Student> SortBySubject = new SubjectComparator();

    private String name;
    private Integer rollNo;
    private String subject;

    public Student(String name, int rollNo, String subject) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", subject='" + subject + '\'' +
                '}';
    }

    private static class NameComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.name.compareTo(b.name);
        }
    }

    private static class RollNoComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.rollNo.compareTo(b.rollNo);
        }
    }

    private static class SubjectComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.subject.compareTo(b.subject);
        }
    }
}
