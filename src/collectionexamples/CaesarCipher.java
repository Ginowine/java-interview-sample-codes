package collectionexamples;

public class CaesarCipher {

    public static String encrypt(String text, int shift){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char) (((int)text.charAt(i) + shift - 65) % 26 + 65);
                result.append(ch);
            }else {
                char ch = (char)(((int)text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch).toString();
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift){
        return encrypt(text, 26 - (shift % 26));
    }

    public static void main(String[] args)
    {
        String text = "ATTACKATONCE";
        String text2 ="ro dyvn wo s myevn xofob dokmr k vvkwk dy nbsfo";
        int s = 4;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);

        String result = encrypt(text, s);
        System.out.println("Cipher: " + result);
        //System.out.println("Cipher: " + encrypt(text, s));

        System.out.println("Decipher: " + decrypt(result, 4));
    }
}
