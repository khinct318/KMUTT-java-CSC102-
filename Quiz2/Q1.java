import java.util.Arrays;
import java.util.Scanner;
public class Q1{
    //check if it is oneDigit
    static boolean oneDigit(int i){
        if(i >=0 && i<= 9)
            return true;
        
        return false;
    }
    
    //check if it is two Digit
    static boolean twoDigit(int i){
        if(i >= 10 && i <= 99){
            return true;
        }
        return false;
    }
    
    //check if it is three digit
    static boolean threeDigit(int i){
        if(i >= 100 && i<= 999){
            return true;
        }
        return false;
    }
    
    //check if it is four digit
    static boolean fourDigit(int i){
        if(i >= 1000 && i<= 9999){
            return true;
        }
        return false;
    }
    
    //main class
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int [] input = new int[length];
        
        //ask input array
        for(int i = 0; i< input.length; i++){
            input[i] = scan.nextInt();
        }
        Arrays.sort(input);
        
        //store the number into String first
        String one="";
        String two="";
        String three="";
        String four="";
        
        for(int i = 0; i< input.length; i++){
            int num=0;
            if(oneDigit(input[i]))  num =1;
            if(twoDigit(input[i])) num= 2;
            if(threeDigit(input[i])) num=3;
            if(fourDigit(input[i])) num=4;
            
            switch(num){
                case(1): one = one + input[i]+" ";
                                break;
                case(2): two = two+ input[i]+" ";
                                break;
                case(3): three =three+ input[i]+" ";
                                  break;
                case(4): four =four+ input[i]+" ";
                                 break;
            }
        }
        
        if(one.length()==0){
            System.out.println("0");
        }else{
            System.out.println(one);
        }
        if(two.length()==0){
            System.out.println("0");
        }else{
            System.out.println(two);
        }
        if(three.length()==0){
            System.out.println("0");
        }else{
            System.out.println(three);
        }
        if(four.length()==0){
            System.out.println("0");
        }else{
            System.out.println(four);
        }
    }
}
