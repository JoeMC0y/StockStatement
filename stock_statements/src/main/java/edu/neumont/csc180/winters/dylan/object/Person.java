package edu.neumont.csc180.winters.dylan.object;

import java.nio.channels.IllegalSelectorException;
import java.util.List;

public class Person {
    private int accNum;
    private String ssn;
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private double beginBalance;
    private List<Trades> trades;
    private double totalCash;
    private double totalStock;


    public int getAccNum(){
        return accNum;
    }

    public void setAccNum(int numb){
        accNum = numb;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getFName(){
        return fName;
    }

    public void setFName(String fname){
        fName = fname;
    }

    public String getLName(){
        return lName;
    }

    public void setLName(String lname){
        lName = lname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public int getBegin(){
        return accNum;
    }

    public void setBegin(int numb){
        accNum = numb;
    }

    public int getTrades(){
        return accNum;
    }


    public void addTrade(int numb){
        accNum = numb;
    }

    public int delTrade(){
        return accNum;
    }

    public void getCash(int numb){
        accNum = numb;
    }

    public void getStocks(){

    }

    public void calculate(){

    }

}
