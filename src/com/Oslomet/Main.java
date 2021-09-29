package com.Oslomet; //oppgave 1
//gruppe 38: Louise Guren, Hamid Hamrah og Stian Ha

class Sirkel {

    public static double diameter(double radius) {
        return radius*2;
    }
    public static double omkrets(double radius) {
        return 2*radius*Math.PI;
    }
    public static double areal(double radius) {
        return Math.PI*Math.pow(radius,2);
    }
}

public class Main {
    public static void main(String[] args) {

        double radius = 23.5;

        System.out.println("Gitt radius lik " + String.format("%.2f", radius));

        System.out.println("Diameteren til sirkelen med radius " + String.format("%.2f", radius) + " er " + String.format("%.2f", Sirkel.diameter(radius)));

        System.out.println("Omkretsen av sirkelen med radius " + String.format("%.2f", radius) + " er " + String.format("%.2f", Sirkel.omkrets(radius)));

        System.out.println("Arealet av sirkelen med radius " + String.format("%.2f", radius) + " er " + String.format("%.2f", Sirkel.areal(radius)));
    }
}


//sdlkfjlksdjf sdlfkj Dette er en test

