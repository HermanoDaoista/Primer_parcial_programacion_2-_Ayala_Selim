/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Artista {
    private String nombre;
    private String apellido;

    public Artista(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public boolean sonIguales(Artista artista,  Artista artista1){
        return true;
    }
    
    public String getNombreYApellido(){
        return nombre + " - " + apellido;
    }
    
}
