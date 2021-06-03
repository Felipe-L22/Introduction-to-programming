package co.edu.usta.triqui3ercorte.logic;
import javax.swing.*;
public class Logic {
    public class logicatriqui {

        private char[][] triquiarray;
        private String respuesta;
        private boolean findeljuego = false;
        String matrizvisual = "";

        //Metodo crearmatriz
        public void crearmatriz(int mododejuego) {
            if (mododejuego == 1) {
                triquiarray = new char[3][3];
            }
            if (mododejuego == 2) {
                triquiarray = new char[5][5];
            }

            for (int i = 0; i < triquiarray.length; i++) {
                for (int j = 0; j < triquiarray.length; j++) {
                    triquiarray[i][j] = '-';
                }
            }
        }

        //Metodo mostrazmatriz
        public String mostrarmatriz() {
            matrizvisual = "";
            for (int i = 0; i < triquiarray.length; i++) {
                for (int j = 0; j < triquiarray.length; j++) {
                    matrizvisual = matrizvisual + triquiarray[i][j] + "    ";
                }
                matrizvisual = matrizvisual + "\n";
            }
            return matrizvisual;
        }

        //Metodo interactuarmatriz
        public void interactuarmatriz(int jugador_fila, int jugador_columna, int turno, int mododejuego) {
//Seguridad en caso de que el usuario ponga valores fuera de los permitidos
            if (mododejuego == 1) {
                while (jugador_columna < 0 || jugador_columna > 2 || jugador_fila < 0 || jugador_fila > 2) {
                    JOptionPane.showMessageDialog(null, "Los numeros solo pueden ir del 0 al 2 en el modo 3x3");
                    respuesta = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                    jugador_fila = Integer.parseInt(respuesta);
                    respuesta = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                    jugador_columna = Integer.parseInt(respuesta);
                }
            }
            if (mododejuego == 2) {
                while (jugador_columna < 0 || jugador_columna > 4 || jugador_fila < 0 || jugador_fila > 4) {
                    JOptionPane.showMessageDialog(null, "Los numeros solo pueden ir del 0 al 4 en el modo 5x5");
                    respuesta = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                    jugador_fila = Integer.parseInt(respuesta);
                    respuesta = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                    jugador_columna = Integer.parseInt(respuesta);
                }
            }
//Seguridad en caso de que la casilla ya este ocupada
            while (triquiarray[jugador_fila][jugador_columna] != '-') {
                JOptionPane.showMessageDialog(null, "La casilla ya esta ocupada, por favor seleccione otra");
                JOptionPane.showMessageDialog(null, mostrarmatriz());
                respuesta = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                jugador_fila = Integer.parseInt(respuesta);
                respuesta = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                jugador_columna = Integer.parseInt(respuesta);
            }
            if (turno == 1) {
                triquiarray[jugador_fila][jugador_columna] = 'X';
            } else triquiarray[jugador_fila][jugador_columna] = 'O';
        }

