package edu.neumont.csc180.winters.dylan.object;


import java.util.List;

public class Person {
    private long accNum;
    private String ssn;
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private double beginBalance;
    private List<Trades> trades;
    private double totalCash;
    private double totalStock;


    public long getAccNum(){
        return accNum;
    }

    public void setAccNum(long numb){
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

    public double getBegin(){
        return beginBalance;
    }

    public void setBegin(double beginning){
        beginBalance = beginning;
    }

    public List<Trades> getTrades(){
        return trades;
    }

    public void setTrades(List<Trades> trades){
        this.trades = trades;
    }


    public void addTrade(Trades trade){
        this.trades.add(trade);
    }

    public void delTrade(Trades trade){
        this.trades.remove(trade);
    }

    public double getCash(){
        calculate();
        return totalCash;
    }
    public double getStocks(){
        calculate();
        return totalStock;
    }

    public void calculate(){
        this.totalCash = this.beginBalance;

        this.totalStock = 0;

        for(Trades trade : this.trades){
            if(trade.getBuySell().equals("Sell")){
                totalCash += trade.getTotal();
                totalStock -= trade.getTotal();

            }else if(trade.getBuySell().equals("Buy")){
                totalCash -= trade.getTotal();
                totalStock += trade.getTotal();
            }
        }
    }

}
