import java.util.*;
public class Q3{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double [] array = new double[num];
        
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextDouble();
        }
        
        Arrays.sort(array);
        
        for(int i = 1; i < 4; i++){
            System.out.print(array[array.length-i]+" ");
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print(array[i]+" ");
        }
    }
}
