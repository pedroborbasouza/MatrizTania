import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1[][] = new int[2][3];
        int m2[][] = new int[3][2];
        int m3[][] = new int[2][2];
        int l, c;
        String aux;

        m1[0][0] = 3;
        m1[0][1] = 1;
        m1[0][2] = 3;
        m1[1][0] = 6;
        m1[1][1] = 5;
        m1[1][2] = 5;

        m2[0][0] = 100;
        m2[0][1] = 50;
        m2[1][0] = 50;
        m2[1][1] = 100;
        m2[2][0] = 50;
        m2[2][1] = 50;

        //Matriz 1

        for (l = 0; l < m1.length; l++)  {
            for ( c = 0; c < m1[0].length; c++)     {
                System.out.print(m1[l][c] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("  ");

        //Matriz 2

        for (l = 0; l < m2.length; l++)  {
            for ( c = 0; c < m2[0].length; c++)     {
                System.out.print(m2[l][c] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");

        //Multiplicação das Matrizes para Matriz 3
        m3[0][0] = (m2[0][0] * m1[0][0]) + (m2[1][0] * m1[0][1]) + (m2[2][0] * m1[0][2]);
        m3[0][1] = (m2[0][1] * m1[0][0]) + (m2[1][1] * m1[0][1]) + (m2[2][1] * m1[0][2]);
        m3[1][0] = (m2[1][1] * m1[1][0]) + (m2[2][0] * m1[1][1]) + (m2[2][1] * m1[1][2]);
        m3[1][1] = (m2[0][1] * m1[1][0]) + (m2[1][1] * m1[1][1]) + (m2[2][1] * m1[1][2]);

        for (l = 0; l < m3.length; l++)  {
            for ( c = 0; c < m3[0].length; c++)     {
                System.out.print(m3[l][c] + " ");
            }
            System.out.println(" ");
        }

     }
    }