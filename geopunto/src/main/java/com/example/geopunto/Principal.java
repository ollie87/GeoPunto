package com.example.geopunto;

public class Principal {
    public static void main(String[] main) {
        GeoPunto x, y;
        x = new GeoPunto(-4.7285413,  41.6522966);
        y = new GeoPunto(-4.5649220, 41.9860072);
        x.distancia(y);
        System.out.println("Coordenadas: " + x.toString());
    }
}
