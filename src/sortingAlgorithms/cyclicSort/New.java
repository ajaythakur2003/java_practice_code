package sortingAlgorithms.cyclicSort;

public class New {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));

    }

    public static int findKthLargest(int[] nums, int k){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        int newMax = maxValueInSortedArray(nums);
        if(nums.length > newMax){
            return nums[newMax - k];
        }

        return nums[nums.length - k];
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int maxValueInSortedArray(int[] nums){
        int max = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        return index + 2;
    }
}
