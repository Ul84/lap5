public class h6
{
    private double balance;
    private double interest,amount;
    public h6()
    {
        balance=0;
    }
        public void BankAccount(double balance,double amount){
        this.balance=balance;
        this.amount=amount;

        }
public double addedInterest()
{
       this. interest=balance*amount/100;
balance=balance+interest;


    return balance;
}
public double getBalance (){
        return addedInterest();

}




}
