import jp.ac.uryukyu.ie.e225761.*;
public class main {
    public static void main(String[] args) throws Exception {
        student oosiro = new student("oosiro", "61");
        student satou = new student("さとう", "01");
        student yamada = new student("山田", "02");
        System.out.println(oosiro.getName());
        student[] member = {oosiro, satou, yamada};

        attend teacher = new attend(member);
        //teacher.addAbsence();
        //System.out.println(oosiro.getAbsence());
        
        //以下の三行はatendanceのテスト
        System.out.println(oosiro.getAbsenceADay());
        //teacher.atendance();
        System.out.println(oosiro.getAbsenceADay());
        for (int i = 0; i < 5 ;i++){//i < __ の部分には授業回数を入れる
            teacher.clearabsence();
            teacher.atendance();
            teacher.addAbsence();
        }
        
        System.out.println(oosiro.getAbsence());
    }
    
}
