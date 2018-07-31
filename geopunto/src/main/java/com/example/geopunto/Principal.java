package com.example.geopunto;

public class Principal {
    public static void main(String[] main) {
        GeoPunto x, y;
        x = new GeoPunto(-1.5, 3.0);
        y = new GeoPunto(-1.2, 2.4);
        x.distancia(y);
        System.out.println("Coordenadas: " + x.toString());
    }
}
