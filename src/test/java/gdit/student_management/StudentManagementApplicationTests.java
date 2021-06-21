package gdit.student_management;

import gdit.student_management.dao.StudentDao;
import gdit.student_management.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagementApplicationTests {
    @Autowired
    StudentDao studentDao;

    @Test
    void contextLoads() {
    }
//    @Test
//    public void testStudentUpdate(){
//        System.out.println("testStudentupdate");
//        Student student=studentDao.getBySid(104190430);
//        System.out.println(student);
//        student.setSmajor("国防技术");
//        studentDao.update(student);
//        System.out.println(student);
//    }
    @Test
    public void testStudentDelete(){
        System.out.println("testStudentdelete");
        System.out.println(studentDao.delete(104190430));

    }

}
