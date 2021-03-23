package collectionexamples;

import java.util.LinkedList;

public class CreatingLinkedList {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("BMW");
        cars.add("FORD");
        cars.add("TESLA");
        cars.add("Toyota");
        cars.add("BUGATTI");

        System.out.println(cars);
    }
}
