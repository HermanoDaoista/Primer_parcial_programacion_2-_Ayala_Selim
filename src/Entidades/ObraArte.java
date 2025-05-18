/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author rogel
 */
public abstract class ObraArte implements Comparable<ObraArte>{
    protected Artista artista;
    protected int cantidadDeElementos;
    protected String titulo;
    protected double valor;
    protected static Random generadorDeElementos;

    
    static {
        generadorDeElementos = new Random();
    }
    
    public ObraArte(String titulo, double valor, Artista artista) {
        this.artista = artista;
        this.titulo = titulo;
        this.valor = valor;
        this.cantidadDeElementos = generadorDeElementos.nextInt(10)+1;
    }

    public ObraArte(String titulo, double valor, String nombre, String apellido) {
        this.titulo = titulo;
        this.valor = valor;
        this.artista = new Artista(nombre, apellido);
        }
    
    public int getCantidadDeElementos(){
        if(cantidadDeElementos == 0){
            cantidadDeElementos = generadorDeElementos.nextInt(10) +1;
        }return cantidadDeElementos;
    }
    
    private static String mostrar(ObraArte obraarte){
    StringBuilder sb = new StringBuilder();
    sb.append("Artista: ").append(obraarte.artista);
    sb.append(System.lineSeparator());
    sb.append("Titulo: ").append(obraarte.titulo);
    sb.append(System.lineSeparator());
    sb.append("Valor de la Obra: ").append(obraarte.valor);
    sb.append(System.lineSeparator());
    sb.append("Cantidad de Elementos: ").append(obraarte.getCantidadDeElementos());
    return sb.toString();



    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ObraArte other = (ObraArte) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObraArte{");
        sb.append("artista=").append(artista);
        sb.append(", cantidadDeElementos=").append(cantidadDeElementos);
        sb.append(", titulo=").append(titulo);
        sb.append('}');
        return sb.toString();
    }
    
    public static boolean sonIguales(ObraArte obra1, ObraArte obra2){
        return obra1.equals(obra2);
    }
    
    @Override
    public int compareTo(ObraArte otra){
        return this.titulo.compareTo(otra.titulo);
    }
    
    
    
    
    
}
