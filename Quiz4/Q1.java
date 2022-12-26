import java.util.Scanner;

public class Q1{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int col = scan.nextInt();
        
        int total = 0;
        int original = 0;
        //int remainder ;
        int n = 0;
        if(row % 2 == 0){
            if(col % 2 == 0){
                //total = (row * col)/2;
                n = 0;
            }
        }
        if(row % 2 == 1){
            if(col % 2 == 0){
                //total = (row * col)/2;
                n = 1;
            }
        }
        if (row % 2 == 0){
            if(col% 2 == 1){
                //total = (row * col)/2;
                n = 2;
            }
        }
        if (row % 2 == 1){
            if(col% 2 == 1){
            original = row * col ;
            //total = (row * col)-1/2;
            //remainder = ((row * col)-1)%2;
            n = 3;
            }
        }
        
        switch(n){
            case 0 : total = (row * col)/2;
            break;
            case 1: total = (row * col)/2;
            break;
            case 2: total = (row * col)/2;
            break;
            case 3: total = (original-1) /2;
            break;
        }
        
        System.out.print(total);
    }
}
