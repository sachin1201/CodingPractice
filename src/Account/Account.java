package Account;

public class Account {

    private String id;
    private String name;
    private int balance;

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int credit(int amt) {
        balance = balance + amt;
        return balance;
    }

    public int debit(int amt) throws Exception {
        if(amt <= balance){
                balance = balance - amt;
                return balance;
        }
        else {
            try {
                throw new MyException();
            }
//            catch(Exception e) {
//                System.out.println("Debiting amount exceeded account balance");
//            }
            finally {
                return balance;
            }
        }
    }

    public int transferTo(Account acc2, int amt) throws Exception {
        balance = debit(amt);
        acc2.balance = acc2.balance + amt;
        return balance;
    }


    public String toString() {
        return "Account holder's id is " + id + ", name is " + name + " and balance is " + balance;
    }
}
