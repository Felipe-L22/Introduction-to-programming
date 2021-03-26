package usta.fis;
/*
 *AUTHOR      : Felipe Lopez
 *DATE        : 23 March of 2021
 *DESCRIPTION : This software calculate time between two cities
 */
import java.util.Scanner; //para usar el teclado dentro del software

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        //calculate TIME = DISTANCE / VELOCITY
        float v_time=0; //la variable v_time es decimal = float / double
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("the time between two cities is"+v_time+"hours");
    }
    public static void p_show_info_program(){
    //DATE       : 23 March of 2021
    //DESCRIPTION: this method show the info software (software)
        System.out.println("-------------------------------------------");
        System.out.println("!       SoftCalculatetTime V1.0           !");
        System.out.println("!        MAKER: Felipe Lopez              !");
        System.out.println("!DESCR: Calculated time between two cities!");
        System.out.println("!         Date: 2021-March-25             !");
        System.out.println("-------------------------------------------");
}
    public static int p_user_distance(){
        //DESCRIPTION: this method return the distance than user input
        Scanner keyboard = new Scanner(System.in); //use la variable KEYBOARD como instancia para el teclado
        int v_distance;
        System.out.println("imput/type distance between two cities:");
        v_distance= keyboard.nextInt(); //pidiendo por teclado la variable V_DISTANCE
        while (v_distance<0){
            System.err.println("ERR: the distance should be greater than zero, imput/type distance between two cities:");
            v_distance= keyboard.nextInt(); //pidiendo por teclado la variable V_DISTANCE
        }
        return v_distance;
    }

    public static int p_user_velocity(){
        //DESCRIPTION: this method return the velocity than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/type the constance velocity (KM/H between two cities");
        int v_velocity = keyboard.nextInt();
        while (v_velocity==0){
            System.err.println("ERR: the velocity cannot be same OR LESS THAN zero, input Again the velocity (KM/H)");
            v_velocity= keyboard.nextInt();
        }
        return v_velocity;
    }
}