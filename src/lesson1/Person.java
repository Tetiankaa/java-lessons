package lesson1;

import lombok.Builder;
import lombok.ToString;

//@Builder
//@ToString
public class Person {
    private String name;
    private int age;


    //without lombok
    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person(name=" + this.name + ", age=" + this.age + ")";
    }

    public static  PersonBuilder builder(){
        return new PersonBuilder();
    }
    public static class PersonBuilder{
        private String name;
        private int age;

        private PersonBuilder(){}

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return  this;
        }

        public Person build(){
            return new Person(name,age);
        }


    }
}
