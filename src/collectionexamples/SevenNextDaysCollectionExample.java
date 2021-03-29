package collectionexamples;

import java.util.*;

public class SevenNextDaysCollectionExample {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        Collection collectionOfDays = new ArrayList();
        Date currentDate = new Date();
        for (int i = 0; i < 7; ++i) {
            // The calendar is now set to the next day
            calendar.add(Calendar.DATE, 1);
            currentDate.setTime(calendar.getTimeInMillis());

            collectionOfDays.add(currentDate);
        }

        for (Object oneDay : collectionOfDays) {
            System.out.println("The next day is: " + oneDay);
        }
    }
}
