package Account;

public class TestAccount {

    public static void main(String[] args) throws Exception {

        Account acc1 = new Account("A10", "raj", 1000);
        Account acc2 = new Account("A12", "simran");
        System.out.println(acc2.credit(100));
        System.out.println("Account holder " + acc1.getName() + "'s balance is " + acc1.debit(1200));
        System.out.println("Account holder " + acc1.getName() + "'s balance is " + acc1.transferTo(acc2, 150));
        System.out.println(acc1);
        System.out.println(acc2);

    }
}

class MyException extends Exception {
    MyException() {
        System.out.println("Transfer failed due to debiting amount exceeding account balance");
    }
}
