import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size>>");
        int n=sc.nextInt();
        int[] arr=new int[n];//Intialize

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Array Elements are>>");
        // for(int i=0;i<n;i++){
        // System.out.println(arr[i]);
        // }

        for(int i:arr){ //For each loop
            System.out.println(i);
        }
    }
}