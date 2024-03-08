package com.salinas.costollamada.model;


import android.widget.Toast;

public class CalculoCostoLlamadaModel {

    //Datos del TDA
    private String nombreContacto;
    private int horaLlamada;
    private int minutosLlamada;
    private double costoMinutosLlamada;

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getHoraLlamada() {
        return horaLlamada;
    }

    public void setHoraLlamada(int horaLlamada) {
        this.horaLlamada = horaLlamada;
    }

    public int getMinutosLlamada() {
        return minutosLlamada;
    }

    public void setMinutosLlamada(int minutosLlamada) {
        this.minutosLlamada = minutosLlamada;
    }

    public double getCostoMinutosLlamada() {
        return costoMinutosLlamada;
    }

    public void setCostoMinutosLlamada(double costoMinutosLlamada) {
        this.costoMinutosLlamada = costoMinutosLlamada;
    }

    //Operaciones
    public String calcularCostoLlamada(){

        String resultadoCostoLlamada="";

        int tiempoHora;
        int tiempoMinutos;
        double tiempoTotal;
        double costoLlamada;

        //Ejemplo: 2 horas y 40 minutos = (2 x 60) + 40 = 120 + 40 = 160 minutos


        tiempoMinutos=minutosLlamada;
        tiempoHora=(horaLlamada*60)+tiempoMinutos;
        tiempoTotal=tiempoHora*costoMinutosLlamada;


        resultadoCostoLlamada=" El total a pagar $ " + nombreContacto
                + "\n por " + horaLlamada + " horas de llamada "
                + "\n y " + minutosLlamada + " minutos de llamada es : $ "+ tiempoTotal;

        return resultadoCostoLlamada;
    }
}
