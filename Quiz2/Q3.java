import java.util.Scanner;
public class Q3{
    static boolean isA(char a){
        if(a == 'A'){
            return true;
        }
        return false;
    }
    
    static boolean isT(char a){
        if(a == 'T'){
            return true;
        }return false;
    }
    
    static boolean isC(char a){
        if(a == 'C'){
            return true;
        }return false;
    }
    
    static boolean isG(char a){
        if(a == 'G'){
            return true;
        }return false;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        if(str1.length()>0 && str1.length() <= 50){
            
            for(int i = 0; i< str1.length();i++){
                
            char test='0';
            if(isA(str1.charAt(i))) test = 'A';
            if(isT(str1.charAt(i))) test = 'T';
            if(isC(str1.charAt(i))) test = 'C';
            if(isG(str1.charAt(i))) test = 'G';
            
                switch(i%7){
                case(0): System.out.print("");
                         break;
                case(1):System.out.print(" ");
                        break;
                case(2):System.out.print("  ");
                        break;
                case(3):System.out.print("   ");
                        break;
                case(4):System.out.print("  ");
                        break;
                case(5):System.out.print(" ");
                        break;
                case(6):System.out.print("");
                        break;
                        
                }
            
            
            switch(test){
                case('A'): System.out.print("A - - T\n");
                            break;
                case('T'): System.out.print("T - - A\n");
                            break;
                case('C'): System.out.print("C - - G\n");
                            break;
                case('G'): System.out.print("G - - C\n");
                            break;
                
            }
            
        }
        }
    }
}
