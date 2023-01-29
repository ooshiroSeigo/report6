package jp.ac.uryukyu.ie.e225761;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class attendTest {
    @Test void testAddAbsence() {
        student demoStudent = new student("oosiro", "61");
        System.out.println(demoStudent.getName());
        student[] demo = {demoStudent};
        attend teacher = new attend(demo);
        teacher.addAbsence();
        System.out.println(demoStudent.getAbsence());        
        assertEquals(1, demoStudent.getAbsence());
}
}