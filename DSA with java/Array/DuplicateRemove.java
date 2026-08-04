import java.util.*;
public class DuplicateRemove {
    public static void main(String[] args){
        int arr[]={1,2,3,2,5,7,3,2,6};
        for(int i:arr){
            System.out.println(i);
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array");
        for(int i:arr){
            System.out.println(i);
        }

        int j=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }

        System.out.println("Array after removing duplicates");
        for(int i=0;i<=j;i++){
            System.out.println(arr[i]);
        }
    }
    
}
