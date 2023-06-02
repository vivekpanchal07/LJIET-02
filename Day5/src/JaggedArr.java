import java.util.Scanner;

public class JaggedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JaggedArray [][] = new int [2][];
        System.out.println("Enter Number of Cols for Each Row");
        for (int i = 0; i < 2; i++) {
            JaggedArray[i] = new int[sc.nextInt()];
        }
        for (int i = 0; i < JaggedArray.length; i++) {
            for (int j = 0; j < JaggedArray[i].length; j++) {
                System.out.println("Element at ["+i+"]["+j+"] : ");
                JaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print Jagged Array ");
        for (int i = 0; i < JaggedArray.length; i++) {
            for (int j = 0; j < JaggedArray[i].length; j++) {
                System.out.println("Element at ["+i+"]["+j+"] : "+JaggedArray[i][j]);
            }
        }
    }
}
