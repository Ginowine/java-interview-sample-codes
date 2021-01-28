package generaljavaexamples;

public class LowerToUpperCaseWithoutoUpperCase {
    public static void toLowerCase(String a) {

        for (int i = 0; i< a.length(); i++) {
            char character = a.charAt(i);
            if (65 <= character && character <= 90) {
                character = (char)( (character + 32) );
            }
            System.out.print(character);
        }


        // You can simply do this to get same output as piece of code above
        //System.out.println(a.toLowerCase());
    }
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        toLowerCase(str);
    }
}
