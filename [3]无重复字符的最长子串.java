//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 
// 👍 5689 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * 利用HashMap，时间复杂度O(1)，比较是否重复
 * 整个方法的时间复杂度为O(n);遍历了整个字符串。
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int end = 0,start = 0 ; end < s.length();end++){
            Character character = s.charAt(end);
            if(map.containsKey(character)){
                start = Math.max(map.get(character),start);
            }
            ans = Math.max(ans,end - start + 1);
            map.put(character,end + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
