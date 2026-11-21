class Main{
    public static void main(String[] args) {
        BankAccount bk = new BankAccount(1234567,"Rupa", 10000);

        bk.deposit(5000);
        bk.withdraw(2000);
        System.out.println(bk.getBalance());
           bk.withdraw(20000);
           bk.deposit(-12);
           System.out.println(bk.getBalance());
    }
}