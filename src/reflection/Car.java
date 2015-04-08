/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.annotation.Annotation;
import java.util.Locale;


/**
 *
 * @author Александр
 */
public class Car implements Cloneable , Version {

    private String brand;
    private int cylinders;
    private double power;

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    enum Colour {

        BLACK, RED, WHITE, GREY, BROWN
    };
    private Colour colour;

    public Car(Car car) {
        this(car.getBrand(), car.getCylinders(), car.getPower(), car.getColour().toString());
    }

    public Car(String brand, int cylinders, double power, String col) {
        this.brand = brand;
        this.cylinders = cylinders;
        this.power = power;
        setColour(col);
    }
     
    @Version(1)
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    /**
     * @return the colour
     */
    public Colour getColour() {
        return colour;
    }

    /**
     *
     */
    public void setColour(String colour) {
        this.colour = Colour.valueOf(colour.toUpperCase());
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the cylinders
     */
    

    
    public int getCylinders() {
        return cylinders;
    }

    /**
     * @param cylinders the cylinders to set
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    /**
     * @return the power
     */

    public double getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString(){
        return "Brand:"+getBrand()+"\n Colour:"+getColour()+"\n Power:"+getPower()+"\n Cyclinder:"+getCylinders();
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Audi", 8, 450, "brown");
        Car car2 = new Car(car1);

        System.out.println(car1);
        

    }
}
