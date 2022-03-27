package com.company;


import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;

public class Main {


    public static void main(String[] args) throws InterruptedException, MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {

        String[] examples = {"абракккаадд", "ааааабббббаааа", "абвггггаааа", "абвг", "aaaaaaaabbb"};
        Admin admin = new Admin();
        admin.init();

        Task2 task2 = new Task2("аа_а_б");                   // Задание 2
        task2.doTask();

        Task3 task3 = new Task3(examples[1]);    // Задание 3
        task3.doTask();
        System.out.printf("Entropy = %.3f\n", task3.getEntropy());

        Task4 task4 = new Task4(examples[0]);                      // Задание 4
        task4.doTask();
        System.out.printf("Max entropy = %.3f\n", task4.gethMax());
        System.out.printf("Hmax - H0(A) = %.3f\n", task4.gethMax() - task4.getH());

        Task5 task5 = new Task5(examples[3]);                  // Задание 5
        task5.doTask();
        System.out.printf("First order entropy = %.3f\n", task5.getEntropy());


        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);

    }
}

