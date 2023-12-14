package InterviewQ;

//Chaining Operations:

//Write a series of Stream operations to filter a list of objects, map them to a different type,
//and then limit the results to a specific number.


import java.util.List;
import java.util.stream.Collectors;

class OriginalObject {
    String name;
    int value;

    public OriginalObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

class MappedObject {
    String name;

    public MappedObject(String name) {
        this.name = name;
    }
}

public class ChainingOperations {
    public static void main(String[] args) {
        List<OriginalObject> objects = List.of(
            new OriginalObject("ObjectA", 10),
            new OriginalObject("ObjectB", 20),
            new OriginalObject("ObjectC", 30),
            new OriginalObject("ObjectD", 40),
            new OriginalObject("ObjectE", 50)
        );

        int limit = 3;

        List<MappedObject> result = objects.parallelStream() // Use parallelStream for concurrent processing
            .filter(original -> original.getValue() > 20)
            .map(original -> new MappedObject(original.getName()))
            .limit(limit)
            .collect(Collectors.toList());

        result.forEach(mapped -> System.out.println("Mapped: " + mapped.name));
    }
}

