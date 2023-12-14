package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CareLonInterview {
	
	public static class Employee{
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}
	public static void main(String[] args) {
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(101,"Suraj"));
		list.add(new Employee(102,"Pankaj"));
		
		
		List<Integer> collectIds = list.stream().map(Employee::getId).collect(Collectors.toList());
		System.out.println(collectIds);
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		list.stream().forEach(employee -> map.put(employee.getId(), employee.getName()));
		System.out.println(map);
		
		
		Map<Integer, String> collectintoMap = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(collectintoMap);
		
		
		List<Integer> list2=Arrays.asList(10,20,30,40,50);
		Optional<Integer> add = list2.stream().reduce((a,b)-> a+b);
		System.out.println("Addition of numbers"+add);
		
		//Maximum number from the list
		
		int max=list2.stream().max(Integer::compare).orElse(null);
		System.out.println(max+" is the maximum number");
		
		
		
	}

}
