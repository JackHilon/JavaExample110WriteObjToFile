
package javaexample110writeobjtofile;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ReadObj {
    
    public static void Run(File fil) {
        
        try{
            
            FileInputStream fis = new FileInputStream(fil);
            
            ObjectInputStream ois = new ObjectInputStream(fis);
                  
            Person p = (Person) ois.readObject();
                       
            // close
            ois.close();
            fis.close();
            
            p.ShowInfo();
            System.out.println("Reading complete.............................");
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
