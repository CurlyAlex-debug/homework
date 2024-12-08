public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров Петр", "Ingeneer", "PetP@mail.com", "89132891234", 40000, 28);
        persArray[1] = new Person("Котов Кот", "Tester", "Kot@mail.com", "89342876513", 35000, 30);
        persArray[2] = new Person("Иванов Иван", "Manager", "IvIv@mail.com", "89421729878", 30000, 27);
        persArray[3] = new Person("Лара Крофт", "Developer", "LaCr@mail.com", "89923146598", 40000, 29);
        persArray[4] = new Person("Винни Джонс", "Designer", "Vinn@mail.com", "89213424563", 37000, 32);
        for (Person person : persArray) {
            System.out.println(person);
        }
    }
}
    class Person {
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;
        public Person (String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPosition() {
            return position;
        }
        public void setPosition(String position) {
            this.position = position;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPhone() {
            return phoneNumber;
        }
        public void setPhone(String phone) {
            this.phoneNumber = phone;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return  "name='" + name + '\'' + ", position='" + position + '\'' + ", email='" + email + '\'' + ", phone='" + phoneNumber + '\'' + ", salary=" + salary + ", age=" + age;
        }
}
