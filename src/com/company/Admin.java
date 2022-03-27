package com.company;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Admin implements AdminMbean {
    public void init() throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.company:type=Admin");
        StandardMBean mbean = new StandardMBean(new Admin(), AdminMbean.class);
        mbs.registerMBean(mbean, name);
    }

    @Override
    public void task2(String line) {
        Task2 task2 = new Task2(line);
        task2.doTask();
    }

    @Override
    public void task3(String line) {
        Task3 task3 = new Task3(line);
        task3.doTask();
        System.out.printf("Entropy = %.3f\n", task3.getEntropy());
    }

    @Override
    public void task4(String line) {
        Task4 task4 = new Task4(line);
        task4.doTask();
        System.out.printf("Max entropy = %.3f\n", task4.gethMax());
        System.out.printf("Hmax - H0(A) = %.3f\n", task4.gethMax() - task4.getH());
    }

    @Override
    public void task5(String line) {
        Task5 task5 = new Task5(line);
        task5.doTask();
        System.out.printf("First order entropy = %.3f\n", task5.getEntropy());
    }
}
