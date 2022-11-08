public class h5
{
    private double balance;
    private double method;
 public void mastery(double x){
     balance=x;


 }
    public void deposits(double y){
     method=y;
     this.balance=balance+method;

    }


 public void withdraws(double w){
    method=w;
     this.balance=balance-method;


 }

 public double getBalance(){
     return balance;
 }



}
