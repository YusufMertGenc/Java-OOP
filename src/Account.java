import java.util.Date;

public class Account {
    private int accountID;
    private double accountBalance;

    private Date dateCreated;

    public Account() {
        this.accountID = 0;
        this.accountBalance = 0;

    }

    public Account(int accountID, double accountBalance) {
        this.accountID = accountID;
        this.accountBalance = accountBalance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }



    public Date getDateCreated() {
        return dateCreated;
    }



    public void withdraw(double withdrawAmount){
        if (withdrawAmount>this.accountBalance){
            System.out.println("Insufficient Balance!");
        }
        else
        {this.accountBalance = accountBalance- withdrawAmount;
            System.out.println("Withdraw is succesful!");}
    }

    public void deposit (double depositAmount){
        this.accountBalance += depositAmount;
    }

}
