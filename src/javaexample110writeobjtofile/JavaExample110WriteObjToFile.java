
package javaexample110writeobjtofile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class JavaExample110WriteObjToFile {

    
    public static void main(String[] args) {
        
        File folder = myHelper.CreateWorkingFolder("myWorkinFolder");
        
        myHelper.FolderCheck(folder);
        
        File fil = myHelper.CreateWorkingFile(folder, "objData.dat");
        
        myHelper.FileCheck(fil);
        
        //----------------------------------------------------------------------
        
        WriteObj.Run(fil);
        
        //----------------------------------------------------------------------
        
        ReadObj.Run(fil);
    }
    
}
