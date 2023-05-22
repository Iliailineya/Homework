package org.example.secondHomework;

/*
1. Створити порожній проект в IntelliJ
2. Створити клас "Співробітник" з полями: ім'я, прізвище, по-батькові - ці три зробити final, посада, email, телефон, вік, заробітня платня.
3. Конструктор класу повинен заповнювати ці поля під час створення об'єкта. Створити конструктор за замовчуванням,
   конструктор з усіма полями, та один з необхідними для, припустимо, бугалтера.
Note: якщо помітите, що шось не так - закоментуйте частину коду та напишіть коментар,що саме.
4. Створити два класи з однаковим ім'ям SameName. (Використовувати пакети)
5. Створити клас Car з публічним методом start. Метод start викликає у собі методи:- startElectricity()- startCommand()- startFuelSystem()
  Перелічені методи, є внутрішньою (прихованою) частиною комплексного методу start. Вони по суті відображають
  внутрішню поведінку класу Car і не повинні використовуватися за межами даного класу.
6. Створити екземпляр кожного класу та викликати всі створені методи у main.
 */

import net.datafaker.Faker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        // Блок для Співробітника
        {
            Faker faker = new Faker();
//        Екземпляр класу не може бути викликаний через дефолтний конструктор
//        Employee employee = new Employee();

            Employee employee = new Employee(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().firstName(),
                    "CEO",
                    faker.internet().emailAddress(),
                    faker.random().nextInt(100000000, 999999999).toString(),
                    faker.random().nextInt(20, 60),
                    faker.random().nextDouble(5000, 100000));

            Employee accountant = new Employee(
                    faker.name().firstName(),
                    faker.name().lastName(),
                    faker.name().firstName(),
                    "Accountant",
                    faker.random().nextDouble(5000, 10000));

            drawEmployee(employee);
            System.out.println();
            drawEmployee(accountant);
            System.out.println();

            accountant.setAge(faker.random().nextInt(20, 60));
            accountant.setEmail(faker.internet().emailAddress());
            accountant.setPhoneNumber(faker.random().nextInt(100000000, 999999999).toString());
            accountant.setPosition("Ruiner");
            accountant.setSalary(22223);
            drawEmployee(accountant);
            System.out.println();

        }

//        Блок для SameName
        {
            org.example.secondHomework.package1.SameName sameName_1 = new org.example.secondHomework.package1.SameName();
            org.example.secondHomework.package2.SameName sameName_2 = new org.example.secondHomework.package2.SameName();
            System.out.println(sameName_1);
            System.out.println(sameName_2);
            System.out.println();
        }
//        Блок для Car
        {
            Car car = new Car();
            car.start();

            try {
                Method[] methods = Car.class.getDeclaredMethods();

                for (Method method : methods) {
                    if (method.getModifiers() == Modifier.PRIVATE) {
                        method.setAccessible(true);
                        method.invoke(car);
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Допоміжний метод для скорочення коду
     */
    static void drawEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " \n" + employee.getLastName() + " \n" + employee.getMiddleName()
                + " \n" + employee.getEmail() + " \n" + employee.getAge() + " \n" + employee.getPhoneNumber()
                + " \n" + employee.getPosition() + " \n" + employee.getSalary());
    }
}
