package jp.ac.uryukyu.ie.e225761;
import java.util.Map;
import java.util.Scanner;
import java.security.Timestamp;
import java.util.HashMap;

public class attend {
    private Map <String, student> studentdict = new HashMap<>();
    student[] allstudent;
    public attend(student[] all_Student){
        this.allstudent = all_Student;
        for (int i = 0; i < all_Student.length; i++){
            this.studentdict.put(all_Student[i].getNumber(),all_Student[i]);
        }
    }
    /**
     * studentクラスのabsenceに+1するメソッド
     * @param absencStudent　欠席・遅刻した生徒
     */
    public void addAbsence(){
        for (student st : this.allstudent){
            if (st.getAbsenceADay() == false){
                st.setAbsence(st.getAbsence() + 1);
                judgeF(st);
            }
        }
    }

    public void atendance(){
        Scanner scanner = new Scanner(System.in);
        long timelimit = System.currentTimeMillis() + (10 * 1000);
        while (true){
            long time = System.currentTimeMillis();
            if (time > timelimit){
                System.out.println("出席できる時間を過ぎました。");
                break;
            }
            System.out.println("学籍番号を入力してください。");
            String atendnum = scanner.next();
            if (atendnum.equals("q")){break;}
            this.studentdict.get(atendnum).setAbsenceADay(true);
        }
    }
    public void clearabsence(){
        for (int i = 0;i < this.allstudent.length;i++ ){
            this.allstudent[i].setAbsenceADay(false);
        }
    }
    public void judgeF(student judgeedStudent){
        if (judgeedStudent.getAbsence() >= 5){
            System.out.println("5回以上欠席・遅刻したのでこの授業は不可になりました。");
        }
    }
}
