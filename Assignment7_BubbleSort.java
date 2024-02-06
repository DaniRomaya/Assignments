// Program generates a random array with the number of elements the user inputs. The user then inputs the fileName of the text file that 
// will store the randomly generated array. That array will be read from the same text file it was stored in, sorted using bubble sort from
// the smallest integer to the largest, then written into another text file.



package Assignments.Assignment7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment7_BubbleSort {
        public static void main(String[] args) throws IOException {
            Scanner element = new Scanner(System.in);
            Scanner fileName = new Scanner(System.in);
            Scanner fileName1 =new Scanner(System.in);
            System.out.print("Enter the amount elements in the array: ");
            int arryelement= element.nextInt();
            int arry[]= createRandomArray(arryelement);
            System.out.println("Randomly generated array");
            System.out.println(Arrays.toString(arry));
            System.out.print("Enter the file name: ");
            String fileArrayName = fileName.nextLine();
            writeArrayToFile(arry, fileArrayName);
            System.out.println("Array1 text file that is read into an array:");
            readFiles(fileArrayName);
            System.out.println(Arrays.toString(arry));
            System.out.println("Array after bubble sorting:");
            bubbleSort(arry);
            System.out.println(Arrays.toString(arry));
            System.out.println("Is the array sorted correctly? "+ isArraySorted(arry));
            System.out.print("Enter another file name to store the sorted array into: ");
            String arrayfileName1 = fileName1.nextLine();
            writeSortedArrayIntoFile(arry, arrayfileName1);
            element.close();
            fileName.close();
            fileName1.close();
        }
        
        
        
        public static int[] createRandomArray(int arraylength){
            int[] arry = new  int[arraylength];
            Random random = new Random();
            for (int i=0; i<arraylength; i++){
                arry[i]= random.nextInt(100);
                
            }
            return arry;
        }

        public static void writeArrayToFile(int[] array, String fileName) throws IOException{
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int i=0; i<array.length; i++){
                bw.write("%d\n".formatted(array[i]));
        
            }
            bw.close();
        }


        public static int[] readFiles(String fileName){

        
            try {
                File f = new File(fileName);
                Scanner s = new Scanner(f);
                int count =0;
                while (s.hasNextInt()) {
                    count++;
                    s.nextInt();
                }
                int[] Array2= new int[count];

                Scanner s1 = new Scanner(f);

                for (int i=0; i<Array2.length; i++)
                    Array2[i]= s1.nextInt();

                    return Array2;
                }
                catch(Exception e){
                    return null;
                }
            }

        public static void swap(int[] arr, int i, int j){
            if (arr==null || i<0 || j<0 || i>= arr.length || j>=arr.length) {
                return;
            }
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }

        public static void bubbleSort(int[] array){
            if (array==null || array.length<=1){
                return;
            }
            boolean swapped;
            for (int i=0; i<array.length-1; i++){
                swapped = false;
                for (int j=0; j<array.length-1-i; j++){
                    if (array[j]> array[j+1]){
                        swap(array, j, j+1);
                        swapped = true;
                    }
                }
                if (!swapped){
                    break;
                }
                }
            
        }

        public static boolean isArraySorted(int[] arr){
            if (arr == null || arr.length<=1){
                return true;
            }
            for (int i=0; i<arr.length-1; i++){
                if (arr[i]>arr[i+1]){
                    return false;
                }
            }
            return true;
        }

        public static void writeSortedArrayIntoFile(int[] array, String fileName) throws IOException{
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int i=0; i<array.length; i++){
                bw.write("%d ".formatted(array[i]));
        
            }
            bw.close();
        }
        
        }
            



