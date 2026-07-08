import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class SumOfElem{
    public static void main(String[] args) {
        // int[] arr={10,2,50,40,70};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // System.out.println("Sum oF Array Elements>>"+sum);

        //user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array>>");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }

        for(int i:arr){
            sum+=i;
        }
        System.out.println("Sum>> "+sum);

        
    }
}