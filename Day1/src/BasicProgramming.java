import java.util.Scanner;

public class BasicProgramming {
    public static void main(String[] args) {
//        char symbol = 'v';
//        if( symbol=='a' || symbol=='e' ||symbol=='i' ||symbol=='o' ||symbol=='u'){
//            System.out.println("Vowel");
//        }
//        else{
//            System.out.println("Non Vowel");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any Character: ");
        String s = sc.next();
        char symbol = s.charAt(0);
        System.out.println(symbol);
        if((symbol >= 'A' && symbol <='Z') && (symbol >= 'a' && symbol <='z')){
            if(symbol=='a'||symbol=='e'||symbol=='i'||symbol=='o'||symbol=='u'||symbol=='A'||symbol=='E'||symbol=='I'||symbol=='O'||symbol=='U'){
                System.out.println("It is a Vowel");
            }else{
                System.out.println("It is a Consonant");
            }
        }else{
            System.out.println("Warning! Please enter Alphabets");
        }

    }
}
