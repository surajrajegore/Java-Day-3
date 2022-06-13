package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args)
    {
        System.out.println("Welcome to employeewage computation");
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR=20;
        int workingHour=0;
        int empType = (int) (Math.random() * 100) % 3;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
            workingHour = 8;
        } else if(empType==PART_TIME)
        {
            System.out.println("Employee is Part Time");
            workingHour=4;
        }else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHour * WAGE_PER_HOUR;
        System.out.println("Employee Daily wage is "+wage);
    }
}
