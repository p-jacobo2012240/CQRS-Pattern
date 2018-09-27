package org.hackobo.ingreso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Read{

    public String ingresarData(){
        String data = null;
        BufferedReader _read = new BufferedReader(new InputStreamReader(System.in));
        try{
            data = _read.readLine();
        }catch(IOException ioe) {
            System.out.println("Se equivoco al escribir" + ioe);
             System.exit(1);
        }
        return  data;
    }
 
}
