interface Debitable {
    public void withdraw(int w);
}
class BankAccount{
    double acn , adn , roi , bal;
    String name  ;
    public BankAccount(){}
    public BankAccount(double acn ,double adn ,String name ,double roi ){
        this.acn = acn;
        this.adn = adn;
        this.name = name;
        this.roi = roi;
        this.bal = 0.0 ;

    }
    public void openaccount(){
        System.out.println("Your account is open :" + acn );

    }
    public void deposit(int amm){
        bal = amm;
        System.out.println("your total ammount is = " + bal);
    }

    public void closeAcc(){
        System.out.println("Your account is closed");
    }
    public void updateintrest(){
        double interest = bal*(roi/100);
        bal += interest;
        System.out.println("Interest updated Current balance = "  + bal);

        }

    }
class FixedDeposit extends BankAccount {

    int lockperiod;
    public FixedDeposit(int acn ,int lock){
        this.acn = acn ;
        this.lockperiod = lock;
    }

    @Override
    public void updateintrest() {
        if(lockperiod<2){
        roi = 6;
        super.updateintrest();
    } else if (lockperiod > 2 && lockperiod < 5) {
            roi = 6.5;
            super.updateintrest();
        }
        else {
            roi = 7;
            super.updateintrest();
        }


        }
    }
    class SavingAccount extends BankAccount implements Debitable{
        double acn;
        public SavingAccount(double acn){
            this.acn = acn;

        }
        @Override
        public void withdraw(int w) {
            System.out.println("Amount Withdrawed . Current Balance : " + (bal-w));

        }

        @Override
        public void openaccount() {
            System.out.println("This is your Saving Account : " + acn);
        }

        @Override
        public void updateintrest() {
            roi = 4;
            super.updateintrest();
        }
    }
public class exp5 {
    public static void main(String[] args) {
        BankAccount B = new BankAccount(55222,56431864,"Aryan Bokde" ,100 );
        B.openaccount();
        B.deposit(5000);
        B.closeAcc();
        System.out.println("--------------------------------------------------------------------------------------");
        FixedDeposit F = new FixedDeposit(55223 , 3);
        F.openaccount();
        F.deposit(5000);
        F.updateintrest();
        System.out.println("---------------------------------------------------------------------------------------");
        SavingAccount S = new SavingAccount(11220);
        S.openaccount();
        S.deposit(5000);
        S.updateintrest();
        S.withdraw(200);
    }
}