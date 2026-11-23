public class UpiPayment implements Payment, Refundable{

    @Override 
    public void pay(double amount){
               if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Invalid payment amount"
            );
        }
  
      System.out.println("UPI payment successful: " + amount);
    }

     @Override 
    public void printReceipt(){
      System.out.println("UPI receipt generated");
    }
    @Override
    public void refund(double amount) {

        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Invalid refund amount"
            );
        }

        System.out.println(
            "UPI refund successful: " + amount
        );
    }

}
