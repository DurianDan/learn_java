package mypack;
import java.util.HashMap;

public class LearnHashMap {
    public static void testLearn(){
        CommonUtils.printSection("HashMap");
        HashMap<String, String> citiesIWillWorkAt = new HashMap<String, String>();
        citiesIWillWorkAt.put("VN", "Da Nang");
        citiesIWillWorkAt.put("UK", "Oxford");
        citiesIWillWorkAt.put("JP", "Tokyo");
        System.out.println("Cities I will work at: " + citiesIWillWorkAt.values());
        System.out.println("Countries that I want to work at: " + citiesIWillWorkAt.keySet());
        System.err.println("City in my home country: "+citiesIWillWorkAt.get("VN"));
        System.err.println("City to fullfil my old self's dream: "+citiesIWillWorkAt.get("UK"));
        System.err.println("City to fullfil my weebo's dream: "+citiesIWillWorkAt.get("JP"));
    }
}
