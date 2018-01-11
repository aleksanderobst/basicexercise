
    public class Dice {
        private int result;
        public Dice (int result){
            this.result = result;
        }


        public String toString() {
            return "["+ result + "]";
        }

        public static void main(String[] args) {
        for (int i = 1; i <= 6; i++){
            Dice dice = new Dice(4);
            System.out.println(dice.toString());}
        }
    }
