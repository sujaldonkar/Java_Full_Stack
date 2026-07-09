public class MajorityElem{
    public static void main(String[] args) {
        int[] arr={1,2,4,1,1,9,1,1};
        //int freq=1;
        int n=arr.length;

        // for(int i=0;i<n;i++){ // Brute Force Approach
        //     for(int j=1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             freq++;
        //         }
        //     }
        //     if(freq>n/2){
        //         System.out.println("Majority Element"+ arr[i]);
        //         break;
        //     }
        // }

        //2nd Method (Optimal Solution)
        // Arrays.sort(arr); // first need to sort the array
        // for(int i=1;i<n;i++){
        //     if(arr[i]==arr[i-1]){
        //         freq++;
        //     }
        //     else{
        //         freq=1;
        //     }
        //     if(freq>n/2){
        //         System.out.println(arr[i]);
        //     }
        // }

        // 3rd method (More's Voting Algorithm)
        int cand=0;
        int count=0;
        int i;
        for(i=0;i<n;i++){
            if(count==0){
                cand=arr[i];
            }
            if(cand==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(cand);
    }
}