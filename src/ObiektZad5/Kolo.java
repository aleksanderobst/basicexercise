package ObiektZad5;

public class Kolo {


        private double r;

        public Kolo(double r) {
            this.r = r;
        }

        public double obliczObwod(double r){
            return 2*Math.PI*r;
        }

        public double obliczPole(double r){
            return (Math.PI*r*r);
        }

        public double getR() {
            return r;
        }

        public void setR(double r) {
            this.r = r;
        }

        @Override
        public String toString() {
            return "MainKolo{" +
                    "r=" + r +
                    '}';
        }
    }


