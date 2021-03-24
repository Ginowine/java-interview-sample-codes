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

//        for (String str : cars){
//            System.out.println(str);
//        }

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
