public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                "Honey",
                101,
                1000,
                90
        );

        FoodOrder order = new FoodOrder(
                1,
                "Biryani",
                150,
                2
        );

        System.out.println("Student: " + student.getName());

        order.showOrder();

        double total = order.calculateTotal();

        if (student.orderFood(total)) {

            Payment payment = new UPI();
            payment.pay(total);

            Delivery delivery = new BikeDelivery();
            delivery.deliver();

            student.showBalance();
        }
    }
}