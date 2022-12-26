import java.util.*;

public class Q4{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int [][] matrix = new int [10][10];
        
        int [][] bomb = new int [num][2];
        
        for(int i = 0; i < num; i++){
            for(int j =0; j < 2; j ++){
                bomb[i][j] = scan.nextInt();
            }
        }
        
        for(int i =0; i < 10; i ++){
            for(int j =0; j < 10; j++){
                matrix [i][j] = 0;
            }
        }
        int count = 0;
        for(int i = 0; i < num; i++){
            int bombRow = bomb[i][0];
            int bombCol = bomb[i][1];
            if((bombRow-1 < 0)&&(bombCol-1 < 0)){
                 matrix[bombRow][bombCol] = 1;
                 matrix[bombRow][bombCol+1] = 1;
                 matrix[bombRow+1][bombCol] = 1;
                 matrix[bombRow+1][bombCol+1] = 1;
            }else if((bombRow+1 > 9)&&(bombCol-1 < 0)){
                 matrix[bombRow][bombCol] = 1;
                 matrix[bombRow][bombCol+1] = 1;
                 matrix[bombRow-1][bombCol] = 1;
                 matrix[bombRow-1][bombCol+1] = 1;
            }else if((bombRow-1 < 0)&&(bombCol+1 >9)){
                 matrix[bombRow][bombCol] = 1;
                 matrix[bombRow][bombCol-1] = 1;
                 matrix[bombRow+1][bombCol] = 1;
                 matrix[bombRow+1][bombCol-1] = 1;
            }else if((bombRow+1 > 9)&&(bombCol+1 >9)){
                 matrix[bombRow][bombCol] = 1;
                 matrix[bombRow][bombCol-1] = 1;
                 matrix[bombRow-1][bombCol] = 1;
                 matrix[bombRow-1][bombCol-1] = 1;
            }else if(bombRow -1 < 0){
                 matrix[bombRow][bombCol] = 1;
                matrix[bombRow+1][bombCol] = 1;
                matrix[bombRow][bombCol+1] = 1;
                matrix[bombRow][bombCol-1] = 1;
                 matrix[bombRow+1][bombCol-1] = 1;
                matrix[bombRow+1][bombCol+1] = 1;
            }else if(bombRow +1 > 9){
                 matrix[bombRow][bombCol] = 1;
                matrix[bombRow-1][bombCol] = 1;
                matrix[bombRow][bombCol+1] = 1;
                matrix[bombRow][bombCol-1] = 1;
                 matrix[bombRow-1][bombCol-1] = 1;
                matrix[bombRow-1][bombCol+1] = 1;
            }else if(bombCol -1 < 0){
                matrix[bombRow][bombCol] = 1;
                matrix[bombRow+1][bombCol] = 1;
                matrix[bombRow-1][bombCol] = 1;
                 matrix[bombRow][bombCol+1] = 1;
                 matrix[bombRow-1][bombCol+1] = 1;
                 matrix[bombRow+1][bombCol+1] = 1;
            }else if(bombCol +1 > 9){
                matrix[bombRow][bombCol] = 1;
                matrix[bombRow+1][bombCol] = 1;
                matrix[bombRow-1][bombCol] = 1;
                 matrix[bombRow][bombCol-1] = 1;
                 matrix[bombRow-1][bombCol-1] = 1;
                 matrix[bombRow+1][bombCol-1] = 1;
            }else
            {
                matrix[bombRow][bombCol] = 1;
                matrix[bombRow+1][bombCol] = 1;
                matrix[bombRow-1][bombCol] = 1;
                matrix[bombRow][bombCol+1] = 1;
                matrix[bombRow][bombCol-1] = 1;
                matrix[bombRow-1][bombCol-1] = 1;
                matrix[bombRow-1][bombCol+1] = 1;
                matrix[bombRow+1][bombCol-1] = 1;
                matrix[bombRow+1][bombCol+1] = 1;
            }
            
            
        }
        
        
        for(int i =0; i < 10; i ++){
            for(int j =0; j < 10; j++){
                if(matrix[i][j] != 0){
                    count+= 1;
                }
             // System.out.print(matrix[i][j]+" ");
            }
         // System.out.println();
        }
        System.out.println(count);
    }
}
