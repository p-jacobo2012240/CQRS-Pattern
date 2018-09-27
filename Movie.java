package org.hackobo.bean;

public class Movie{
    
        int id_movie = 0;
        String nombre = null;
        String calificacion = null;
        
        //Constructor
        public Movie(int id_movie, String nombre, String calificacion ){
            this.id_movie = id_movie;
            this.nombre = nombre;
            this.calificacion = calificacion;
        }
    
        //GETTERS
        public int getIdMovie(){
            return id_movie;
        }
        public String getNombre(){
            return nombre;
        }
        
        public String getCalificacion(){
            return calificacion;
        }
    
        //SETTERS
        public void setIdMovie(int id_movie){
            this.id_movie = id_movie;
        }
        
        public void setNombre(String nombre ){
            this.nombre = nombre;
        }
    
        public void setCalificacion(String calificacion){
            this.calificacion = calificacion;
        }
    
    }