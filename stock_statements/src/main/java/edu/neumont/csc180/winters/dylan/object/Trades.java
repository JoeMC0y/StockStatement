package edu.neumont.csc180.winters.dylan.object;

public class Trades {
    private String buySell;
    private String symbol;
    private int shares;
    private double sharePrice;
    private double total;


    public String getBuySell(){
        return buySell;
    }

    public void setBuySell(String type){
        buySell = type;
    }


    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    
    public int getShares(){
        return shares;
    }

    public void setShares(int shares){
        this.shares = shares;
    }

    
    public double getSharePrice(){
        return sharePrice;
    }

    public void setSharePrice(double price){
        sharePrice = price;
    }

    
    public double getTotal(){
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }
}
