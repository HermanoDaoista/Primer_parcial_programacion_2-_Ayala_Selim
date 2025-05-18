/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;


public class Museo {
    private int capacidad;
    private ArrayList<ObraArte> obras;

    public Museo() {
        this.capacidad = 3;
        this.obras = new ArrayList<>();
    }

    public Museo(int capacidad) {
        this.capacidad = capacidad;
        this.obras = new ArrayList<>();
    }
    
    public boolean sonIguales(ObraArte obra) {
        return obras.contains(obra);
    }
    
    public void agregar(ObraArte obra){
        if(obras.size() >= capacidad){
            System.out.println("No entra mas, che");
        }else if(sonIguales(obra)){
            System.out.println("Ya esta agregada esta, che");
        }else{
            obras.add(obra);
            System.out.println("Se agrego, che");
        }
    }
    
    private double getValor(TipoValor tipo){
        double total = 0;
        for(ObraArte obra : obras){
            if(tipo == TipoValor.ESCULTURAS && obra instanceof Escultura){
                total += ((IVendible)obra).getValorComercial();
            }else if (tipo == TipoValor.PINTURAS && obra instanceof Pintura){
                total += ((IVendible)obra).getValorComercial();
            }else if(tipo == TipoValor.TODAS ){
                  total += ((IVendible)obra).getValorComercial();

            }
        }return total;
    }
    
    public double getValorDePinturas(){
        return getValor(TipoValor.PINTURAS);
    }
     public double getValorDeEsculturas(){
        return getValor(TipoValor.ESCULTURAS);
    }
      public double getValorTotal(){
        return getValor(TipoValor.TODAS);
    }
      
      public void ordenar(){
          Collections.sort(obras);
      }
      
      

      public static String mostrar(Museo museo){
          StringBuilder sb = new StringBuilder();
          sb.append("Museo Capacidad: ").append(museo.capacidad).append(" Obras");
          sb.append(System.lineSeparator());
          for(ObraArte obra : museo.obras){
              sb.append(obra.toString()).append("\n");
          }return sb.toString();
      }      
      
}
