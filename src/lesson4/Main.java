package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(5);
        integers.add(10);
        integers.add(8);
        integers.addFirst(3);
        System.out.println(integers); // [3, 5, 10, 8]

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(100);
        priorityQueue.add(1);
        priorityQueue.add(49);
        System.out.println(priorityQueue); // [1, 2, 100, 5, 49]

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(22);
        arrayDeque.add(11);
        arrayDeque.addFirst(500);
        System.out.println(arrayDeque); // [500, 5, 22, 11]

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(50);
        integerHashSet.add(90);
        integerHashSet.add(5);
        System.out.println(integerHashSet); // [50, 5, 90]

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(41);
        linkedHashSet.add(100);
        linkedHashSet.add(14);
        System.out.println(linkedHashSet); // [100, 41, 14]

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(100);
        integerTreeSet.add(41);
        integerTreeSet.add(100);
        integerTreeSet.add(14);
        System.out.println(integerTreeSet); // [14, 41, 100]

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"apple");
        hashMap.put(5,"pineapple");
        hashMap.put(9,"kiwi");
        hashMap.put(5,"pineapple");
        hashMap.put(0,"apple");
        System.out.println(hashMap); // {0=apple, 1=apple, 5=pineapple, 9=kiwi}

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(9,"meat");
        linkedHashMap.put(1,"potatoes");
        linkedHashMap.put(3,"onion");
        linkedHashMap.put(10,"cheese");
        linkedHashMap.put(9,"bread");
        System.out.println(linkedHashMap); // {9=bread, 1=potatoes, 3=onion, 10=cheese}

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"apple");
        treeMap.put(5,"pineapple");
        treeMap.put(9,"kiwi");
        treeMap.put(1000,"watermelon");
        treeMap.put(5,"apricot");
        treeMap.put(200,"apple");
        System.out.println(treeMap); // {1=apple, 5=apricot, 9=kiwi, 200=apple, 1000=watermelon}

        // for loop
        Map<String, Vegetable> vegetables = new HashMap<>();
        vegetables.put("banana",new Vegetable(1,"Banana"));
        vegetables.put("citron",new Vegetable(2,"Citron"));

        for (Vegetable vegetable : vegetables.values()){
            System.out.println(vegetable);
        }

        for (String key : vegetables.keySet()){
            System.out.println(key);
        }

        for (Map.Entry<String, Vegetable> entry : vegetables.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // hashCode method
        Vegetable tomato1 = new Vegetable(1,"tomato");
        Vegetable tomato2 = new Vegetable(1,"tomato");
        System.out.println(tomato1 == tomato2); // false
        System.out.println(tomato1.hashCode() == tomato2.hashCode()); // true
    }
}
