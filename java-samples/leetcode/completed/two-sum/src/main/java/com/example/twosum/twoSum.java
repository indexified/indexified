package com.example.twosum;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.function.Consumer;

@SpringBootApplication
public class twoSum {
    public static void main(String[] args) {


        int[] nums = new int[]{2,9,7,11};
        int target = 9;
        int[] fin ;
        fin = Solution(nums,target);
        System.out.println(Arrays.toString(fin));
    }

    static int[] Solution(int[] nums, int target) {
        int[] fn = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    fn[0] = i;
                    fn[1] = j;
                }
            }
        }
        return fn;
    }

}
