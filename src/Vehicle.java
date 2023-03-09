public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }


    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public double getTollFee(){
        return tollFee;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setPassengers(int newNum){
        passengers = newNum;
    }

    public void setTollFee(double newFee){
        tollFee = newFee;
    }

    public void printInfo(){
        System.out.println("License plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public void printMilage(int miles){
        System.out.println("you drove " + miles + " miles with your vehicle ");
    }
}