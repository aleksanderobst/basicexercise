import javafx.scene.shape.Circle;
import javafx.scene.shape.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Dodatkowe3 {
    public static void main(String[] args) throws IOException {
        System.out.println("===================================================================================");
        System.out.println("a.  Prostokąt");
        for (int i=0; i<2;i++) {
            System.out.print("*");

            for (int j = 0; j < 3; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("===================================================================================");
        System.out.println("b.  Trójkąt");

                BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
                Graphics g = image.getGraphics();
                g.setFont(new Font("Dialog", Font.BOLD, 24));
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                graphics.drawString("▷", 6, 24);
                ImageIO.write(image, "png", new File("text.png"));

                for (int y = 0; y < 32; y++) {
                    StringBuilder sb = new StringBuilder();
                    for (int x = 0; x < 144; x++)
                        sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y) == -1 ? "# " : "* ");
                    if (sb.toString().trim().isEmpty()) continue;
                    System.out.println(sb);
                }

        System.out.println("===================================================================================");
        int noOfTimes = 4;
        String pattern = "#";


                for(int i=1; i<=4; i++) {

            System.out.println();


                    if(i==1 || i==4) {

                        for(int j=1; j<=6; j++){

                            System.out.print(pattern+"");

                        }
                    }          else {

                for(int k=1; k<=6;k++) {

                    if(k==1 || k == 6) {

                        System.out.print(pattern + "");

                    }
                    else {

                        System.out.print(" ");

                    }
                }

            }
        }
        System.out.println();
        System.out.println();
        System.out.println("============================================================================================");
        System.out.println();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) {
                {System.out.print("#"+" ");}
            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==10){
                    System.out.print("  ");
                }
                else if (j==1){
                    System.out.print("  ");
                }
                else if (j==2){
                    System.out.print("  ");
                }
                else if (j==3){
                    System.out.print("  ");
                }
                else if (j==4){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");
                }
                else if (j==7){
                    System.out.print("  ");
                }


                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }
//================================================
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==10){
                    System.out.print("  ");
                }
                else if (j==1){
                    System.out.print("  ");
                }

                else if (j==3){
                    System.out.print("  ");
                }

                else if (j==2){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }

        //================================================
        //================================================
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==10){
                    System.out.print("  ");
                }
                else if (j==1){
                    System.out.print("  ");
                }

                else if (j==2){
                    System.out.print("  ");
                }

                else if (j==4){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }

        //================================================
        //================================================
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==10){
                    System.out.print("  ");
                }
                else if (j==1){
                    System.out.print("  ");
                }


                else if (j==3){
                    System.out.print("  ");
                }

                else if (j==4){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }

        //================================================
        //================================================
        for (int i = 10; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==0){
                    System.out.print("  ");
                }


                else if (j==2){
                    System.out.print("  ");
                }

                else if (j==3){
                    System.out.print("  ");
                }
                else if (j==4){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}
//======================================================\




            }
            System.out.println();
        }
        for (int i = 10; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    System.out.print("  ");
                } else if (j == 2) {
                    System.out.print("  ");
                } else if (j == 3) {
                    System.out.print("  ");
                } else if (j == 4) {
                    System.out.print("  ");
                } else if (j == 5) {
                    System.out.print("  ");
                } else if (j == 6) {
                    System.out.print("  ");

                } else if (j == 7) {
                    System.out.print("  ");
                } else {
                    System.out.print("#" + " ");
                }
            }

        System.out.println();
    }
        for (int i = 10; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 0) {
                    System.out.print("  ");
                } else if (j == 2) {
                    System.out.print("  ");
                } else if (j == 3) {
                    System.out.print("  ");
                } else if (j == 4) {
                    System.out.print("  ");
                } else if (j == 5) {
                    System.out.print("  ");
                } else if (j == 6) {
                    System.out.print("  ");

                } else if (j == 7) {
                    System.out.print("  ");
                } else {
                    System.out.print("#" + " ");
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==10){
                    System.out.print("  ");
                }
                else if (j==2){
                    System.out.print("  ");
                }

                else if (j==4){
                    System.out.print("  ");
                }

                else if (j==3){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 8; j++) {
                if (j==1){
                    System.out.print("  ");
                }
                else if (j==2){
                    System.out.print("  ");
                }

                else if (j==4){
                    System.out.print("  ");
                }

                else if (j==3){
                    System.out.print("  ");
                }
                else if (j==5){
                    System.out.print("  ");
                }
                else if (j==6){
                    System.out.print("  ");

                }
                else if (j==7){
                    System.out.print("  ");
                }
                else {System.out.print("#"+" ");}





            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============================================================================================");
int n=5;
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();


    }

    }}









