package jp.ac.uryukyu.ie.e225761;
import java.util.ArrayList;

public class attend {
    ArrayList studentList;

    /*public attend(ArrayList studentlist){
        this.studentList = studentlist;
    }*/

    public void addAbsence(student absencStudent){
        absencStudent.setAbsence(absencStudent.getAbsence() + 1);
    }
}
