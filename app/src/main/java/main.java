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
        
        student[] studentlist = {oosiro,satou,yamada};
        //以下の三行はatendanceのテスト
        System.out.println(oosiro.getAbsenceADay());
        //teacher.atendance();
        System.out.println(oosiro.getAbsenceADay());
        for (int i = 0; i < 5 ;i++){
            teacher.clearabsence();
            teacher.atendance();
            teacher.addAbsence();
        }
        
        System.out.println(oosiro.getAbsence());
    }
    
}
