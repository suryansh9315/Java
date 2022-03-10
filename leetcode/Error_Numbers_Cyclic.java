package com.company.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Error_Numbers_Cyclic {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(error(nums));
    }
    static ArrayList<Integer> error(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i] != nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != (j+1)){
                ans.add(nums[j]);
                ans.add(j+1);
            }
        }
        return ans;
    }
}
