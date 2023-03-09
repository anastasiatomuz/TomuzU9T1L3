public class VehicleRunner {
    public static void main(String[] args) {
//        // -------------- LAB PART 1 -----------------
//        // a. write code to create a Vehicle object with license "MC56WQ",
//        //    toll fee of 10.75, and 5 passengers.
//        //    Print out the calculated toll TollPrice.
//        Vehicle vehicle1 = new Vehicle("MC56WQ", 10.75, 5);
//        System.out.println(vehicle1.calculateTollPrice());
//
//
//        // b. write code to create an electric Car with license "KXN73F",
//        //    toll fee of 8.50, and 2 passengers.
//        //    Print out the calculated toll price
//        Car car1 = new Car("KXN73F", 8.5, 2, true);
//        System.out.println(car1.calculateTollPrice());
//
//
//
//
//        // c. add a printCar() void method to the Car class that prints the
//        //    Car's license plate, toll fee, number of passengers, whether it is electric,
//        //    and whether a discount has been applied.
//        //    Add getter methods as necessary to the Vehicle superclass.
//        //
//        // d. call the method on the Car you made in b to test it.
//        car1.printCar();
//
//
//
//        // e. write code to create a Truck with license "3K9JMX",
//        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
//        //    Print out the calculated toll price
//        Truck truck1 = new Truck("3K9JX", 24.75, 4, 6, true);
//        System.out.println(truck1.calculateTollPrice());
//
//
//
//        // f. add a printTruck() void method to the Truck class that prints the
//        //    Truck's license plate, toll fee, number of passengers, number of axles,
//        //    and whether it has a trailer.
//        //    Add getter methods as necessary to the Vehicle superclass.
//        //
//        // g. call the method on the Truck you made in e to test it.
//        truck1.printTruck();
//
//
//
//        // ------------ LAB PART 2 ---------------
//        // ----- instructions in lab sheet -------
//        Taxi taxi1 = new Taxi("8KM23Z", 9.25, 3, true, 5.00);
//        taxi1.printTaxi();
//        //methods inherited from the Vehicle class
//        System.out.println(taxi1.getLicensePlate());
//        System.out.println(taxi1.getTollFee());
//        System.out.println(taxi1.getPassengers());
//        System.out.println(taxi1.calculateTollPrice());
//        System.out.println(taxi1.isElectric());
//        System.out.println(taxi1.discountApplied());
//        taxi1.printCar();
//
//        System.out.println(taxi1 instanceof Car);
//        System.out.println(taxi1 instanceof Vehicle);
//

//
//
//        // ------------ LAB PART 3 ---------------
//        // ----- instructions in lab sheet -------
//        System.out.println("--------- TEST 1 ---------");
//        System.out.println("---- non-electric Taxi ---");
//        System.out.println("--------------------------");
//        Taxi testTaxi1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
//        testTaxi1.applyDiscount();
//        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi1.getTollFee());
//        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
//        System.out.println("total passengers: " + testTaxi1.getPassengers());
//        testTaxi1.pickupRiders(2, 3.75);
//        System.out.println("-----------");
//        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi1.getTollFee());
//        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
//        System.out.println("total passengers: " + testTaxi1.getPassengers());
//        testTaxi1.pickupRiders(2, 5.90);
//        System.out.println("-----------");
//        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi1.getTollFee());
//        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
//        System.out.println("total passengers: " + testTaxi1.getPassengers());
//        testTaxi1.pickupRiders(3, 3.40);
//        System.out.println("-----------");
//        System.out.println("discount already applied? " + testTaxi1.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi1.getTollFee());
//        System.out.println("total fare collected: " + testTaxi1.getFareCollected());
//        System.out.println("total passengers: " + testTaxi1.getPassengers());
//
//        System.out.println("\n--------- TEST 2 ---------");
//        System.out.println("----- electric Taxi ------");
//        System.out.println("--------------------------");
//        Taxi testTaxi2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
//        testTaxi2.applyDiscount();
//        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi2.getTollFee());
//        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
//        System.out.println("total passengers: " + testTaxi2.getPassengers());
//        testTaxi2.pickupRiders(2, 3.7);
//        System.out.println("-----------");
//        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi2.getTollFee());
//        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
//        System.out.println("total passengers: " + testTaxi2.getPassengers());
//        testTaxi2.pickupRiders(2, 4.75);
//        System.out.println("-----------");
//        System.out.println("discount already applied? " + testTaxi2.isDiscountApplied());
//        System.out.println("toll fee: " + testTaxi2.getTollFee());
//        System.out.println("total fare collected: " + testTaxi2.getFareCollected());
//        System.out.println("total passengers: " + testTaxi2.getPassengers());


        Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
        myVehicle3.printInfo();
        myVehicle3.printMilage(2200);
        Car myCar3 = new Car("MK4567", 6.75, 4, true);
        myCar3.printInfo();
        myCar3.printMilage(3000);
        Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
        myTruck3.printInfo();
        myTruck3.printMilage(2222);
        Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        myTaxi4.printInfo();





    }
}