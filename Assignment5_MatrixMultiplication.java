/// Program performs Matrix multiplication on two matrices that have randomly generated integers




package Assignments.Assignment5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment5_MatrixMultiplication {

    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        Scanner row1 = new Scanner(System.in);
        System.out.print("Enter the number of rows you want for the matrices: ");
        int matrix1row = row1.nextInt();
        row1.close();
        int matrix1[][] = new int[matrix1row][matrix1row];
        int matrix2[][] = new int[matrix1row][matrix1row];
        int matrix3[][]= new int[matrix1row][matrix1row];
        
        //Generate random integers for the first matrix
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = rand.nextInt(20);
            }
        }
        
        //Generate random integers for the second matrix
        for (int i=0; i<matrix2.length; i++){
            for (int h=0; h<matrix2[i].length; h++){
                matrix2[i][h]=rand.nextInt(20);
            }
        }
        
        //Does matrix Multiplication
        for(int i=0; i<matrix3.length; i++){
            for(int j=0; j<matrix3[i].length; j++){
                for(int k=0; k<matrix3[i].length; k++){
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        //Write Matrix1 to a text file
        FileWriter writer = new FileWriter("matrix1.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("%d %d\n".formatted(matrix1.length,matrix1[0].length));
        for (int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                bw.write("%d ".formatted(matrix1[i][j]));
            }
            bw.write("\n");
        }
        bw.close();
        
        //Write matrix2 to a text file
        FileWriter writer1 = new FileWriter("matrix2.txt");
        BufferedWriter bw1 = new BufferedWriter(writer1);
        bw1.write("%d %d\n".formatted(matrix2.length,matrix2[0].length));
        for (int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[i].length; j++) {
                bw1.write("%d ".formatted(matrix2[i][j]));
            }
        bw1.write("\n");
        }
        bw1.close();
        
        //Write Matrix3 to a text file
        FileWriter writer2 = new FileWriter("matrix3.txt");
        BufferedWriter bw2 = new BufferedWriter(writer2);
        bw2.write("%d %d\n".formatted(matrix3.length,matrix3[0].length));
        for (int i=0; i<matrix3.length; i++){
            for (int j=0; j<matrix3[i].length; j++){
                bw2.write("%d ".formatted(matrix3[i][j]));
            }
        bw2.write("\n");
        }
        bw2.close();

        //Prints out each matrix
        System.out.println("Matrix 1");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.println(Arrays.toString(matrix1[i]));
        }
        System.out.println();

        System.out.println("Matrix 2");
        for (int i=0; i<matrix2.length; i++){
            System.out.println(Arrays.toString(matrix2[i]));
        }
        System.out.println();
        
        System.out.println("Matrix 3");
        for (int i=0; i<matrix3.length; i++){
            System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println();

        //Read matrix3.txt text file
        FileReader reader = new FileReader("matrix3.txt");
        BufferedReader br =new BufferedReader(reader);
        String line =br.readLine();
        String[] size = line.split(" ");
        int rows = Integer.parseInt(size[0]);
        int columns = Integer.parseInt(size[1]);
        System.out.println("%d %d".formatted(rows, columns));

        int[][] matrix4 =new int[rows][columns];
        for (int i = 0; i<matrix4.length; i++){
            line =br.readLine();
            String[] row = line.split(" ");
            for (int j=0; j<columns; j++){
                matrix4[i][j]=Integer.parseInt(row[j]);
            }
        }
        br.close();

        //Print out matrix 3 after reading the text file
        System.out.println("Matrix 4 (read from matrix3.txt text file)");
        for (int i=0; i<matrix4.length; i++){
        System.out.println(Arrays.toString(matrix4[i]));
        }
        System.out.println();
    }
}
