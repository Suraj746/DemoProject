package StreamAPi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComparatorProgram {
    public static void main(String[] args) {
        Employee emp=new Employee(1,"Suraj","Bangalore");
        Employee emp1=new Employee(2,"Pankaj","Bangalore");
        Employee emp2=new Employee(3,"Ram","Delhi");
        Employee emp3=new Employee(4,"Suresh","Hydrabad");
        Employee emp4=new Employee(5,"Murga","Delhi");
        List<Employee> list = new ArrayList<Employee>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        for (Employee e : list){
            System.out.println(e.getCity()+""+e.getName()+""+e.getId());
        }
        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getCity));
        collect.forEach((k,v) -> System.out.println("City"+k+":"+"Value"+v));

        Map<Integer, String> collect1 = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        collect1.forEach((k,v) -> System.out.println("Id"+k+"  Value"+v));

        //sort by firstname
        list.sort(Comparator.comparing(Employee::getName));
        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("ReversedOrder");
//        reverse order
        list.sort(Comparator.comparing(Employee::getName).reversed());
        for (Employee employee : list) {
            System.out.println(employee);
        }

        //multiple order sorting
        System.out.println("Multiple Order sorting");
        list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getCity));
        for (Employee employee : list) {
            System.out.println(employee);
        }



    }
    public static class Employee{
        private int id;
        private String name;
        private String city;
        public Employee(int id, String name, String city) {
            super();
            this.id = id;
            this.name = name;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }

        public Employee() {
            super();
            // TODO Auto-generated constructor stub
        }

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

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
