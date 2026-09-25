class Cash extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment: Cash");
        System.out.println("Payment successful!");
    }
}