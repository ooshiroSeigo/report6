package jp.ac.uryukyu.ie.e225761;

public class student {
    private String name;
    private String number;
    private int absence = 0;

    public student(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }
    public String getNumber(){
        return this.number;
    }
    public void setAbsence(int absence){
        this.absence = absence;
    }
    public int getAbsence(){
        return this.absence;
    }
}
