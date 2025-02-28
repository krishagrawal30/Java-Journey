/*Write a program to implement multiple inheritance.
Consider a class BankAccount with data members as account number, aadhar number,
owner name, ROI and balance with member functions openAccount(),
deposit(amount),closeAccount() and updateInterest(). Create an interface Debitable which 
has method withdraw().
Derive a class FixedDepositAccount from BankAccount having data member lockInPeriod.
Override methods updateInterest() to update Simple Interest, and method closeAccount()
to charge 5 % for closure of FD Account before lockInPeriod.
Derive a class SavingAccount from class BankAccount and interface Debitable.
The account numbers should be serial numbers of 5 digit and automatically assigned on
object creation, such that all FDAccounts start with 55 and all Saving account start with 11.
[ROI for Saving Account is 4% and for FD – 1-2yrs-6% ; 2-5yrs-6.5% ; >5yrs- 7%]*/
// KRISH AGRAWAL    E1_17
interface Debital
{
	void withdraw(int amt);
}
class BankAccount
{
	double balance;
    long acc;
    String adhar;
	String Owner;
	double roi;
    public BankAccount(){};
	public BankAccount(long acc, String adhar, String Owner, double roi)
	{
		this.acc = acc;
		this.adhar = adhar;
		this.Owner = Owner;
		this.roi = roi;
	}
	void openaccount()
    {
        System.out.println("Bank account opened successfully with acoount no: "+acc);
    }
    void deposit(int amount)
    {
        balance = amount;
        System.out.println(balance  + "/- Rupees deposited successfully.....");
    }
    void closeAccount()
    {
        System.out.println("Your account was closed with balance: "+acc);
    }
    void updateInterest()
    {
        double interest = balance*(roi/100);
        balance = balance + interest;
    }
}
class SavingAccount extends BankAccount implements Debital
{
    public SavingAccount(long acc)
    {
        this.acc = acc;
    }
    @Override
    public void updateInterest()
    {
        roi = 4;
        super.updateInterest();
    }
    @Override
    public void withdraw(int amt)
    {
        balance =  balance-amt;
    }
}
class FixedDepositAccount extends BankAccount 
{
	int lockInPeriod;
    public FixedDepositAccount(long acc, int lockInPeriod)
    {
        this.acc = acc;
        this.lockInPeriod = lockInPeriod;
    }
    @Override
    public void updateInterest()
    {
        if(lockInPeriod>= 1 && lockInPeriod <= 2)
        {
            roi=6;
        }
        else if(lockInPeriod>=2 && lockInPeriod <=5)
        {
            roi=6.5;
        }
        else if(lockInPeriod>5)
        {
            roi=7;
        }
        super.updateInterest();
    }
    public void closeAccount()
    {
        if(lockInPeriod>0)
        {
            balance = balance - 5*balance/100;
        }
        super.closeAccount();
    }
}
public class prac5
{
	public static void main(String[] args) 
    {
        BankAccount B = new BankAccount(55192,"546748301864","Krish Agrawal" ,0);
        B.openaccount();
        B.deposit(5000);
        B.closeAccount();

        SavingAccount sav = new SavingAccount(11545);
        sav.openaccount();
        sav.deposit(6000);
        sav.updateInterest();
        sav.withdraw(500);
        sav.closeAccount();

        FixedDepositAccount fd = new FixedDepositAccount(55231, 6);
        fd.openaccount();
        fd.deposit(7000);
        fd.updateInterest();
        fd.closeAccount();
    }
}