package Algorithm.Sort;

/**
 * Created by liuyupeng@hey900.com on 2018/3/16.
 */
public class DBubbleSort {//定向冒泡排序

    private static final int SIZE = 10;

    public static void run(){
        int[] nums = createNums();
        System.out.print("生成的随机数列为:");
        Functions.showInt(nums, SIZE);
        int i = 0;
        int j = SIZE - 1;
        while(j > i) {
            for (int k = i + 1; k <= j; k++) {
                if (nums[k - 1] >= nums[k]){
                    int temp = nums[k];
                    nums[k] = nums[k - 1];
                    nums[k - 1] = temp;
                }
            }
            j--;
            for (int k = j - 1; k >= i; k--) {
                if (nums[k + 1] <= nums[k]){
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                }
            }
            i++;
            System.out.print("第" + i + "趟排序后结果为:");
            Functions.showInt(nums, SIZE);
        }
        System.out.print("排序完成数列为:");
        Functions.showInt(nums, SIZE);
    }

    private static int[] createNums() {
        int[] res = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            res[i] = (int) Math.round(Math.random() * 100);
        }
        return res;
    }
}
