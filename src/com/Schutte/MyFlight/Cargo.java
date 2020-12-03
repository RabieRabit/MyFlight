package com.Schutte.MyFlight;

public class Cargo {
    double TotalCargo =0.0d;
    double maxCargo = 1000.0d;
    double Cargo;

    //hierso wat gebeur as ek in main Flight F150 en flight F350 uit comment en Cargoflight los
    // dan kry ek die regte output behalwe as ek oor maxCargo gaan dan kry ek nie die regte output nie en alles Compile
    // as ek die cargo try calculate met flight f150 (kan maar vergeet van f350 dit was eintlik net n toets)
    // dan kry ek output as 0 passenegers en 0 cargo
    public void addCargo() {
        if (CargoSpace())
            TotalCargo += Cargo;
        else
            handleTooManyCargo();
    }

    private void handleTooManyCargo() {
        System.out.println("Too many cargo!");
    }

    public boolean CargoSpace(){
        return maxCargo>TotalCargo;
    }

    public void setCargo(double Cargo){
        this.Cargo = Cargo;
        addCargo();
    }
    public double getTotalCargo(){
        return TotalCargo;
    }
    public void setTotalCargo(double cargo){
        this.TotalCargo = cargo;

    }
}
