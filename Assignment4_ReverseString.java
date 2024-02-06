import java.util.Scanner;

public class Assignment4_ReverseString {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String userinput=input.nextLine();
        int i;
        for (i=userinput.length()-1; i>=0 ; i--){
        System.out.print(userinput.charAt(i));
        input.close();
        }
        
    }
    }


    




