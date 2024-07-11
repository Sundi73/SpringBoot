package Code_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {

    public static void main(String[] args) {
        

       List<Employee> list =  Arrays.asList(new Employee("A",12,3000)
                                   , new Employee("B",13,4000),new Employee("C", 17, 5000));


                 list.stream().filter(n -> n.getSalary() >= 4000).collect(Collectors.toList()).forEach(System.out::println);
    }
    
}
