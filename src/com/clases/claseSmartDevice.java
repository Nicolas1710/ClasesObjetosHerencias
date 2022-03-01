package com.clases;

public class claseSmartDevice {

    public static void main(String[] args) {


        // SMARTWATCH
        smartWatch appleWatch2 = new smartWatch();

        System.out.println("Smartwatch");
        System.out.println(1);
        smartWatch appleWatch3 = new smartWatch("Series 3",0.7, false   );
        System.out.println("Modelo: " + appleWatch3.modelo);
        System.out.println("Peso: " + appleWatch3.peso);
        System.out.println("Es tactil: " + appleWatch3.tactil);

        System.out.println(2);
        smartWatch huaweiWatch1 = new smartWatch("Huawei","G21", 0.5,true,2021);
        System.out.println("Fabricante: " + huaweiWatch1.fabricante);
        System.out.println("Modelo: " + huaweiWatch1.modelo);
        System.out.println("Peso: " + huaweiWatch1.peso);
        System.out.println("Es tactil: " + huaweiWatch1.tactil);
        System.out.println("Fecha de salida al mercado: " + huaweiWatch1.year);

        // SMARTPHONES
        smartPhone apple7 = new smartPhone();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Smartphone");
        System.out.println(1);
        smartPhone apple7pro = new smartPhone("Apple", "7 PRO", 0.97, true, 2017,2);
        System.out.println("Fabricante: " + apple7pro.fabricante);
        System.out.println( "Modelo: " + apple7pro.modelo);
        System.out.println("Peso: " + apple7pro.peso);
        System.out.println("Es tactil: " + apple7pro.tactil);
        System.out.println("Fecha de salida al mercado: " + apple7pro.year);
        System.out.println("Cuantas camaras tiene: " + apple7pro.camaras);

        System.out.println(2);
        smartPhone galaxya10 = new smartPhone("Samsung", "A10");
        System.out.println("Fabricante: " + galaxya10.fabricante);
        System.out.println("Modelo: " + galaxya10.modelo);

        System.out.println(3);
        smartPhone iphone11pro = new smartPhone("11 PRO", true, 5);
        System.out.println("Modelo: " + iphone11pro.modelo);
        System.out.println("Es tactil: " + iphone11pro.tactil);
        System.out.println("Cuantas camaras tiene: " + iphone11pro.camaras);

        System.out.println("Fin del programa");
    }
}
