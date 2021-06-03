package usta.fis;

import java.util.Scanner;

public class Main {
import java.util.Scanner;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("╔═════════════════════════════════╗");
        System.out.println("      SoftBasicCalculatorV1.1      ");
        System.out.println(" Maker:Juan Felipe Lopez Gozalez   ");
        System.out.println("      Date: April 15 2021      ");
        System.out.println("╚═════════════════════════════════╝");
    }
    public static void p_process () {
        Scanner keyboard = new Scanner (System.in);
        int counter = 0;
        int p_total = 0;
        int v_sum = 0;

        int[] p_array_or_vector= new int [3];

        for (counter = 0; < p_array_or_vector.length; counter++){
            System.out.println("Please type your note of the cut" + counter + 1);
            p_array_or_vector[counter] = keyboard.nextInt();
            v_sum = v_sum + p_array_or_vector[Counter];
            v_average = v_sum / p_array_or_vector[counter];
        }
        System.out.println("The average of the notes is"+v_average)

        }

}
