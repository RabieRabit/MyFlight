package com.Schutte.MyFlight;

public class Flight {
    int passengers;
    int seats = 100;

    //dan moet dit 1 passenger add by die total passengers so as ek bv
    // x3 keer se Passenger /*passenger naam*/ = new Passeneger(50) dan moet die output wees
    // Total passengers = 3
    // Total Cargo weight = 150kg
    public void add1Passenger() {
        if (availableSeats())
            passengers += 1;
        else
            TooMany();
    }

    public void TooMany() {
        System.out.println("Too many");
    }

    private boolean availableSeats() {
        return passengers < seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
