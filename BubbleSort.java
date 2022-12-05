import java.util.Random;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[6];
        Random randNum = new Random();
        for (int i = 0; i < 6; i++) {
            nums[i] =  randNum.nextInt(64);
        }
        int lastPositionModified = nums.length;
        System.out.println("before " + Arrays.toString(nums));
        do { 
        int newLastPositionModified = 0;
        for (int i = 1; i < lastPositionModified; i++) 
            if (nums[i-1] > nums[i]) { 
                int temp = nums[i]; 
                nums[i] = nums[i-1]; 
                nums[i-1] = temp; 
                newLastPositionModified = i;
            }
        lastPositionModified = newLastPositionModified;
    } while (lastPositionModified > 1);
    System.out.println("after " + Arrays.toString(nums));
    }
}