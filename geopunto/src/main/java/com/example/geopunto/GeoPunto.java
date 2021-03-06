package com.example.geopunto;

public class GeoPunto {
    private double longitud, latitud;

    public GeoPunto(double longitud, double latitud) {
        this.longitud = (int) (longitud * 1E6);
        this.latitud = (int) (latitud * 1E6);
    }

    public String toString(){
        return longitud + "+" + latitud;
    }

    /** El cálculo de la distancia de círculo máximo entre dos puntos de un globo
     * @param punto la coordenada que aproximamos.
     */
    public double distancia(GeoPunto punto){
        final double RADIO_TIERRA = 6371000;
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;

    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
