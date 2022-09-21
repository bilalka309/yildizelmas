import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        int x= inp.nextInt();
        for(int i=1;i<=x;i++){
            for(int k=1;k<=(x-i);k++){
                System.out.print(" ");
            }
            for(int c=1;c<=(2*i)-1;c++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=x;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int d=1 ;d<=(2*(x-i))-1 ; d++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}