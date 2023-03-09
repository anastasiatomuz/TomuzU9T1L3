public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number of axles " + axles);
        System.out.println("Has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate(){
        if (hasTrailer){
            if (axles > 4){
                return getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX");
            } else {
                return getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX");
            }
        } else {
            return true;
        }
    }

    @Override
    public double calculateTollPrice(){
        if (hasTrailer){
            return getTollFee() * axles * 2;
        }
        return getTollFee() * axles;
    }

}