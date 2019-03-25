package comPractice;

import exception.OverDraftException;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 17:19 2018/10/31
 *@Modified By:
 */
public class CheckingAccount extends Account {
    double overDraftProtection;

     CheckingAccount() {
    }

    CheckingAccount(double balance) {
        this.balance = balance;
    }
    CheckingAccount(double balance, double overDraftProtection) {
        this.balance = balance;
        this.overDraftProtection = overDraftProtection;
    }

    public void withdraw(double amt) throws OverDraftException{
        if (this.balance + this.overDraftProtection < amt) {
            throw new OverDraftException("超过账户额度", amt - this.overDraftProtection - this.balance);
        } else if (this.balance < amt) {
            this.balance = 0;
            this.overDraftProtection -= amt - this.balance;
        } else {
            this.balance -= amt;
        }

    }

    public static void main(String[] args) {
        CheckingAccount checkA = new CheckingAccount(1000.1,1000.111);
        try {
            checkA.withdraw(3000);

        } catch (OverDraftException E) {
            System.out.println(E.getMessage());
            E.printStackTrace();
        }

    }
}
