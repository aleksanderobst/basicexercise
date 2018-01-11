package ObiektZad8;

import java.util.Scanner;

public class QuadraticEquation {



        private double A, B, C; //w nim zapiszemy swoje imie
        private double delta = 0;

        public QuadraticEquation() {
            this.delta = 0;
            this.A = 0;
            this.B = 0;
            this.C = 0;

        }

    public QuadraticEquation( double a, double b, double c, double delta ) {
        A = a;
        B = b;
        C = c;
        this.delta = delta;
    }

    public double calculateDelta(double A, double B, double C){
        return delta = (B * B) - (4 * A * C);
    }

    public double calculateX1(double A, double B, double C){

        return  ((-B - Math.sqrt(delta)) / (2 * A));
    }

    public double calculateX2(double A, double B, double C){

        return  ((-B + Math.sqrt(delta)) / (2 * A));
    }

    public double calculateX3(double A, double B, double C){
        double x3;
        return x3 =  (-B) / (2 * A);
    }

    public double getA() {
        return A;
    }

    public void setA( double a ) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB( double b ) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC( double c ) {
        C = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta( double delta ) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", delta=" + delta +
                '}';
    }



    }

