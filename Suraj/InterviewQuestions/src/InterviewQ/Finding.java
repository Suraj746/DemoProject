package InterviewQ;




//Write a Stream operation to find the first element in a list that satisfies a certain condition,
//e.g., find the first person in a list of people older than 30.
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Finding {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 32),
            new Person("Charlie", 28),
            new Person("David", 40)
        );

        Optional<Person> firstPersonOlderThan30 = people.stream()
            .filter(person -> person.getAge() > 30)
            .findFirst();

        if (firstPersonOlderThan30.isPresent()) {
            System.out.println("First person older than 30: " + firstPersonOlderThan30.get().name);
        } else {
            System.out.println("No person older than 30 found.");
        }
    }
}

