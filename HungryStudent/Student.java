class Student {
    private String name;
    private int studentId;
    private double walletBalance;
    private int hungerLevel;

    Student(String name, int studentId, double walletBalance, int hungerLevel) {
        this.name = name;
        this.studentId = studentId;
        this.walletBalance = walletBalance;
        this.hungerLevel = hungerLevel;
    }

    public void addMoney(double amount) {
        walletBalance += amount;
        System.out.println("Money added: Rs." + amount);
    }

    public boolean orderFood(double amount) {
        if (hungerLevel > 80) {
            System.out.println("EMERGENCY! Feed the student immediately!");
        }

        if (amount > walletBalance) {
            System.out.println("Insufficient wallet balance!");
            return false;
        }

        walletBalance -= amount;
        return true;
    }

    public void showBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }

    public String getName() {
        return name;
    }
}