package jp.ac.uryukyu.ie.e225761;
import java.util.Map;
import java.util.HashMap;

public class attend {
    private Map <student, Boolean> studentdict = new HashMap<>();

    /*public attend(ArrayList studentlist){
        this.studentList = studentlist;
    }*/
    /**
     * studentクラスのabsenceに+1するメソッド
     * @param absencStudent　欠席・遅刻した生徒
     */
    public void addAbsence(student absencStudent){
        absencStudent.setAbsence(absencStudent.getAbsence() + 1);
    }
    /**
     * 授業に参加している生徒のリストを作成する
     * @param entryStudentList　授業に参加している生徒の配列
     */
    public void entryStudent(student[] entryStudentList){
        for (int i = 0; i < entryStudentList.length;i++ ){
            studentdict.put(entryStudentList[i] , false);
        }
    }
    
}
