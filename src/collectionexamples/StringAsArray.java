package collectionexamples;

public class StringAsArray {
    public static void main(String[] args){
        // our test String phrase
        String message = "Winter is coming...";

// transform a String to a char[] and print it
        char[] charArray = message.toCharArray();
        for(int i=0; i<charArray.length; i++)
            System.out.print(charArray[i] + ", ");

// getting the first word of the phrase
        String firstWord = message.substring(0, message.indexOf(' '));
        System.out.println("First word: " + firstWord);

// checking if our phrase contains the String "sun"
        boolean match = message.contains("sun");
        System.out.println("Contains 'sun': " + match);

// getting the last word of the phrase
        String lastWord = message.substring(message.lastIndexOf(' ') + 1, message.length());
        System.out.println("Last word: " + lastWord);
    }
}
