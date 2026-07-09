import java.util.Scanner;
public class IndexOfElem{
    public static void main(String[] args) {
        int[] arr={10,20,4,50,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element");
        int target=sc.nextInt();
        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
         System.out.println(target + " "+ index);
    }
        
}
