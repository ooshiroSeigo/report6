package jp.ac.uryukyu.ie.e225761;
public class main {
    public static void main(String[] args) throws Exception {
        student oosiro = new student("oosiro", "61");
        System.out.println(oosiro.getName());

        attend teacher = new attend();
        teacher.addAbsence(oosiro);
        System.out.println(oosiro.getAbsence());

    }
    
}
