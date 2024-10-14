public class Person {
    String name;
    String surname;
    String patronymic;
    String jobPosition;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person(String name, String surname, String patronymic, String jobPosition, String email,
                  String phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.jobPosition = jobPosition;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + name + "Фамилия: " + surname + "Отчество: " + patronymic
                + "Должность: " + jobPosition + "Почта: " + email + "Телефон: " + phoneNumber + "З/П: "
                + salary + "Возраст: " + age);

    }

    public static void main(String[] args) {


        Person[] persArray = new Person[5];
        persArray[0] = new Person("Vasily", "Petrov", "Yurevich", "Manager", "vvvv@mail.ru", "89225553223", 80000, 33);
        persArray[1] = new Person("Vladimir", "Pushkarev", "Petrovich", "Engineer", "bbbb@mail.ru", "89185553226", 90000, 30);
        persArray[2] = new Person("Viktoriya", "Penzeva", "Sergeevna", "Developer", "ssss@mail.ru", "89195553227", 90000, 31);
        persArray[3] = new Person("Vitalina", "Petrova", "Viktorovna", "QA", "ggggg@mail.ru", "89995553224", 80000, 29);
        persArray[4] = new Person("Vagan", "Khachataryan", "Hakanovich", "Analyst", "ppppp@mail.ru", "89265553229", 70000, 27);


    }
}
