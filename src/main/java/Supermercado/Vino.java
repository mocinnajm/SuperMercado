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
public class Vino implements ConDescuento ,EsAlimento,EsLiquido{

    public Vino(String gonzalo, String tinto, int par, int par1) {
    }
    private String marca;
    private String tipodevino;
    private int gradosdealcohol;
    private double precio;
    private double descuento;
    private LocalDate caducidad;
    private double volumen;
    private String tipoenvase;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipodevino() {
        return tipodevino;
    }

    public void setTipodevino(String tipodevino) {
        this.tipodevino = tipodevino;
    }

    public double getGradosdealcohol() {
        return gradosdealcohol;
    }

    public void setGradosdealcohol(int gradosdealcohol) {
        this.gradosdealcohol = gradosdealcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public void setDescuento(double des) {
        descuento = des; 
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio-(precio*(descuento/100));
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        return gradosdealcohol*10;
    }

    @Override
    public void setVolumen(double v) {
        volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        tipoenvase=env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoenvase;
    }

    @Override
    public String toString() {
        return "Vino{" + "marca=" + marca + ", tipodevino=" + tipodevino + 
                "\n gradosdealcohol=" + gradosdealcohol + ", precio=" + precio +
                ", descuento=" + descuento + ", caducidad=" + caducidad.format(DateTimeFormatter.ofPattern("dd/M/yyyy")) + "\n volumen=" + volumen +
                ", tipoenvase=" + tipoenvase + 
                " precio con descuento= " +getPrecioDescuento() +",calorias = " +getCalorias() +'}';
    }
    
    
}
