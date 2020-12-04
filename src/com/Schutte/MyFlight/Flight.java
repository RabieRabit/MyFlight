package com.Schutte.MyFlight;

public class Flight {
    int totalPassengers =0;
    int passengers =0;
    int seats=0;


    public void addPassengers(){
        if (availableSeats()) {
            System.out.println(passengers);
            totalPassengers += passengers;
            if (!availableSeats())
                handleTooMany();
        }
    }

    private void handleTooMany() {
        System.out.println("Too many Passengers max = "+getSeats());
    }

    private boolean availableSeats() {
        return totalPassengers < seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getSeats(){
        return seats;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
        addPassengers();
    }
}
