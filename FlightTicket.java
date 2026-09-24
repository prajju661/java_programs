public class FlightTicket {

    // Variables
    private String passengerName;
    private int age;
    private String flightNumber;
    private String source;
    private String destination;
    private String travelDate;
    private String seatNumber;
    private double price;
    private String bookingStatus;

    // Constructor
    public FlightTicket(String passengerName, int age, String flightNumber,
                        String source, String destination, String travelDate,
                        String seatNumber, double price, String bookingStatus) {

        this.passengerName = passengerName;
        this.age = age;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.travelDate = travelDate;
        this.seatNumber = seatNumber;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    // Getters
    public String getPassengerName() {
        return passengerName;
    }

    public int getAge() {
        return age;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    // Setters
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void display() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + bookingStatus);
    }

    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket(
                "Rahul Sharma",
                28,
                "AI-202",
                "Delhi",
                "Mumbai",
                "2026-10-15",
                "12A",
                4500.0,
                "Confirmed"
        );

        ticket.display();
    }
}