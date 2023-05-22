package org.example.secondHomework;

 public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private double salary;

    // Конструктор за замовчуванням не може бути ниписаний, бо тоді final поля не будуть ініціалізовані

//    public Employee() {
//    }

// Хоча в деяких ресурсах радять все одно ініціалізувати пусті final поля в усіх конструкторах,
// навіть використовуючи пусті строки виду
//        this.firstName = "";
//        this.lastName = "";
//        this.middleName = "";
//    для зручності тестування



     // Конструктор з усіма полями
    public Employee(String firstName, String lastName, String middleName, String position, String email,
                    String phoneNumber, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    // Конструктор для бухгалтера
    public Employee(String firstName, String lastName, String middleName, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.salary = salary;
        // Залишаємо решту полів незаповненими (null або 0)
    }

    // Геттери і сеттери для всіх полів

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
