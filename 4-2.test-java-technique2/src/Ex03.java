import java.util.ArrayList;

public class Ex03{
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("後藤", "(31歳)"));
        list.add(new Employee("山田", "(28歳)"));
        list.add(new Employee("佐藤", "(25歳)"));
        list.add(new Employee("田中", "(19歳)"));

        for(Employee employee : list){
            System.out.println(employee.getName() + employee.getAge());
        }
    }
}
