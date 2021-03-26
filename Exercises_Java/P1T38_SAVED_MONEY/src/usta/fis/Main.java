package usta.fis;

import java.util.Scanner;

/*
 +AUTHOR: Felipe Lopez
 *DATE: 23 march of 2021
 *DESCRIPTION: This software calculate the total money saved in a year
 */
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1;i<=12;i=i+1) {
            System.out.println("----Month"+i+"----");
            v_total_saved=v_total_saved+p_user_saved_money();

        }
        System.out.println("The total saved money in year is $"+v_total_saved);
    }

    public static void p_show_info_program() {
        //DESCRIPTION: this method show info program (software)
        System.out.println("-------------------------------------------");
        System.out.println("!          SoftSavedMoney V1.0            !");
        System.out.println("!        MAKER: Felipe Lopez              !");
        System.out.println("!         Date: 2021-March-25             !");
        System.out.println("-------------------------------------------");
    }
    public static int p_user_saved_money(){
        //DESCRIPTION: this method return the saverd money in month
        Scanner keyboard = new Scanner(System.in);
        int v_saved_money = keyboard.nextInt();
        while(){
            System.err.println("ERR you saved money cannot be less than zero, Input again she saved money (CO)$:");
            v_saved_money= keyboard.nextInt();
        }
    }
}
