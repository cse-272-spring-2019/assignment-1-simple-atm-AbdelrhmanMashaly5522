
public class Account {
    String balance="0";

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

public void deposite(String money){
    int y=Integer.parseInt(money);
    int x=Integer.parseInt(balance);
    x+=y;
    balance=Integer.toString(x);
}
public void withdraw(String money){
    int y = Integer.parseInt(money);
    int x = Integer.parseInt(balance);
    if(x<y){
        System.out.println("error");
    }
    else x-=y;
    balance = Integer.toString(x);
}
    public Account(String balance) {
        this.balance=balance;
    }
    
}
