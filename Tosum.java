package Leetcode;
// import java.util.HashMap;


class Solution {
    public static void main(String[] args) {
        
    
   int nums[] = {2,7,3,4,5};
   int a=9;
   for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
        // so we allocate i and j in the array
        if(nums[i] + nums[j] == a){
            System.out.print("[ "+i );
            System.out.println(j+"]");
            break;

            

        }

    
    }
   }
}
}


