package homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // создаем новый объект
        Employee employee1 = new Employee("Иванов Иван Иванович", "инженер", "ivanov@mail.ru",
                "89998889988", 50000, 30);

        // печатаем информацию об объекте
        employee1.printObject();

        // создаем массив из сотрудников
        Employee[] employees = new Employee[5];

        // заполняем массив значениями
        employees[0] = new Employee("Горшенев Михаил Юрьевич", "вокалист", "gorshok@mail.ru",
                "89998889988", 100000, 39);
        employees[1] = new Employee("Князев Андрей Сергеевич", "вокалист", "knyazz@mail.ru",
                "89998889999", 100000, 49);
        employees[2] = new Employee("Цвиркунов Яков Вадимович", "гитарист", "yasha@mail.ru",
                "89998889977", 75000, 45);
        employees[3] = new Employee("Балунов Александр Валентинович", "бас-гитарист", "balu@mail.ru",
                "89998889966", 75000, 49);
        employees[4] = new Employee("Щиголев Александр Анатольевич", "барабанщик", "poruchik@mail.ru",
                "89998889955", 75000, 49);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printObject();
            }
        }

    }

}
