
public class NetBankingPayment implements Payment {

    @Override
    public void pay(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Invalid payment amount"
            );
        }

        System.out.println(
            "Net Banking payment successful: " + amount
        );
    }

    @Override
    public void printReceipt() {

        System.out.println(
            "Net Banking receipt generated"
        );
    }
}
