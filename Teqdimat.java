import java.util.Scanner;
public class Teqdimat {
    static void func(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
    System.out.println(10/a);
    int[] arr={1,2,3};
    System.out.println(arr[b]);
}
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in) ;
        for(int i=0;i<3;i++){
            try{
                func(in.nextInt(),in.nextInt());
            }catch(ArithmeticException e){
                System.out.println("can't divide by zero");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Out of bounds!");
            }
        }
    }

    /*public static void main(String[] args) {
        Scanner scanner= new
                Scanner(System.in);
        try {
            System.out.println("eded daxil edin");
            int a=scanner.nextInt();
            System.out.println("eded daxil edin");
            int b=scanner.nextInt();
            int sum=a/b;
            System.out.println(sum);
        }
        catch(ArithmeticException e) {
            System.out.println("bunu ede bilmez");
        }
    }*/
}


