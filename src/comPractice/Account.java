package comPractice;

import exception.OverDraftException;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 16:22 2018/10/31
 *@Modified By:
 */
public class Account {

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected double balance;//余额

    public void Account() {

    }

    public void Account(double amt) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        this.balance+=amt;
    }

    public void withdraw(double amt) throws OverDraftException {
        if (this.balance < amt) {
            throw new OverDraftException("余额不足", amt - this.balance);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) {
        Account accoutTest = new Account();
        accoutTest.setBalance(1000);
        try {
            accoutTest.withdraw(2000);

        } catch (OverDraftException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
