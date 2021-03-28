package generaljavaexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("gig" , Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Gino is going to get a remote gig soon");

        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Match Found");
        }else {
            System.out.println("Match not Found");
        }
    }
}
