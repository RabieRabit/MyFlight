package com.Schutte.MyFlight;

public class Passenger {
        //dis nie n method nie dis n Constuctor(as ek die naam reg onthou)
    public Passenger(double baggage) {
        //van hier af moet dit die add1passenger method call in Flight class (kyk in flight class)
        Flight passenger = new Flight();
        passenger.add1Passenger();
        // en van hier af die addCargo method in Cargo class (kyk in Cargo class)
        Cargo luggage = new Cargo();
        luggage.setCargo(baggage);
    }
}
// voor ek die passenger class geadd het het ek in die main class in die flight method gese bv
//flight f150 dan sou ek se Flight f150 = new Flight();
// f150.add1Passenger(50);
// en die print statements dan het ek die output gekry
// Total passengers = 1 (wat reg was)
// Total Cargo = 0 (wat eintlik moes 50 wees