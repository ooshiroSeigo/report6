package jp.ac.uryukyu.ie.e225761;
/**
 * 生徒の名前、学籍番号、欠席・遅刻の回数をフィールドにもつクラス
 */
public class student {
    private String name;
    private String number;
    private int absence = 0;
    private boolean absenceADay = false;
    /**
     * コンストラクタ：名前と学籍番号を定義
     * @param name　生徒の名前
     * @param number　生徒の学籍番号
     */
    public student(String name, String number){
        this.name = name;
        this.number = number;
    }
    /**
     * 名前のゲッター
     * @return フィールドのname
     */
    public String getName(){
        return this.name;
    }
    /**
     * 学籍番号のゲッター
     * @return フィールドのnumber
     */
    public String getNumber(){
        return this.number;
    }
    /**
     * 欠席・遅刻の回数のセッター
     * @param absence
     */
    public void setAbsence(int absence){
        this.absence = absence;
    }
    /**
     * 欠席・遅刻の回数のゲッター
     * @return
     */
    public int getAbsence(){
        return this.absence;
    }
    public boolean getAbsenceADay(){
        return this.absenceADay;
    }
    public void setAbsenceADay(boolean absenceADay){
        this.absenceADay = absenceADay;
    }
    
}
