/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample110writeobjtofile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

/**
 *
 * @author marka
 */
public class WriteObj {
    
    public static void Run(File fil) {
        
        try{
            
            FileOutputStream fos = new FileOutputStream(fil);
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            Person person = new Person();
            
            oos.writeObject(person);
            
            // close
            oos.close();
            fos.close();
            
            person.ShowInfo();
            System.out.println("Writing complete.............................");
        }
        catch(NotSerializableException e)
        {
            /*
            Thrown when an instance is required to have a Serializable interface.
            The serialization runtime or the class of the instance can throw 
            this exception. The argument should be the name of the class.
            */
            myHelper.ExceptionHandle(e);   
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
