class BikeDelivery extends Delivery {

    @Override
    void deliver() {
        System.out.println("Delivery: Bike");
        System.out.println("Your food is coming by bike");
    }
}