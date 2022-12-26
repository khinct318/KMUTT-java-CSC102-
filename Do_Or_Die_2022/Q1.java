import java.util.*;

public class Q1{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        String input = scan.next();
        ArrayList<Integer> check = new ArrayList<Integer>();
        int sum = 0;
        int mid = Integer.parseInt(String.valueOf(input.charAt(4)));
        if(mid%2 == 1){
            for(int i = 0; i < input.length(); i++){
                if(i % 2 == 1){
                    int a = Integer.parseInt(String.valueOf(input.charAt(i)));
               sum += a;
                }
                
            }
        }else{
            for(int i = 0; i < input.length(); i++){
                if(i % 2 == 0){
                    int a = Integer.parseInt(String.valueOf(input.charAt(i)));
               sum += a;
                }
                
            }
        }
        System.out.print(sum);
    }
}
