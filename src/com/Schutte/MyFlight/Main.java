package com.Schutte.MyFlight;

public class Main {

    public static void main(String[] args) {
        //FlightF150();
        //FlightF350();
        CargoFlight();
    }

    private static void CargoFlight() {
        Cargo cargo = new Cargo();
        cargo.setCargo(400.0d);
        cargo.setCargo(250.0d);
        cargo.setCargo(700.0d);
        System.out.println("Total luggage weight on Cargo Plane = " + cargo.getTotalCargo() + "kg");
    }

    private static void FlightF350() {
        Flight f350 = new Flight();
        f350.setPassengers(52);
        System.out.println("Total Passengers = " + f350.passengers);
    }

    private static void FlightF150() {
        // Ek wil add new passenger dan moet dit die passenger class call en dan (verder in passenger class)
        Passenger Bob = new Passenger(50);
        Passenger jack = new Passenger(25);


        Flight f150 = new Flight();
        Cargo cargof150 = new Cargo();
        System.out.println("total passengers = " + f150.getPassengers());
        System.out.println("Total luggage = " + cargof150.getTotalCargo());
    }
}
