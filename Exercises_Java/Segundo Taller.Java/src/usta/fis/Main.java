package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int columns=4;
        int rows=0;
        char [][] stalls;
        String answer;
        int ocupy =0;
        int columnaaocupar=0;
        int again=1;
        int contadorX=0;
        int contadorD=0;
        int contadorO=0;
        String matriz= "";

        answer= JOptionPane.showInputDialog("Por favor ingresar las filas de su autobus");
        rows=Integer.valueOf(answer);
        stalls= new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i%2!=0){
                    stalls[i][j]= 'X';
                    contadorX=contadorX+1;
                }
                else {
                    stalls[i][j]= 'D';
                    contadorD=contadorD+1;
                }
            }
        }
        //IMPRIME LA MATRIZ/
        matriz = "";
        columns=4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matriz=matriz+" "+stalls[i][j];
            }
            matriz=matriz+"\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz de su autobus es:\n"+matriz+"\nasientos disponibles= "+contadorD+"\nAsientos ocupados= "+contadorO+"\nAsientos no disponibles= "+contadorX);
        while (again==1){
            answer= JOptionPane.showInputDialog("ingrese la fila que desea llenar");
            ocupy=Integer.valueOf(answer);
            answer= JOptionPane.showInputDialog("ingrese la columna que desea llenar");
            columnaaocupar=Integer.valueOf(answer);
            if (stalls[ocupy][columnaaocupar]=='X'){
                JOptionPane.showMessageDialog(null, "Esta casilla no se puede llenar");
            }else {
                stalls[ocupy][columnaaocupar] = 'O';
                contadorO=contadorO+1;
                contadorD=contadorD-1;
            }
            //IMPRIME LA MATRIZ/
            matriz = "";
            columns=4;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matriz=matriz+" "+stalls[i][j];
                }
                matriz=matriz+"\n";
            }
            JOptionPane.showMessageDialog(null, "La matriz de su autobus es:\n"+matriz+"\nasientos disponibles= "+contadorD+"\nAsientos ocupados= "+contadorO+"\nAsientos no disponibles= "+contadorX);
            answer= JOptionPane.showInputDialog("Â¿Desea ocupar otro puesto?\n" +
                    "1: Si\n" +
                    "0: No");
            again=Integer.valueOf(answer);
        }
    }
}
