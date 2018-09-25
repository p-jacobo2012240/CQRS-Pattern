package org.hackobo.menu;

public class Menu{

    public static void mostrarMenu(){
         
        int salir = 0;
        do{
            System.out.println("|================|");
            System.out.println("| Boook Store    |");
            System.out.println("|================|");
            System.out.println("| 1.Movies       |");
            System.out.println("| 2.Series       |");
            System.out.println("| 3.Libros       |");
            System.out.println("| 4.Revistas     |");
            System.out.println("| 5.Salir        |");
            System.out.println("|================|");
            int opcion = 1;
                switch(opcion){
                    case 1:
                        System.out.println("ha seleccionado la opcion 1");
                    break;
                    default:
                        System.out.println("Selecciona una opcion");
                }
        }while(salir != 0);
    }
}