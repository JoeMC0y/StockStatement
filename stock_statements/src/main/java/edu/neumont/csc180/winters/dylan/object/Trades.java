package edu.neumont.csc180.winters.dylan.object;

public class Trades {
    private String buySell;
    private String symbol;
    private long shares;
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
    
    public long getShares(){
        return shares;
    }

    public void setShares(long shares){
        this.shares = shares;
    }

    
    public double getSharePrice(){
        return sharePrice;
    }

    public void setSharePrice(double price){
        sharePrice = price;
    }

    
    public double getTotal(){
        setTotal();
        return total;
    }

    public void setTotal(){
        this.total = shares * sharePrice;
    }
}
