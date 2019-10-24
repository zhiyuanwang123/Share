//this code seems stupid lol.................... Can't use "if" is  so tough.

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        printHead();
        printLeftEye();
        printFace();
        printMouth();
    }
    static void printHead(){
        int spaceCount = 16 ;
        for (int i = 1; i<= 5; i++ ){
            spaceCount -= 6-i;//starting with 11 -> 7 -> 4-> 2 -> 1(-5,-4,-3,-2 to form a circle!)
            int dotCount =(21-spaceCount)*2;//the amount of the dots(How fat the head is!)
            for(int k = 1; k<= spaceCount ; k++){
                System.out.print(" ");
            }
            for(int m = 1; m <= dotCount; m++){
                    System.out.print("o");
            }
            System.out.println();
        }
    }
    static void printLeftEye(){
        for(int i = 1; i <=2; i++){
            for (int x = 1; x<=2; x++){
                for (int j = 1; j<=8-i; j++){
                    System.out.print("o");
                }
                for (int k = 1; k<=i+1; k++){
                    System.out.print(" ");
                }
                System.out.print("!!!"); //eye ball
                for (int k = 1; k<=i+1; k++){
                    System.out.print(" ");
                }
                for (int j = 1; j<=8-i; j++){
                    System.out.print("o");
                }
            }

            System.out.println();
        }
        
    }
    static void printFace(){
        for(int i = 1; i <=3; i++){
            for(int j = 1; j <=42; j++){
                System.out.print("o");
            }  
            System.out.println();
        }
    }
    static void printMouth(){
        int spaceCount = 1 ;
        for (int i = 0; i < 2; i++ ){
            spaceCount += i;//starting with 1 -> 2 -> 4-> 7 -> 11(+1,+2,+3,+4 to form a circle!)
            int dotCount = 14-spaceCount+2*i;//the amount of the dots on the left of the mouth and the right of the mouth(How fat the mouth is!)
            for(int k = 1; k<= spaceCount ; k++){
                System.out.print(" ");
            }
            for(int m = 1; m <= dotCount; m++){
                    System.out.print("o");
            }
            for(int k = 1; k<= 18-spaceCount*4 ; k++){
                System.out.print(" ");
            }
            for(int m = 1; m <= dotCount; m++){
                    System.out.print("o");
            }
            System.out.println();
        }
        for (int i = 2; i < 5; i++ ){
            spaceCount += i;//starting with 1 -> 2 -> 4-> 7 -> 11(+1,+2,+3,+4 to form a circle!)
            int dotCount =(21-spaceCount)*2;//the amount of the dots(How fat the mouth is!)
            for(int k = 1; k<= spaceCount ; k++){
                System.out.print(" ");
            }
            for(int m = 1; m <= dotCount; m++){
                    System.out.print("o");
            }
            System.out.println();
        }
    }
}
