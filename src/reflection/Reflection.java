/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author Александр
 */
public class Reflection {

    /**
     * @param args the command line arguments
     */
    
    public static void callAnnotedMethod(){
        Car car1 = new Car("Audi", 8, 450, "brown");
        Class c = car1.getClass();
        Method[] methods = c.getMethods();
        for(Method m:methods){
            Version  annotations = m.getAnnotation(Car.class);
            if (annotations!=null){
                try{
                System.out.println(m.invoke(car1));}
                catch(Exception e){e.printStackTrace();}
            }
        }
    }
    
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Truck t1 = new Truck("Volvo", 18, 800, "brown", 4000);
        Class[] interfaces = Truck.class.getInterfaces();
        Class[] interfacesTwo = Car.class.getInterfaces();
   
        //Show interfaces wich are implemented
        for (Class inter : interfaces) {
            System.out.println("Truck:" + inter.getName());
        }

        for (Class inter : interfacesTwo) {
            System.out.println("Car:" + inter.getName());
        }

        //Get type and it's name
        Class c = t1.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            Class fieldType = f.getType();
            System.out.println("Name:" + f.getName());
            System.out.println("Type:" + fieldType.getName());
        }

        System.out.println(c.getName());

       
        callAnnotedMethod();

    }

}
