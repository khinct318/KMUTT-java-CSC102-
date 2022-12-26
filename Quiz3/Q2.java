import java.util.*;

public class Q2{
    private static boolean b4Ok = false;
    private static boolean a1Ok = false;
    private static boolean a2Ok = false;
    private static boolean a3Ok = false;
    
    public static boolean checkB4(int b4){
        if(b4 <= 95){
            return true;
        }
        return false;
    }
    
    public static boolean checkA1(int a1){
        if(a1 <= 180){
            return true;
        }return false;
    }
    
    public static boolean checkA2(int a2){
        if(a2 <= 155){
            return true;
        }return false;
    }
    
    public static boolean checkA3(int a3){
        if(a3 <= 180){
            return true;
        }return false;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int b4 = scan.nextInt();
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int a3 = scan.nextInt();
        
        // if (checkB4(b4)){
        //     b4 = 1;//b4 ok
        // }else b4 = 0; //b4 not ok
        
        // if(checkA1(a1)){
        //     a1 = 1;
        // }else a1 = 0;
        
        // if(checkA2(a2)){
        //     a2 = 1;
        // }else a2 = 0;
        
        // if(checkA3(a3)){
        //     a3 = 1;
        // }else a3 = 0;
        
        int dm = 0;
        if(checkB4(b4) && checkA1(a1) && checkA2(a2) && checkA3(a3)){
            dm = 0;
        }else if (!checkB4(b4) && checkA1(a1) && checkA2(a2) && checkA3(a3)){
            dm = 0;
        }else if (checkB4(b4) && !checkA1(a1) && checkA2(a2) && checkA3(a3)){
            dm = 0;
        }else if (checkB4(b4) && checkA1(a1) && !checkA2(a2) && checkA3(a3)){
            dm = 0;
        }else if (checkB4(b4) && checkA1(a1) && checkA2(a2) && !checkA3(a3)){
            dm = 0;
        }else if (!checkB4(b4) && !checkA1(a1) && checkA2(a2) && checkA3(a3)){
            dm = 1;
        }else if (!checkB4(b4) && checkA1(a1) && !checkA2(a2) && checkA3(a3)){
            dm = 1;
        }else if (!checkB4(b4) && checkA1(a1) && checkA2(a2) && !checkA3(a3)){
            dm = 1;
        }else if (checkB4(b4) && !checkA1(a1) && !checkA2(a2) && checkA3(a3)){
            dm = 1;
        }else if (checkB4(b4) && !checkA1(a1) && checkA2(a2) && !checkA3(a3)){
            dm = 1;
        }else if (checkB4(b4) && checkA1(a1) && !checkA2(a2) && !checkA3(a3)){
            dm = 1;
        }else dm = 1;
        
        switch(dm){
            case 0: System.out.print("Negative");
                      break;
            case 1: System.out.print("Potential DM");
        }
        
    }
}
