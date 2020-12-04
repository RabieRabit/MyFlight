package com.Schutte.MyFlight;

public class Main {

    public static void main(String[] args) {
        FlightF150();
        //FlightF350();
        //CargoFlight();
    }

    private static void CargoFlight() {
        Cargo cargo = new Cargo();
        cargo.setMaxCargo(2000);
        cargo.setCargo(400.0d);
        cargo.setCargo(250.0d);
        cargo.setCargo(700.0d);
        cargo.setCargo(240);
        System.out.println("Total luggage weight on Cargo Plane = " + cargo.getTotalCargo() + "kg");
    }

    private static void FlightF350() {
        Flight f350 = new Flight();
        Cargo f350Cargo = new Cargo();
        f350.setSeats(150);
        f350.setPassengers(52);
        f350.setPassengers(50);
        f350.setPassengers(12);
        f350.setPassengers(44);

        f350Cargo.setMaxCargo(1500);
        f350Cargo.setCargo(750);
        f350Cargo.setCargo(751);

        System.out.println("Total Passengers = " + f350.getTotalPassengers());
        System.out.println("Total luggage = " + f350Cargo.getTotalCargo());
    }
// Andre hier is n probleem wat ek het as ek die program rum deur method F150 dan kry ek nie die regte output nie en ek
// kan nie optel waar dit alles verkeerd gaan nie al die ander werk 100%
    private static void FlightF150() {
        Flight f150 = new Flight();
        Cargo cargof150 = new Cargo();
        f150.setSeats(100);
        cargof150.setMaxCargo(1000);

        Passenger Bob = new Passenger(50, 5);
        Passenger Jack = new Passenger(120,12);

        System.out.println("On flight F150:");
        System.out.println("total passengers = " + f150.getTotalPassengers());
        System.out.println("Total luggage = " + cargof150.getTotalCargo());
    }
}
