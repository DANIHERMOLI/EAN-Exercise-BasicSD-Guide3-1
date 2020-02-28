package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws  InterruptedException {

        ArrayList<Employee> employeeList = new ArrayList<>();
        boolean exit = false;
        Employee test1 = new Employee(1, "test1", 123, "dept1", "ch1");
        Employee test2 = new Employee(2, "test2", 456, "dept1", "ch2");
        Employee test3 = new Employee(3, "test3", 789, "dept2", "ch3");
        Employee test4 = new Employee(4, "test4", 1346, "dept2", "ch4");
        Employee test5 = new Employee(5, "test5", 4679, "dept3", "ch5");
        employeeList.add(test1);
        employeeList.add(test2);
        employeeList.add(test3);
        employeeList.add(test4);
        employeeList.add(test5);
        do {

            int option = menu();
            switch (option) {
                case 1:
                    Employee employee = new Employee();
                    boolean intChecker;
                    do {
                        System.out.println("Enter the ID of the employee:");
                        intChecker = input.hasNextInt();
                        if(intChecker) {
                            employee.setId(input.nextInt());
                            break;
                        } else {
                            System.out.println("ERROR: Invalid input. Please use Integers");
                            System.out.println();
                        }
                        input.nextLine();
                    } while(true);
                    System.out.println("Enter the NAME of the employee:");
                    employee.setName(input.next().toLowerCase());
                    do {
                        System.out.println("Enter the SALARY of the employee:");
                        intChecker = input.hasNextLong();
                        if(intChecker) {
                            employee.setSalary(input.nextLong());
                            break;
                        } else {
                            System.out.println("ERROR: Invalid input. Please use Integers");
                        }
                        input.nextLine();
                    } while(true);
                    System.out.println("Enter the DEPARTMENT of the employee:");
                    employee.setDepartment(input.next().toLowerCase());
                    System.out.println("Enter the CHARGE of the employee:");
                    employee.setCharge(input.next().toLowerCase());
                    employeeList.add(employee);
                    break;
                case 2:
                    for(int i = 0; i < employeeList.size() - 1; i++) {
                        System.out.println(employeeList.get(i));
                        System.out.println();
                    }
//                    for(Employee employee : employeeList ) {
//                        System.out.println(employee.getName());
//                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Exiting app.");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    public static int menu() throws InterruptedException {

        int option;
        do {
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1. Add a new employee.");
            System.out.println("2. Print the list of employees.");
            System.out.println("3. Print the list of employees by department.");
            System.out.println("4. Increase the salary of all employees by 10%");
            System.out.println("5. Print the sum of all salaries.");
            System.out.println("0. To exit the app.");
            System.out.println();
            System.out.println("Please enter the number of what you want to execute: ");
            boolean optionChecker = input.hasNextInt();
            if(optionChecker) {
                option = input.nextInt();
                switch (option) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 0:
                        return 0;
                    default:
                        System.out.println("ERROR: Invalid Option.");
                        System.out.println("ERROR: Please enter a number between 1 and 5. Or 0 to exit.");
                        Thread.sleep(3500);
                        break;
                }
            } else {
                System.out.println("ERROR: Invalid option.");
                System.out.println("ERROR: Letters are not allowed.");
                System.out.println("ERROR: Please enter a number between 1 and 5. Or 0 to exit.");
                Thread.sleep(3500);
            }
            input.nextLine();
        } while (true);
    }

}
