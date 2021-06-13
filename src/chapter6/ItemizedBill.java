package chapter6;

/**
 * HOMEWORK: Itemized bill
 */
public class ItemizedBill {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();
    }
}
