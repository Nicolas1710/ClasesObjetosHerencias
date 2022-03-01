package com.clases;

public class smartWatch {

    // 1. Atributos
    String fabricante;
    String modelo;
    double peso;
    boolean tactil;
    int year;

    // 2. Constructores
    public smartWatch(){

    }

    public smartWatch(String fabricante, String modelo, double peso, boolean tactil, int year){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.peso = peso;
    this.tactil = tactil;
    this.year = year;
    }

    public smartWatch(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public smartWatch(String modelo, double peso, boolean tactil) {
        this.modelo = modelo;
        this.peso = peso;
        this.tactil = tactil;
    }

    // 3. Metodos (Comportamientos)





}
