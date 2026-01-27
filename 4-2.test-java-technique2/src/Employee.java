public class Employee {

    static String name;
    static String age;

    public Employee(String name, String age){
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Employee.name = name;
    }
    public static String getAge() {
        return age;
    }
    public static void setAge(String age) {
        Employee.age = age;
    }

    //@Override
}
