/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author rogel
 */
public class Pintura extends ObraArte implements IVendible{
    private TecnicaPintura pintura;

    public Pintura( String titulo, double valor, Artista artista, TecnicaPintura pintura) {
        super(titulo, valor, artista);
        this.pintura = pintura;
    }

    public Pintura(String titulo, double valor, String nombre, String apellido, TecnicaPintura pintura) {
        super(titulo, valor, nombre, apellido);
        this.pintura = pintura;
    }

    
    
    @Override
    public double getValorComercial() {
        if(pintura == TecnicaPintura.ACRILICO){
            valor += valor * 0.30;
        }else if(pintura == TecnicaPintura.ACUARELA){
            valor += valor * 0.20;
        }else if(pintura == TecnicaPintura.OLEO){
            valor += valor * 0.10;
        }return valor;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autor de la pintura: ").append(artista.getNombreYApellido());
        sb.append(System.lineSeparator());
        sb.append("Titulo: ").append(super.titulo);
        sb.append(System.lineSeparator());
        sb.append("Tecnica: ").append(this.pintura);
        sb.append(System.lineSeparator());
        sb.append("Valor: ").append(super.valor);
        return sb.toString();
                
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pintura otra = (Pintura) obj;
        return super.equals(otra) && this.pintura.equals(otra.pintura);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.pintura);
        return hash;
    }
    
}
