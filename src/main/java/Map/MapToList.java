package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hurenxiang");
        map.put(2,"caiyao");
        map.put(3,"kebi");

        //将map健转化为list
        List<Integer> list = new ArrayList<>(map.keySet());
        System.out.println(list);

        //将map值转化为list
        List<String> list1 = new ArrayList<>(map.values());
        System.out.println(list1);

        List list2 = new ArrayList<>(map.entrySet());
        System.out.println(list2);
    }
}
