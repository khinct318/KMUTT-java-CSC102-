import java.util.Scanner;

public class Q4{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int rowM1 = scan.nextInt();
        int colM1 = scan.nextInt();
        int rowM2 = scan.nextInt();
        int colM2 = scan.nextInt();
        int [][] M1 = new int [rowM1][colM1];
        int [][] M2 = new int[rowM2][colM2];
        int [][] result = new int [rowM1][colM2];
        for(int i =0; i< rowM1; i++){
            for(int j = 0; j < colM1; j++){
                M1[i][j] = scan.nextInt();
            }
        }
        
        for(int i =0; i< rowM2; i++){
            for(int j = 0; j < colM2; j++){
                M2[i][j] = scan.nextInt();
            }
        }
        if(colM1 == rowM2){
            for(int i = 0; i< rowM1; i++){
                int count = 0;
                for(int j = 0; j < colM2; j++){
                    for(int k = 0; k < colM1; k++){
                        count += M1[i][k] * M2[k][j];
                    }
                    result [i][j]=count;
                    count = 0;
                }
            }
            
            for(int i = 0; i < rowM1; i++){
                for(int j =0; j< colM2; j++){
                    System.out.print(result[i][j]+" ");
                }
            }
        }else{
          System.out.print("Invalid");
        }
    }
}
