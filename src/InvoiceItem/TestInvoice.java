package InvoiceItem;

public class TestInvoice {

    public static void main(String[] args) {

        InvoiceItem item = new InvoiceItem("S44", "soap", 5, 8);
        System.out.println(item);
        item.setQty(30);
        item.setUnitPrice(44);
        System.out.println(item.getTotal());

    }
}
