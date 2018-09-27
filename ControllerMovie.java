package org.hackobo.controller;

import java.util.ArrayList;
import org.hackobo.bean.Movie;
import org.hackobo.ingreso.Read;

public class ControllerMovie {

    public static ArrayList<Movie> _movie = new ArrayList<Movie>();
    Read _read = new Read();
    
   
    public static void mostrarMenu(){
        System.out.println("Holi");
        /*do{
            int op = 0;
            System.out.println("|====================|");
            System.out.println("|     CRUD-Movies    |");
            System.out.println("|====================|");
            System.out.println("|    1-Create        |");
            System.out.println("|    2-Read          |");
            System.out.println("|    3-Update        |");
            System.out.println("|    4-Delete        |");
            System.out.println("|====================|");
            System.out.println("::>");
            op = _read.ingresarData();
                switch (op) {
                    case 1:
                        System.out.println("hola soy el crear");
                    break;
                
                    default:
                        System.out.println("Selecciona algo");
                        break;
                }
    
        }while(op != 0);*/
    }

}