import java.util.Scanner;

public class Q2{
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        //String newSen = input.replace(";"," ");
        
            // String newSen = input.substring(0,index);
            // String first = newSen.substring(0,1).toUpperCase();
            // System.out.print(first + newSen.substring(1,index)+" ");
            // String remain = input.substring(index+1);
            // index = remain.indexOf(";");
            int index = input.indexOf(";");
            String newSen ="";
            String first = "";
            String remain = "";
            while(index > -1){
                newSen = input.substring(0,index);
                first = newSen.substring(0,1).toUpperCase();
                System.out.print(first + newSen.substring(1,index)+" ");
                input = input.substring(index+1);
                //System.out.print(newSen);
                index = input.indexOf(";");
            }
            if(index == -1){
                newSen = input;
                first = newSen.substring(0,1).toUpperCase();
                System.out.print(first + newSen.substring(1));
            }
    }
}
