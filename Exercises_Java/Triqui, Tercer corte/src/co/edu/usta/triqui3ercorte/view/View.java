package co.edu.usta.triqui3ercorte.view;
import javax.swing.*;
import co.edu.usta.triqui3ercorte.logic.Logic;
public class View {
    public static Logic mytriqui;


    public static void main(String[] args) {
        mytriqui = new Logic();
        String respuesta;
        int mododejuego;
        int jugador_fila;
        int jugador_columna;
        int turno;
        char ganador = 0;
        int limite = 0;
        boolean findeljuego = false;
    }
}