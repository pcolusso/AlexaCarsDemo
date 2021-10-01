/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexacars;

/**
 *
 * @author paulcolusso
 */
public class Customer {
    private String name;
    private int daysTravelled;
    private double distanceTravelled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysTravelled() {
        return daysTravelled;
    }

    public void setDaysTravelled(int daysTravelled) {
        this.daysTravelled = daysTravelled;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public Customer(String name, int daysTravelled, double distanceTravelled) {
        this.name = name;
        this.daysTravelled = daysTravelled;
        this.distanceTravelled = distanceTravelled;
    }

    public String toString() {
        return String.format("Name: %s, daysTravelled: %d, distanceTravelled: %2.2f\n", this.name, this.daysTravelled, this.distanceTravelled);
    }
}
