import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Method_reference {

    

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ashutosh","Abhishek","Rahul");
       list.stream().map(x -> new student(x)).collect(Collectors.toList()).forEach(System.out::println);
       System.out.println();
    }
    
}

class student{
    private String name;

    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student [name=" + name + "]";
    }

    

    
}
