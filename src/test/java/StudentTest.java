import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StudentTest {
    private Student[] students;
    @BeforeAll
    void initclass(){
        students = new Student[3]; // Creating an array of 3 students for testing
        students[0] = new Student("Alif", 20);
        students[1] = new Student("Bima", 21);
        students[2] = new Student("Caca", 22);
    }
    @Test
    void testGetName() {
        // Test method getName() untuk periksa setiap siswa
        assertEquals("Alice", students[0].getName());
        assertEquals("Bob", students[1].getName());
        assertEquals("Charlie", students[2].getName());
    }

    @Test
    void TestGetAge() {
        // Test the getAge() method for each student
        assertEquals(20, students[0].getAge());
        assertEquals(21, students[1].getAge());
        assertEquals(22, students[2].getAge());
    }

    @Test
    void TestEnrollCourse() {
    }

    @Test
    void TestGetEnrolledCourses() {
    }

    @Test
    void TestSetGrade() {
    }

    @Test
    void TestGetGrade() {
    }
    @AfterAll
    static void cleanClass() {
    }

}