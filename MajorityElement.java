// Given an integer array of size n, find all the elements that appears more than (n/3) times.
// nums = [1,3,2,5,1,3,1,5,1]

import java.util.*;

public class MajorityElement {
    public static void majorityElement(int nums[]){
        // Step 1  Create a HashMap
        HashMap <Integer,Integer> map = new HashMap<>();
        // Step 2 
        int n = nums.length;
        for(int i=0; i<n; i++){
            // if(map.containsKey(nums[i])){
            //     map.put(nums[i],map.get(nums[i])+1);
            // }else{
            //     map.put(nums[i],1);
            // }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.print(key+" ");
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }
}
