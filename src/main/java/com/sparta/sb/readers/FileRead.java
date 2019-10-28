package com.sparta.sb.readers;

import com.sparta.sb.employees.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    private BufferedReader bufferedReader;
    private static final String PATH = "resources/EmployeeRecords";

    public void readFile()
    {
        try(BufferedReader in = new BufferedReader(new FileReader("PATH")))
        {
            String currentLine = bufferedReader.readLine();

            while((currentLine = bufferedReader.readLine()) != null)
            {
                String[] data = currentLine.split(",");
            }

            bufferedReader.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}
