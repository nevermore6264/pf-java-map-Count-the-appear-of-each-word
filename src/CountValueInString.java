import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CountValueInString {
    public static void main(String[] args) {
        String str = "Xin chào mọi người, chào cô chú, chào họ hàng";
        str = str.replaceAll(",", "");
        String[] arr = str.split(" ");
        String key = "";
        Integer value;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, new Integer(1));
            }
        }
        // print result
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Word '" + key + "' appear " + map.get(key) + " time");
        }
    }
}
