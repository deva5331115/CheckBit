import java.util.Scanner;

public class CheckBit {
    public static int checkBit(int number, int index){
        return ((number & (1 << index)) == 0) ? 0 : 1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int index=scan.nextInt();
        System.out.println(checkBit(num,index));
    }
}
