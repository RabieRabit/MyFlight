package com.Schutte.MyFlight;

public class Passenger {

    public Passenger(double TotalBaggageWeight, int TotalPassengers) {
        CargoWeight(TotalBaggageWeight);
        Passengers(TotalPassengers);
    }

    public void Passengers(int totalPassengers) {
        Flight flight = new Flight();
        flight.setPassengers(totalPassengers);
    }

    public void CargoWeight(double totalBaggageWeight) {
        Cargo cargo = new Cargo();
        cargo.setCargo(totalBaggageWeight);
    }
}
