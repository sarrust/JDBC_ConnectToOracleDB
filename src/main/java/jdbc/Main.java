package jdbc;

import jdbc.service.StudentService;
import jdbc.service.StudentServiceImpl;

import java.util.Scanner;

public class Main {
    private static final StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: \n1 - Добавление студента\n" +
                    "2 - Полный список студентов\n3 - Удаление студента\n4 - Выход");
            int choose = in.nextInt();

            if (choose == 1) {
                System.out.println("Введите данные студента: ");
                System.out.println("Имя:");
                String name1;
                while(true) {
                    name1 = in.next();
                    if(name1.matches("^[a-zA-Zа-яА-Я]*$")) {
                        break;
                    } else {
                        System.out.println("Ошибка! Некорректный ввод, повторите попытку: ");
                    }
                }
                System.out.println("Фамилие:");
                String lastName1;
                while(true) {
                    lastName1 = in.next();
                    if(lastName1.matches("^[a-zA-Zа-яА-Я]*$")) {
                        break;
                    } else {
                        System.out.println("Ошибка! Некорректный ввод, повторите попытку: ");
                    }
                }
                System.out.println("Год рождения:");
                int year1;
                while(true) {
                    if(in.hasNextInt()) {
                        year1 = in.nextInt();
                        break;
                    } else {
                        System.out.println("Ошибка! Введите целое число: ");
                        in.next();
                    }
                }
                studentService.saveStudent(name1, lastName1, year1);
            }
            if (choose == 2) {
                System.out.println("Полный список студентов:");
                studentService.getAllStudent();
            }
            if (choose == 3) {
                System.out.println("Введите ID студента которого хотите удалить: ");
                long idNumber;
                while(true) {
                    if(in.hasNextLong()) {
                        idNumber = in.nextLong();
                        break;
                    } else {
                        System.out.println("Ошибка! Введите целое число: ");
                        in.next();
                    }
                }
                studentService.removeStudentById(idNumber);
            }
            if(choose == 4) {
                break;
            }
        }
    }
}
