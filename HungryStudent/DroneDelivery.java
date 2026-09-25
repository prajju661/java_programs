class DroneDelivery extends Delivery {

    @Override
    void deliver() {
        System.out.println("Delivery: Drone");
        System.out.println("Your food is flying to you");
    }
}