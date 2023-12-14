package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Given a list of objects with a 'category' field, use Streams to group the objects by category and
//calculate the average of a numeric field within each category.


class MyObject {
	String category;
	int value;

	public MyObject(String category, int value) {
		this.category = category;
		this.value = value;
	}

	public String getCategory() {
		return category;
	}

	public int getValue() {
		return value;
	}
}




public class CategoryProgram {
	public static void main(String[] args) {
        List<MyObject> objects = Arrays.asList(
            new MyObject("CategoryA", 10),
            new MyObject("CategoryB", 20),
            new MyObject("CategoryA", 30),
            new MyObject("CategoryB", 40),
            new MyObject("CategoryA", 50)
        );

        Map<String, Double> categoryAverageMap = objects.stream()
            .collect(Collectors.groupingBy(MyObject::getCategory, Collectors.averagingDouble(MyObject::getValue)));

        categoryAverageMap.forEach((category, average) -> {
            System.out.println("Category: " + category + ", Average Value: " + average);
        });
    }
}
