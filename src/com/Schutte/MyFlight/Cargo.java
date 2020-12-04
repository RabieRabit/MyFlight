package com.Schutte.MyFlight;

public class Cargo {
    double TotalCargo;
    double maxCargo = 0;
    double Cargo;

    private void addCargo() {
        if (hasCargoSpace()) {
            TotalCargo += Cargo;
            if (!hasCargoSpace()) {
                handleTooManyCargo();
            }
        }
    }

    private void handleTooManyCargo() {
        System.out.println("Too many cargo!\nmax Cargo is " + getMaxCargo());
    }

    public boolean hasCargoSpace() {
        return TotalCargo < maxCargo;
    }
    public void setCargo(double Cargo) {
        this.Cargo = Cargo;
        addCargo();
    }
    public double getTotalCargo() {
        return TotalCargo;
    }
    public void setTotalCargo(double cargo) {
        this.TotalCargo = cargo;
    }
    public void setMaxCargo(double maxCargo) {
        this.maxCargo = maxCargo;
    }
    public double getMaxCargo(){
        return maxCargo;
    }
}
