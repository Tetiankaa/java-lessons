package lesson4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Vegetable(1,"tomato"));
        vegetables.add(new Vegetable(2,"broccoli"));
        vegetables.add(new Vegetable(3,"beet"));
        vegetables.add(new Vegetable(5,"carrot"));
        vegetables.add(new Vegetable(6,"eggplant"));
        vegetables.add(new Vegetable(7,"corn"));

        Stream<Vegetable> vegetableStream = vegetables.stream();
//                .forEach(vegetable -> System.out.println(vegetable));
                vegetableStream.forEach(System.out::println);


                List<Vegetable> filteredVegetables = vegetables
                        .stream()
                        .filter(vegetable -> vegetable.getName().startsWith("c"))
                        .toList();
                System.out.println(filteredVegetables);

        Map<String, List<Vegetable>> vegetables2 = new HashMap<>();
        vegetables2.put("tomato", List.of(new Vegetable(2514, "tomato1"),new Vegetable(151, "tomato2")));
        vegetables2.put("bean", List.of(new Vegetable(65, "bean1"),new Vegetable(6546, "bean2")));
        vegetables2.put("carrot", List.of(new Vegetable(158, "carrot1")));

        int count = 0;
        for (Map.Entry<String,List<Vegetable>> entries : vegetables2.entrySet()){
            if (entries.getValue() == null){
                continue;
            }
            for (Vegetable vegetable : entries.getValue()){
                if (vegetable == null){
                    continue;
                }
                if (vegetable.getName().contains("a")){
                    count += vegetable.getName().length();
                }
            }
        }

        System.out.println(count);

        int sum = vegetables2
                .entrySet()
                .stream()
                .filter(entries->entries.getValue() != null)
                .flatMap(entry->entry.getValue().stream())
                .filter(Objects::nonNull)
                .mapToInt(veg->veg.getName().length())
                .sum();
        System.out.println(sum);

        // convert list into map
        Map<String, Vegetable> vegetableByName = vegetables
                .stream()
                .collect(Collectors.toMap(Vegetable::getName, Function.identity()));
        System.out.println(vegetableByName);
    }
}
