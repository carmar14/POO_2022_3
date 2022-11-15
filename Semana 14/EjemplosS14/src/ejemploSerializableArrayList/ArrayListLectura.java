/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploSerializableArrayList;

/**
 *
 * @author Acer
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
 
public class ArrayListLectura 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Employee> employees = new ArrayList<>();
         
        try
        {
            FileInputStream fis = new FileInputStream("employeeData");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            employees = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
         
        //Verify list data
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}