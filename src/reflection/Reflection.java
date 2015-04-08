/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * @author Александр
 */
public class Reflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck t1 = new Truck("Volvo", 18, 800, "brown", 4000);
        Class[] interfaces = Truck.class.getInterfaces();
        Class[] interfacesTwo = Car.class.getInterfaces();

        for (Class inter : interfaces) {
            System.out.println("Truck:" + inter.getName());
        }

        for (Class inter : interfacesTwo) {
            System.out.println("Car:" + inter.getName());
        }

        Class c = t1.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            Class fieldType = f.getType();
            System.out.println("Name:" + f.getName());
            System.out.println("Type:" + fieldType.getName());
        }
        
        System.out.println(c.getName());
        

    }

}
