package CustomerInvoice;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "rahul", 10);
        System.out.println(customer);
        Invoice inv = new Invoice(55443399, customer, 1000);
        System.out.println(inv.getAmountAfterDiscount());
        System.out.println(inv);
        System.out.println(inv.getAmount());

    }
}
