/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;
/**
 *
 * @author Александр
 */
public class Truck extends Car {

    private double loadCapacity;


    public Truck(String brand, int cylinders, double power, String colour, double capacity) {
        super(brand, cylinders, power, colour);
        this.loadCapacity = capacity;
    }

    public Truck(Car car, double capacity) throws CloneNotSupportedException {
        super(car);
        this.loadCapacity = capacity;

    }
    
    @Override
    public String toString(){
      return  super.toString()+"\n Load capacity:"+getLoadCapacity();
    }

    /**
     * @return the loadCapacity
     */
    public double getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * @param loadCapacity the loadCapacity to set
     */
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public static void main(String[] args) {
        Truck t1 = new Truck("Volvo", 18, 800, "brown", 4000);
        System.out.println(t1);
    }
}
