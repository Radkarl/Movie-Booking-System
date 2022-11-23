public class MakePayment {
 
    // MEMBERS
    private int payment_id;
    private float payment_amount;
    private String payment_status;
    private int payment_date;
    private int payment_customerid;
    // END MEMBERS

    // METHODS
    public boolean comfirmpayment() {
        boolean confirmed = false;
        if (payment_status == "Confirmed") {
            confirmed = true;
            System.out.println("Payment ID: " + payment_id);
            System.out.println("Payment Amount: " + payment_amount);
            System.out.println("Date: " + payment_date);
            System.out.println("Customer ID: " + payment_customerid);
        }
        return confirmed;
    }
    public String cancelpayment() {
        payment_status = "Cancelled";
        return payment_status;
    }
    public int searchpayment() {
        return payment_id;
    }



}
