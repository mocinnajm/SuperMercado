/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mosin
 */
public class Cereales implements EsAlimento{
    private String marca;
    private double precio;
    private String tipocereal;
    private LocalDate caducidad;

    public Cereales(String marca, double precio, String tipocereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipocereal = tipocereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipocereal() {
        return tipocereal;
    }

    public void setTipocereal(String tipocereal) {
        this.tipocereal = tipocereal;
    }
    
    
            
    
    
    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad=fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if(tipocereal.equals("espelta")){
            return 5;
        
        
        }else if(tipocereal.equals("maiz")){
            return 8;
            
        
        
        }else if(tipocereal.equals("trigo")){
            return 8;
        
        }else{
            return 15;
        
        } 
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", precio=" + precio + ", tipocereal=" + tipocereal + 
                ", caducidad=" + caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
                ",calorias= " + getCalorias() +'}';
    }
    
    
}
