import java.util.*;

public class SortTask {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrew ", 28));
        persons.add(new Person("Sofia ", 29));
        persons.add(new Person("Bilbo ", 99));
        persons.add(new Person("Veldemar ", 12));
        persons.add(new Person("Igness ", 22));
        persons.add(new Person("Ivan ", 40));
        persons.add(new Person("Jack ", 16));
        persons.add(new Person("Hendrick", 75));

        persons.stream().filter(person -> person.getAge() < 30).sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);


    }
}

class Person {

    String fname;

    int age;

    public int getAge() {
        return age;
    }

    public Person(String fname, int age) {
        this.fname = fname;

        this.age = age;
    }

    @Override
    public String toString() {
        return fname + age;
    }
}