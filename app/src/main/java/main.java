import jp.ac.uryukyu.ie.e225761.*;
public class main {
    public static void main(String[] args) throws Exception {
        student oosiro = new student("oosiro", "61");
        student satou = new student("さとう", "01");
        student yamada = new student("山田", "02");
        System.out.println(oosiro.getName());

        attend teacher = new attend();
        teacher.addAbsence(oosiro);
        System.out.println(oosiro.getAbsence());
        
        student[] studentlist = {oosiro,satou,yamada};
        teacher.entryStudent(studentlist);
    }
    
}
