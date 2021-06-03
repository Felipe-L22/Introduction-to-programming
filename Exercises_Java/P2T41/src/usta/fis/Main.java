package usta.fis;

import java.util.Scanner;

public class Main {
    Scanner keyboard = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("      SoftBasicCalculatorV1.1      ");
        System.out.println(" Maker:Juan Felipe Lopez Gozalez   ");
        System.out.println("      Date: April 15 2021      ");
        System.out.println("-----------------------------------");

    public static void main(String[] args) {
        float v_sum = 0;
        int counter;
        Scanner entrada = new Scanner(System.in);
        int[] numbers = new int[4];
        for (counter = 0; counter < 3; counter++) {
            System.out.print((counter + 1) + "ponga el numero: ");
            numbers[counter] = entrada.nextInt();
            v_sum = v_sum + numbers[counter];
        }
        System.out.println("the avarage of all the term is:" + (v_sum / counter) + ".");

        for (counter = 0; counter < numbers.length; counter++) {
            System.out.println("su nota del corte es" + (counter+1) + " es "+ numbers[counter
                    ]);
            Scanner keyboard = new Scanner(System.in);
            float v_total = 0;
            counter = 0;
            System.out.println("please put the numbers of term that you did: ");
            int v_term = keyboard.nextInt();
            float[] v_numbers = new float[v_term];

            for(counter=0;counter<v_term;counter++) {
                System.out.println("Digite la nota del corte " + (counter + 1) + ":");
                v_numbers[counter] = keyboard.nextFloat();
            }
            for(counter=0;counter<v_term;counter++) {
                if (counter==0)
                    System.out.println("su calificación del corte " + (counter + 1) + " es:" + v_numbers[counter]*0.1);
            }
            if (counter==1)
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + v_numbers[counter]*0.3);
            if (counter==2)
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + (0.6/(v_numbers.length-2)));
            v_total=(v_total+counter)/v_term;
            System.out.println("su promedio es:"+v_total);
        }



    }
}
