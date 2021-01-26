package generaljavaexamples;

public class CheckIfStringIsNumber {

    public static void main(String args[]){
        String regex = "[0-9]+";
        String data = "1234567";

        System.out.println("Is Number :" + data.matches(regex));
    }
}
