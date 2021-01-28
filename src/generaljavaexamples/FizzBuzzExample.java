package generaljavaexamples;

public class FizzBuzzExample {
    public static String fizzBuzz (int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "fizzBuzz";
        }else if (number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
