
public class Main {

    public static void main(String[] args) {

        // ==================================
        // 1. PAYMENT PROCESSING
        // ==================================

        Payment[] payments = {

            new UpiPayment(),

            new CardPayment(),

            new NetBankingPayment()
        };

        System.out.println(
            "========== PAYMENT PROCESSING =========="
        );

        for (Payment payment : payments) {

            payment.pay(1000);

            payment.printReceipt();

            System.out.println();
        }


        // ==================================
        // 2. REFUND PROCESSING
        // ==================================

        Refundable[] refundablePayments = {

            new UpiPayment(),

            new CardPayment()
        };

        System.out.println(
            "========== REFUND PROCESSING =========="
        );

        for (Refundable payment : refundablePayments) {

            payment.refund(200);
        }


        // ==================================
        // 3. INVALID PAYMENT TEST
        // ==================================

        System.out.println(
            "\n========== INVALID PAYMENT TEST =========="
        );

        try {

            Payment payment = new UpiPayment();

            payment.pay(-500);

        } catch (IllegalArgumentException exception) {

            System.out.println(exception.getMessage());
        }


        // ==================================
        // 4. INVALID REFUND TEST
        // ==================================

        System.out.println(
            "\n========== INVALID REFUND TEST =========="
        );

        try {

            Refundable payment = new CardPayment();

            payment.refund(0);

        } catch (IllegalArgumentException exception) {

            System.out.println(exception.getMessage());
        }
    }
}
