package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIteretors {
    public static void main(String args[]){
        ArrayList<Integer> it = new ArrayList<>();

        it.add(7567);
        it.add(8433);
        it.add(7890);
        it.add(2354);

        Iterator<Integer> tt = it.iterator();

        while (tt.hasNext()){
            Integer integer = (Integer) tt.next();
            it.add(2344); //This will throw ConcurrentModificationException
        }
    }
}
