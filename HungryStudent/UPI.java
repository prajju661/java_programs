class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment: UPI");
        System.out.println("Payment successful!");
    }
}