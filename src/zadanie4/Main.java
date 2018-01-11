package zadanie4;

public class Main {
    public static void main(String[] args) {
        boolean jest_cieplo = true;
        boolean wieje_wiatr = true;
        boolean swieci_slonce = true;

        boolean ubieram_sie_cieplo = false;
        boolean biore_parasol = false;
        boolean ubieram_kurtke = false;

        if (wieje_wiatr == true || jest_cieplo == false){
            ubieram_sie_cieplo = true;
        }

        System.out.println("Ubieram się ciepło: "+ ubieram_sie_cieplo);



     if(swieci_slonce == false && wieje_wiatr == false){
        biore_parasol = true;

    }
        System.out.println("Biore parasol: "+ biore_parasol);


//==========================================================
 if (wieje_wiatr == true && swieci_slonce == false && jest_cieplo == false){
         ubieram_kurtke = true;

         }
         System.out.println("Ubieram kurtkę: "+ ubieram_sie_cieplo);
    }
}


