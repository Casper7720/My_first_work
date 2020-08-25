import java.util.HashMap;
import java.util.Map;

public class AdditonRepository {
    static java.util.Map<String, Addition> additionMap = new HashMap<>();

    public static void additionMapPut(Addition addition){
        additionMap.put(addition.getName(), addition);
    }

    public static void printAdditionMap(java.util.Map<String, Addition> map){
        for(Map.Entry<String, Addition> pair : map.entrySet()){
            Addition value = pair.getValue();
            System.out.println(value);
        }
    }
}
