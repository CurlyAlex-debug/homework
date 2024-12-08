public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;
    public Employee(String name, String post, String email, String  phoneNumber, String salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age= age;
    }
    public void info() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Борисов Дмитрий Сергевич", "Бригадир", "sdfvs@gmail.com", "89245439865", "35_000", 20);
        employee.info();
    }
}