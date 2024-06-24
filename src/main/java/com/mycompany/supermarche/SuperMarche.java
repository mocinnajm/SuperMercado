/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermarche;

import Supermercado.*;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author mosin
 */
public class SuperMarche {

    public static void main(String[] args) {
        Detergente det1 = new Detergente("koko", 1.99);
        det1.setVolumen(33);
        det1.setTipoEnvase("botella de plastico peq");
        det1.setDescuento(2);
        System.out.println(det1);
        
        Cereales cere1 = new Cereales("andaluz", 2.85, "espelta");
        cere1.setCaducidad(LocalDate.of(2022,9,28));
    
        System.out.println(cere1);
        Vino vin1 = new Vino("gonzalo","tinto",32,10);
        
        vin1.setVolumen(50);
        vin1.setTipoEnvase("botella de cristal");
        vin1.setCaducidad(LocalDate.of(2023, 7, 12));
        vin1.setDescuento(30);
        vin1.setGradosdealcohol(36);
        vin1.setMarca("bambara");
        vin1.setPrecio(4.89);
        vin1.setTipodevino("blanco");
        
        System.out.println(vin1);
        ArrayList<EsAlimento> lista = new ArrayList<>();
        lista.add(vin1);
        lista.add(cere1);
        int totalcalorias= 0;
        for(EsAlimento alimento :lista){
            totalcalorias+=alimento.getCalorias();
        
          }
           System.out.println("Total calorias: " +totalcalorias);
        
        
    }
}
