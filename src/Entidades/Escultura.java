/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;


public class Escultura extends ObraArte implements IVendible{
    
    private MaterialEscultura material;

    public Escultura(String titulo, double valor, Artista artista, MaterialEscultura material) {
        super(titulo, valor, artista);
        this.material = material;
    }

    public Escultura(String titulo, double valor, String nombre, String apellido, MaterialEscultura material) {
        super(titulo, valor, nombre, apellido);
        this.material = material;
    }
    

    @Override
    public double getValorComercial() {
        if(material == MaterialEscultura.BRONCE){
            valor += valor * 0.50;
        }else if(material == MaterialEscultura.MADERA){
            valor += valor * 0.40;
        }else if(material == MaterialEscultura.MARMOL){
            valor += valor * 0.20;
        }return valor;
    }
@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor de la escultura: ").append(artista.getNombreYApellido());
        sb.append(System.lineSeparator());
        sb.append("Titulo: ").append(super.titulo);
        sb.append(System.lineSeparator());
        sb.append("Material: ").append(this.material);
        sb.append(System.lineSeparator());
        sb.append("Valor: ").append(super.valor);
        return sb.toString();    
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Escultura otra = (Escultura) obj;
        return super.equals(otra) && this.material.equals(otra.material);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.material);
        return hash;
    }

}




