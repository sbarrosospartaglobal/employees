package com.sparta.sb.employees;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee
{
    private int employeeID;
    private String prefix;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private char gender;
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private int salary;

    public Employee(String[] employeeRecord)
    {
        parsingAndInitialising(employeeRecord);
    }

    private void parsingAndInitialising(String[] employeeRecord)
    {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        employeeID = Integer.parseInt(employeeRecord[0]);
        prefix = employeeRecord[1];
        firstName = employeeRecord[2];
        middleInitial = employeeRecord[3].charAt(0);
        lastName = employeeRecord[4];
        gender = employeeRecord[5].charAt(0);
        email = employeeRecord[6];
        dateOfBirth = LocalDate.parse(employeeRecord[7], dateTimeFormatter);
        dateOfJoining = LocalDate.parse(employeeRecord[8], dateTimeFormatter);
        salary = Integer.parseInt(employeeRecord[9]);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }
}