package lesson1;

public class PersonDemo {
    public static void main(String[] args) {
//        Person person = Person.builder()
//                .name("Tanya")
//                .age(27)
//                .build();

        Person person = Person.builder()
                        .name("aaa")
                                .age(28)
                                        .build();

        System.out.println(person);

    }
}