        //Metodo comprobarvictoria
        public boolean comprobarvictoria(int mode) {

//casos en el modo 3x3 donde un jugador gana
            if (mode == 1) {
                if (triquiarray[0][0] == 'X' && triquiarray[0][1] == 'X' && triquiarray[0][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[1][0] == 'X' && triquiarray[1][1] == 'X' && triquiarray[1][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'X' && triquiarray[2][1] == 'X' && triquiarray[2][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'X' && triquiarray[1][0] == 'X' && triquiarray[2][0] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][1] == 'X' && triquiarray[1][1] == 'X' && triquiarray[2][1] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][2] == 'X' && triquiarray[1][2] == 'X' && triquiarray[2][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'X' && triquiarray[1][1] == 'X' && triquiarray[2][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'X' && triquiarray[1][1] == 'X' && triquiarray[0][2] == 'X') {
                    findeljuego = true;
                }

                if (triquiarray[0][0] == 'O' && triquiarray[0][1] == 'O' && triquiarray[0][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[1][0] == 'O' && triquiarray[1][1] == 'O' && triquiarray[1][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'O' && triquiarray[2][1] == 'O' && triquiarray[2][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'O' && triquiarray[1][0] == 'O' && triquiarray[2][0] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][1] == 'O' && triquiarray[1][1] == 'O' && triquiarray[2][1] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][2] == 'O' && triquiarray[1][2] == 'O' && triquiarray[2][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'O' && triquiarray[1][1] == 'O' && triquiarray[2][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'O' && triquiarray[1][1] == 'O' && triquiarray[0][2] == 'O') {
                    findeljuego = true;
                }
            }
            if (mode == 2) {
                //casos en el modo 5x5 donde un jugador gana
                if (triquiarray[0][0] == 'X' && triquiarray[0][1] == 'X' && triquiarray[0][2] == 'X' && triquiarray[0][3] == 'X' && triquiarray[0][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[1][0] == 'X' && triquiarray[1][1] == 'X' && triquiarray[1][2] == 'X' && triquiarray[1][3] == 'X' && triquiarray[1][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'X' && triquiarray[2][1] == 'X' && triquiarray[2][2] == 'X' && triquiarray[2][3] == 'X' && triquiarray[2][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[3][0] == 'X' && triquiarray[3][1] == 'X' && triquiarray[3][2] == 'X' && triquiarray[3][3] == 'X' && triquiarray[3][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[4][0] == 'X' && triquiarray[4][1] == 'X' && triquiarray[4][2] == 'X' && triquiarray[4][3] == 'X' && triquiarray[4][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'X' && triquiarray[1][0] == 'X' && triquiarray[2][0] == 'X' && triquiarray[3][0] == 'X' && triquiarray[4][0] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][1] == 'X' && triquiarray[1][1] == 'X' && triquiarray[2][1] == 'X' && triquiarray[3][1] == 'X' && triquiarray[4][1] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][2] == 'X' && triquiarray[1][2] == 'X' && triquiarray[2][2] == 'X' && triquiarray[3][2] == 'X' && triquiarray[4][2] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][3] == 'X' && triquiarray[1][3] == 'X' && triquiarray[2][3] == 'X' && triquiarray[3][3] == 'X' && triquiarray[4][3] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][4] == 'X' && triquiarray[1][4] == 'X' && triquiarray[2][4] == 'X' && triquiarray[3][4] == 'X' && triquiarray[4][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'X' && triquiarray[1][1] == 'X' && triquiarray[2][2] == 'X' && triquiarray[3][3] == 'X' && triquiarray[4][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[4][0] == 'X' && triquiarray[3][1] == 'X' && triquiarray[2][2] == 'X' && triquiarray[1][3] == 'X' && triquiarray[0][4] == 'X') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'O' && triquiarray[0][1] == 'O' && triquiarray[0][2] == 'O' && triquiarray[0][3] == 'O' && triquiarray[0][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[1][0] == 'O' && triquiarray[1][1] == 'O' && triquiarray[1][2] == 'O' && triquiarray[1][3] == 'O' && triquiarray[1][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[2][0] == 'O' && triquiarray[2][1] == 'O' && triquiarray[2][2] == 'O' && triquiarray[2][3] == 'O' && triquiarray[2][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[3][0] == 'O' && triquiarray[3][1] == 'O' && triquiarray[3][2] == 'O' && triquiarray[3][3] == 'O' && triquiarray[3][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[4][0] == 'O' && triquiarray[4][1] == 'O' && triquiarray[4][2] == 'O' && triquiarray[4][3] == 'O' && triquiarray[4][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'O' && triquiarray[1][0] == 'O' && triquiarray[2][0] == 'O' && triquiarray[3][0] == 'O' && triquiarray[4][0] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][1] == 'O' && triquiarray[1][1] == 'O' && triquiarray[2][1] == 'O' && triquiarray[3][1] == 'O' && triquiarray[4][1] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][2] == 'O' && triquiarray[1][2] == 'O' && triquiarray[2][2] == 'O' && triquiarray[3][2] == 'O' && triquiarray[4][2] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][3] == 'O' && triquiarray[1][3] == 'O' && triquiarray[2][3] == 'O' && triquiarray[3][3] == 'O' && triquiarray[4][3] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][4] == 'O' && triquiarray[1][4] == 'O' && triquiarray[2][4] == 'O' && triquiarray[3][4] == 'O' && triquiarray[4][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[0][0] == 'O' && triquiarray[1][1] == 'O' && triquiarray[2][2] == 'O' && triquiarray[3][3] == 'O' && triquiarray[4][4] == 'O') {
                    findeljuego = true;
                }
                if (triquiarray[4][0] == 'O' && triquiarray[3][1] == 'O' && triquiarray[2][2] == 'O' && triquiarray[1][3] == 'O' && triquiarray[0][4] == 'O') {
                    findeljuego = true;
                }
            }
            return findeljuego;
        }
    }
}
