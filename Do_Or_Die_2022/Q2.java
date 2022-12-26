import java.util.*;
public class Q2{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String [] array = new String [num];
        
        for(int i = 0; i< array.length; i++){
            array[i] = scan.next().toLowerCase();
        }
        
        for(int i = 0; i < array.length; i++){
            boolean check = (i%2 ==0)? true:false;
            String newStr = "";
            if(check){
                char [] newArray = array[i].toCharArray();
            for(int j = newArray.length-1; j>= 0; j--){
                newStr += String.valueOf(newArray[j]).toUpperCase();
            }
            System.out.print(newStr + " ");
            }else{
                char [] newArray = array[i].toCharArray();
            for(int j = newArray.length-1; j>= 0; j--){
                newStr += String.valueOf(newArray[j]);
            }
            System.out.print(newStr + " ");
            }
        }
    }
}
