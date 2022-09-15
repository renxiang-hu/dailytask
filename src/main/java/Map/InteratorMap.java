package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历map的几种方式
 */
public class InteratorMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("胡仁祥",20);
        map.put("蔡瑶",21);
        map.put("科比",30);

        //第一种方式，推荐
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //第二种方式
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }

        //第三种方式
        for (String value : map.keySet()){
            Integer integer = map.get(value);
            System.out.println(value + " : " + integer);
        }

        //第四种方式 -- 只能遍历value
        for (Integer value : map.values()){
            System.out.println(value);
        }
    }
}
