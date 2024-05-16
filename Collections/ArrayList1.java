package Collections;
import java.util.*;
public class ArrayList1 {
    public static void main(String args[])

    {
        ArrayList<Employee> arrayList1 = new ArrayList<>();
        //Employee employee = null;
        Employee employee1 = new Employee(2, "Arpit", "java developer");
        Employee employee2 = new Employee(1, "Ansh", "pyhon developer");
        arrayList1.add(employee1);

        arrayList1.add(employee2);
        Collections.sort(arrayList1,new EmployeeIdComparator());
        for(Employee employee:arrayList1){
            System.out.println(employee);
        }

    }


}
