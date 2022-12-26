import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int field[][] = new int[r][c];

        int countEmpty = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                field[i][j] = sc.nextInt();
                if(field[i][j] == 0){
                    countEmpty++;
                }
            }
        }
        
        if(countEmpty == 0){
            System.out.println("cannot place springer");
        }
        
        int sum[][] = new int[r][c];
        int maxisum = 0;
        int maxi = 0, maxj = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){

                if(field[i][j] == 0){

                    if(i-1 >= 0 && i-1 < r){
                        
                        if(j-1 >= 0 && j-1 < c){
                            sum[i][j] += field[i-1][j-1];
                        }
                        
                        sum[i][j] += field[i-1][j];
                        
                        if(j+1 >= 0 && j+1 < c){
                            sum[i][j] += field[i-1][j+1];
                        }
                    }
                    
                    if(j-1 >= 0 && j-1 < c){
                        sum[i][j] += field[i][j-1];
                    }
                        
                    sum[i][j] += field[i][j];
                        
                    if(j+1 >= 0 && j+1 < c){
                        sum[i][j] += field[i][j+1];
                    }
                    
                    if(i+1 >= 0 && i+1 < r){
                        if(j-1 >= 0 && j-1 < c){
                            sum[i][j] += field[i+1][j-1];
                        }
                        
                        sum[i][j] += field[i+1][j];
                        
                        if(j+1 >= 0 && j+1 < c){
                            sum[i][j] += field[i+1][j+1];
                        }
                    }
                
                    if(sum[i][j] > maxisum){
                        maxisum = sum[i][j];
                        maxi = i;
                        maxj = j;
                    }
                }
            }
        }
        
        if(countEmpty != 0){
            for(int i = 0; i< r; i++){
                for(int j = 0; j < c; j++){
                    if(i == maxi && j == maxj){
                        System.out.print("x ");
                    }
                    else{
                        System.out.print(field[i][j]+" ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
