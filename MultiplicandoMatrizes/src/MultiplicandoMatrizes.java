import java.util.Scanner;

public class MultiplicandoMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o número de linhas e colunas da matriz A?");
        int numRowsA = input.nextInt();
        int numColsA = input.nextInt();

        System.out.println("Qual o número de linhas e colunas da matriz B?");
        int numRowsB = input.nextInt();
        int numColsB = input.nextInt();


        if (numColsA != numRowsB) {
            System.out.println("O programa não pode multiplicar as matrizes, pois o número de colunas da matriz A deve ser igual ao número de linhas da matriz B!");
            return;
        }


        int[][] matrizA = new int[numRowsA][numColsA];
        int[][] matrizB = new int[numRowsB][numColsB];
        int[][] matrizC = new int[numRowsA][numColsB];


        System.out.println("Quais são os elementos da matriz A?");
        preencherMatriz(input, matrizA);

        System.out.println("Quais são os elementos da matriz B?");
        preencherMatriz(input, matrizB);


        multiplicarMatrizes(matrizA, matrizB, matrizC);

        System.out.println("Matriz A x Matriz B = Matriz C");
        exibirMatriz(matrizA);
        System.out.print(" X ");
        exibirMatriz(matrizB);
        System.out.print(" = ");
        exibirMatriz(matrizC);


    }

    public static void preencherMatriz(Scanner input, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void multiplicarMatrizes(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        int numRowsA = matrizA.length;
        int numColsA = matrizA[0].length;
        int numColsB = matrizB[0].length;

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                int sum = 0;
                for (int k = 0; k < numColsA; k++) {
                    sum += matrizA[i][k] * matrizB[k][j];
                }
                matrizC[i][j] = sum;
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}