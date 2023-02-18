public class A1TwoSum {
    public static void main(String[] args) {

        Solution solution =new Solution();
        int [] nums={3,2,3,10};

        int[]a = solution.twoSum(nums,12);

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] a = new int[2];

        for (int i = 0; i <= nums.length -2; i++) {
            for (int x = 0; x <= i; x++) {
                        if (nums[x] + nums[i + 1] == target) {

                            a[0] = x;
                            a[1] = i + 1;


                }


            }
        }
        return a;
    }
}


