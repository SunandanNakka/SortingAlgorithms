package ComparatorUsage.TestingSortingTechniques;

import ComparatorUsage.SortingTechniques.Insertion;
import ComparatorUsage.UserDefinedClass.Student;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SortTheUserDefinedClass {
    private static final Logger logger = LogManager.getLogger(SortTheUserDefinedClass.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Student student1 = new Student("Sunandan", 1, "Mathematics");
        Student student2 = new Student("Dhanush", 2, "Physics");
        Student student3 = new Student("Harshath", 2, "Chemistry");
        Student student5 = new Student("Dhruv", 4, "Statistics");
        Student student4 = new Student("Srikanth", 3, "Economics");

        Student[] students = {student1, student2, student3, student4, student5};

        logger.info("========== Sort By Name ==========");
        Insertion.Sort(students, Student.SortByName);
        for (Student s: students) {
            logger.info(s);
        }

        logger.info("========== Sort By Roll Number ==========");
        Insertion.Sort(students, Student.SortByRollNo);
        for (Student s: students) {
            logger.info(s);
        }

        logger.info("========== Sort By Subject ==========");
        Insertion.Sort(students, Student.SortBySubject);
        for (Student s: students) {
            logger.info(s);
        }
    }
}
