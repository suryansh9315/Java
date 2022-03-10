package com.company.leetcode;
// https://leetcode.com/problems/first-missing-positive/
public class Missing_Number_Cyclic_3 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] nums){
        int i=0;
        while (i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if (j+1!=nums[j]){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
