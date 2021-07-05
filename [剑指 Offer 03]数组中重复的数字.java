//找出数组中重复的数字。 
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 排序 
// 👍 471 👎 0


/**
 * 利用hash查找
 * 利用set特性去重
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,String> map = new HashMap<>();
        int repeat = -1;
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num,null);
        }
        return repeat;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
