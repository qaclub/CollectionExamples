package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sdubovenko on 5/26/2016.
 */
public class HashMapExample {
    public static void main(String[] args){
        // Создадим хеш-карточку
        Map<String, Integer> hm = new HashMap<String, Integer>();

// Помещаем данные на карточку
        hm.put("John", new Integer(5));
        hm.put("Sarha", new Integer(8));
        hm.put("Mike", new Integer(12));
        hm.put("Serhiy", new Integer(20));

// Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hm.entrySet();

// Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

// Добавляем значение
        int value = hm.get("John");
        hm.put("John", value + 3);
        System.out.println("\nJohn: " + hm.get("John"));

    }
}
