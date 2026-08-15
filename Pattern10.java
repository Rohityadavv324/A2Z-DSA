
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0;i<2*n-1;i++){
            if(i<n){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<2*n-i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
