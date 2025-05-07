package com.pluralsight;


import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.startTime = 0;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }
    }

/*    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }*/


    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public void punchIn(double time){
        startTime = 0;
    }

    public void punchOut (double time){
        double duration = time - startTime;
        hoursWorked += duration;

    }
    public void punchIn(){
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        int min = time.getMinute();
        double punchInTime = hour + (min/60);
        startTime = punchInTime;
    }

    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();
        double time = hour + (min/60);
        double duration = time-startTime;
        hoursWorked += duration;
        startTime = 0;
    }
}

