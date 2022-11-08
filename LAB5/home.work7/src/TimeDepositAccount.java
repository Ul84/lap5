public class TimeDepositAccount
{
private double balance,rate;
public TimeDepositAccount(double balance,double rate)
{
    balance=balance;
    rate=rate;

}
public double getBalance(){
    return balance;
}
public void accrueInterest(){
    balance=balance+balance*rate/1000;
}
public void wihtdraw()
{
    balance=0;

}


}
