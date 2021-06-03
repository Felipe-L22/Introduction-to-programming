package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)

    {
        Scanner Keyboard = new Scanner(System.in);
        int Before = 0,
                Next = 1,
                Result = 0,
                Limit = 0;

        System.out.println("Por favor indique cuandos numeros le gustaria ver en la secuencia fibonacci");
        Limit = Keyboard.nextInt();
        for (int Actual = 0; Actual < Limit; Actual++) {
            System.out.print(Before + ",");
            Result = Before + Next;
            Before = Next;
            Next = Result;


        }
    }
}