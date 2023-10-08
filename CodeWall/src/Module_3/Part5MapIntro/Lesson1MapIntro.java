package Module_3.Part5MapIntro;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;
public class MapIntro {
    /**
            * Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key. It is easy to perform operations using the key index like update, deletion, etc. HashMap class is found in the java.util package.
            *
            * HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class and implements the Map interface.
            */


    /**
     * Points to remember
     * Java HashMap contains values based on the key.
     * Java HashMap contains only unique keys.
     * Java HashMap may have one null key and multiple null values.
     * Java HashMap is non synchronized.
     * Java HashMap maintains no order.
     * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
     *
     *
     *  Hierarchy of HashMap class
     *  As shown in the above figure, HashMap class extends AbstractMap class and implements Map interface
     *
     *  HashMap class declaration
     * Let's see the declaration for java.util.HashMap class.
     * public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
     *
     *
     * HashMap class Parameters
     * Let's see the Parameters for java.util.HashMap class.
     *
     * K: It is the type of keys maintained by this map.
     * V: It is the type of mapped values.
     */

    public class Lesson1MapIntro {
        public static void main(String[] args) {
            java.util.Map<String,String> map = new HashMap<>();
            map.put("one","Thura Linn");
            map.put("two","Aung Aung");

            System.out.println(map.get("one"));
            System.out.println(map);

            System.out.println("=======================");

            Map<Integer,String> map1 = new HashMap<>();
            map1.put(1,"One One");
            map1.put(2,"One Two");
            map1.put(3,"One");

            System.out.println(map1.get(1));

            System.out.println(map.get("one"));



            Map<Object,String> map2  = new HashMap<>();
            map2.put(1,"thura linn");
            map2.put("Two","codewall");

            System.out.println(map2);
        }
    }

}
