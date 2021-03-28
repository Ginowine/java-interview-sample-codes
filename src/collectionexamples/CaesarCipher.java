package collectionexamples;

public class CaesarCipher {

    public static StringBuffer encrypt(String text, int shift){
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                char ch = (char) (((int)text.charAt(i) + shift - 65) % 26 + 65);
                result.append(ch);
            }else {
                char ch = (char)(((int)text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        String text = "ATTACKATONCE";
        int s = 4;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
}
