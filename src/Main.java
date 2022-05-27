import java.util.Scanner;

public class Main {

    static int minusFive(int x) {
        if(x<=0){
            return x;
        }else{
            System.out.print(x+" ");
            return minusFive(x-5);
        }

    }

    static int plusFive(int x,int y) {
        if(x>y){
            return x;
        }else{
            System.out.print(x+" ");
            return plusFive(x+5,y);
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        //minusFive(sayi);
        plusFive(minusFive(sayi),sayi);
    }
}
