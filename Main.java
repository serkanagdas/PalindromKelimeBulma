import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str){

        int i=0;
        int j= str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static String kelimeGiris(String str){
        System.out.println("Kelimeniz:"+str);
        System.out.println(isPalindrome(str));
        return str;
    }


    public static void main(String[] args) {
        System.out.println("Lütfen kelime giriniz: ");
        Scanner scn= new Scanner(System.in);
        String kelime;
        kelime = scn.next();
        System.out.println(kelimeGiris(kelime));
    }
}