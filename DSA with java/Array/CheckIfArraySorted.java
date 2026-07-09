public class CheckIfArraySorted{
    public static void main(String[] args) {
        int[] arr={10,4,30,40,40};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[0]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted==true){
            System.out.println("Array is sorted"+ issorted);
        }else{
            System.out.println("Array is not sorted"+ issorted);
        }

    }
}