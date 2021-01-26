package generaljavaexamples;

public class StringRotation {

    static boolean areRotations(String str1, String str2){
        return (str1.length() == str2.length()) && ((str1 + str2).contains(str2));
    }

    public static void main(String args[]){
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2)){
            System.out.println("Strings are rotations of each other");
        }
        else {
            System.out.println("Strings are not rotations of each other");
        }
    }
}
