package usta.fis;
/*
 * AUTHOR: Juan D Buitrago L - Felipe Lopez - Edward Avila
 * DATE: 26-March-2021
 * DESCRIPTION: This software calculates the height of 5 children (Parcial)
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_average=0;
        int v_sum=0;
        for (int i=1; i<=5;i=i+1){
            System.out.println("----Children "+i+"----");
            v_sum=v_sum+p_user_height();
            v_average= v_sum/5 ;
        }
        System.out.println("The average of the height is:"+v_average);
    }

    public static void p_show_info_program() {
        //DESCRIPTION: This method show info program (software)
        System.out.println("-----------------------------------------------------");
        System.out.println("           SoftHeightChildren V1.0                   ");
        System.out.println("Maker: Juan D Buitrago L- Felipe Lopez - Edward Avila");
        System.out.println("           Date: 2021-March-26");
        System.out.println("-----------------------------------------------------");
    }

    public static int p_user_height(){
        //DESCRIPTION: This method return the height of the children
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input your height");
        int v_height = keyboard.nextInt();
        while (v_height < 50 || v_height >200){
            System.err.println("ERR: The height cannot be less than 50cm or grater than 200cm, Input again the height");
            v_height = keyboard.nextInt();
        }
        while (v_height >200){
            System.err.println("ERR: The height cannot be less than 50cm or grater than 200cm, Input again the height");
            v_height = keyboard.nextInt();
        }
        return v_height;
    }
}
