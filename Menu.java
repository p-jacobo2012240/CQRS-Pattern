package org.hackobo.menu;

import org.hackobo.ingreso.Read;
import org.hackobo.controller.ControllerMovie;

public class Menu{

    public static void mostrarMenu(){
        
        Read _read = new Read();
        ControllerMovie _controllerMovie = new ControllerMovie();
       

        String escribe = null;
        int salir = 0;
        do{
            System.out.println("|=====================|");
            System.out.println("|      Boook Store    |");
            System.out.println("|=====================|");
            System.out.println("|      1.Movies       |");
            System.out.println("|      2.Series       |");
            System.out.println("|      3.Libros       |");
            System.out.println("|      4.Revistas     |");
            System.out.println("|      5.Salir        |");
            System.out.println("|=====================|");
            System.out.println("::>");
            int opcion = 1;
            escribe = _read.ingresarData(); 
                switch(opcion){
                    case 1:
                        _controllerMovie.mostrarMenu();
                    break;
                    default:
                        System.out.println("Selecciona una opcion");
                }
        }while(salir != 0);
    }
}