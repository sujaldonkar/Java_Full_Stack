// Odd Even element array count
public class OddEven{
    public static void main(String[] args) {
        int[] arr={10,2,3,40,7};
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even Number>> "+even);
        System.out.println("Odd Number>> "+odd);
    }
}