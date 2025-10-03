package com.pluralsight;

public class Application {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];

        Vehicle vehicle1 = new Vehicle(vehicleId: 101121,makeModel: Ford Explorer,color: Red,odometerReading: 45000,price: 135000);








        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);

            //vehicleId,makeModel,color,odometerReading,price
            //101121,Ford Explorer,Red,45000,13500
           // 101122,Toyota Camry,Blue,60000,11000
           // 101123,Chevrolet Malibu,Black,50000,9700
            //101124,Honda Civic,White,70000,7500
            //101125,Subaru Outback,Green,55000,14500
            //101126,Jeep Wrangler,Yellow,30000,16000

        }































    }

}
