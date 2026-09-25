class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Payment: Credit Card");
        System.out.println("Payment successful!");
    }
}