package lab6p1_sameulzorto;

import java.util.Random;
import java.util.Scanner;

public class Lab6P1_SameulZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean rep_sz = true;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Ingrese un numera para elegir el ejercicio");
            System.out.println("[1] El juego de la vida :D");
            System.out.println("[2] Piedra papel o tijera v2");
            System.out.println("[3] Blink-182");
            System.out.println("[4] Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int menunu_sz = entrada.nextInt();
            switch (menunu_sz) {
                case 1:
                    JDLV();
                    break;
                case 2:
                    elsegundo();
                    break;
                case 3:
                    System.out.print("Ingrese cantidad de filas: ");
                    int fila_sz = entrada.nextInt();
                    System.out.print("Ingrese cantidad de columnas: ");
                    int column_sz = entrada.nextInt();
                    Blink(fila_sz, column_sz);
                    break;
                default:
                    rep_sz = false;
                    break;
            }
        } while (rep_sz);
    }

    public static void JDLV() {
        Scanner entradaa = new Scanner(System.in);
        String[][] matriss = new String[8][8];
        int posv = 0;
        int posh = 0;
        //int rando_sz = new Random().nextInt((6 - 1) + 1) + 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriss[posv][posh] = "P";
                matriss[i][j] = "-";
            }
        }
        matrizzz1(matriss);
        do {
            System.out.println("Ingrese cualquier caracter para continuar");
            String nadada = entradaa.next();
            int rando_sz = new Random().nextInt((6 - 1) + 1) + 1;

            if (posh + rando_sz >= 8) {
                if (posv == 7) {
                    posv = 7;
                    posh = 7;
                } else {
                    posh = 0;
                    posv++;
                }
            } else {
                posh += rando_sz;
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    matriss[i][j] = "-";
                    matriss[posv][posh] = "P";
                }
            }
            System.out.println("");
            if ((posv == 0 && (posh == 2 || posh == 4 || posh == 6)) || (posv == 2 && (posh == 0 || posh == 4 || posh == 6)) || (posv == 4 && (posh == 2 || posh == 0 || posh == 6)) || (posv == 6 && (posh == 2 || posh == 4 || posh == 0))) {
                System.out.println("¡Ahora es 5 años más viejo!");
            } else if ((posv == 0 && (posh == 3)) || (posv == 1 && (posh == 2 || posh == 4)) || (posv == 2 && (posh == 2 || posh == 5)) || (posv == 3 && (posh == 0 || posh == 3 || posh == 6)) || (posv == 4 && (posh == 1 || posh == 4 || posh == 7)) || (posv == 5 && (posh == 2 || posh == 5)) || (posv == 6 && (posh == 4 || posh == 6)) || (posv == 7 && (posh == 5))) {
                System.out.println("Eres 125k lempiras mas rico");
            }
            matrizzz1(matriss);
            System.out.println(posv + "  asdasd  " + posh);
            System.out.println("dado: " + rando_sz);
        } while (posv != 7 || posh != 7);
        System.out.println("felicidades ganaste wow que asombroso sos te admiro mucho sos tan genial woooowwwwwwwwww");

    }

    public static void matrizzz1(String matriss[][]) {
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                System.out.print(matriss[i][j]);
            }
            System.out.println("");
        }
    }

    public static void Blink(int fila_sz, int column_sz) {
        int[][] matrissssss = new int[fila_sz][column_sz];
        char[][] matrissss = new char[fila_sz][column_sz];
        matrizzz2(fila_sz, column_sz, matrissssss, matrissss);
        System.out.println("");
        System.out.println("Numeros");
        for (int i = 0; i < fila_sz; i++) {
            for (int j = 0; j < column_sz; j++) {
                System.out.print(matrissssss[i][j] + "-");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Letras");

        for (int i = 0; i < fila_sz; i++) {
            for (int j = 0; j < column_sz; j++) {
                System.out.print(matrissss[i][j] + "-");
            }
            System.out.println("");
        }
    }

    public static void matrizzz2(int fila_sz, int column_sz, int matrissssss[][], char matrissss[][]) {
        for (int i = 0; i < fila_sz; i++) {
            for (int j = 0; j < column_sz; j++) {
                int randoom = new Random().nextInt((122 - 97) + 1) + 97;
                char randooom = (char) randoom;
                matrissss[i][j] = randooom;
            }
        }
        for (int i = 0; i < fila_sz; i++) {
            for (int j = 0; j < column_sz; j++) {
                int randoom = new Random().nextInt((122 - 97) + 1) + 97;
                matrissssss[i][j] = randoom;
            }
        }
    }

    public static void elsegundo() {
        Scanner entrad = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        System.out.println("");
        System.out.println("Jugador es columna");
        System.out.println("Maquina es fila");
        System.out.println("1. Tijera");
        System.out.println("2. Piedra");
        System.out.println("3. Papel");
        System.out.println("4. Lagarto");
        System.out.println("5. Spock");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[0][1] = 2;
                    matrix[0][2] = 1;
                    matrix[0][3] = 1;
                    matrix[0][4] = 2;
                    matrix[1][0] = 1;
                    matrix[1][2] = 2;
                    matrix[1][3] = 1;
                    matrix[1][4] = 2;
                    matrix[2][0] = 2;
                    matrix[2][1] = 1;
                    matrix[2][3] = 2;
                    matrix[2][4] = 1;
                    matrix[3][0] = 2;
                    matrix[3][1] = 2;
                    matrix[3][2] = 1;
                    matrix[3][4] = 1;
                    matrix[4][0] = 1;
                    matrix[4][1] = 1;
                    matrix[4][2] = 2;
                    matrix[4][3] = 2;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.print("Ingrese el numero para elegir: ");
        int usu = entrad.nextInt();
        int maq_sz = new Random().nextInt((4 - 0) + 1) + 0;
        switch (maq_sz) {
            case 0:
                System.out.println("La máquina eligió Tijera");
                break;
            case 1:
                System.out.println("La máquina eligió Piedra");
                break;
            case 2:
                System.out.println("La máquina eligió Papel");
                break;
            case 3:
                System.out.println("La máquina eligió Lagarto");
                break;
            case 4:
                System.out.println("La máquina eligió Spock");
                break;
        }
        if (matrix[usu][maq_sz] == 0) {
            System.out.println("Nadie gano");
        } else if (matrix[usu][maq_sz] == 1) {
            System.out.println("¡Jugador Gana!");
        } else {
            System.out.println("¡La máquina Gana!");
        }
    }
}
