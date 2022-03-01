package com.clases;

public class smartPhone {

    // 1. Atributos
    String fabricante;
    String modelo;
    double peso;
    boolean tactil;
    int year;
    int camaras;

    // 2. Constructores
    public smartPhone(){

    }

    public smartPhone(String fabricante, String modelo, double peso, boolean tactil, int year, int camaras){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.tactil = tactil;
        this.year = year;
        this.camaras = camaras;
    }

    public smartPhone(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public smartPhone(String modelo,boolean tactil, int camaras){
        this.modelo = modelo;
        this.tactil = tactil;
        this.camaras = camaras;
    }


}
