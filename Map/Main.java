package Map;
import java.util.*;
public class Main {
    public static void main(String args[]){
        List<Employee1> li = new ArrayList<>();
        Employee1 em= new Employee1(1,"Arpit","java developer");
        Employee1 em1= new Employee1(2,"Ansh","python developer");
        Employee1 em2= new Employee1(3,"Anuj","Fronted developer");
        li.add(em);
        li.add(em1);
        li.add(em2);

        Map<String,List<Employee1>> mp = new HashMap<>();
        mp.put("cs",li);
        System.out.println(mp);

    }
}
