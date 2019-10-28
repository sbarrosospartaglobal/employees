package com.sparta.sb.manager;

import com.sparta.sb.employees.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class EmployeeManager
{
    private HashMap<Integer, Employee> employeesHashmap = new HashMap<>();
    private Employee employee;
    private static final String PATH = "resources/EmployeeRecords.csv";


    public void addEmployeesFromFile()
    {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH)))
        {
            bufferedReader.readLine();
            String currentLine = bufferedReader.readLine();

            while((currentLine = bufferedReader.readLine()) != null)
            {
                String[] data = currentLine.split(",");
                employeesHashmap.put(Integer.parseInt(data[0]), new Employee(data));
            }
            bufferedReader.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public HashMap getListOfEmployees()
    {
        return employeesHashmap;
    }
}
