import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        String str = scan.next();
        int k = 0;
        while(k < str.length()){
            
            int start = k;
            int end = start+2;
            String str1 = str.substring(start,end);
            //System.out.println(str1);
            int value = Integer.valueOf(str1,16);
            sum += value;
            //System.out.println("sum is"+sum);
            start = end;
            k = start;
        }
        //String str1 = str.substring(0,2);
        //int value = Integer.valueOf(str1,16);
        System.out.print(sum);
    }
}
