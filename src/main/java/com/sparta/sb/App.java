package com.sparta.sb;

import com.sparta.sb.manager.EmployeeManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployeesFromFile();
    }
}
