public class Main {
    public static void main(String[] args) throws Exception {
        printHandle();
        printSword(12);
        printSharp();
    }
    
    static void printHandle(){
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++){
                System.out.print("o");
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int j = 1; j <= 9; j++){
            System.out.print("o");
        }
        System.out.println();
        for (int j = 1; j <= 11; j++){
            System.out.print("o");
        }
        System.out.println();
        
    }
    static void printSword(int length){
        for(int i = 1; i <= length; i++){
            for (int j = 1; j <= 3; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++){
                System.out.print("o");
            }
            System.out.println();
        }
    }
    static void printSharp(){
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= 2+i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 7-2*i; j++){
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
