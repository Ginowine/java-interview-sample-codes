import java.util.LinkedHashMap;
import java.util.Map;

public class UsingLinkedHashMap {
    public static void main(String args[]){
        Map<String, String> mapContacts = new LinkedHashMap<>();

        mapContacts.put("34234555", "Gino");
        mapContacts.put("2243321344", "Eseosa");
        mapContacts.put("94474648449", "Eghosa");
        mapContacts.put("75756558556", "Iwinosa");

        System.out.println(mapContacts);
    }
}
