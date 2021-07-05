//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 
// 👍 137 👎 0

/**
 * 怎么都能替换
 */
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder(s);
        int spaceNum = 0;// 字符串中空格的个数
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        int indexOld = sb.length() - 1;// 原长度下，最有一个字符的下标
        // 重设StringBuilder长度，不然会有空指针，空格换%20，多空格的2倍长度
        sb.setLength(sb.length() + spaceNum * 2);
        int indexNew = sb.length() - 1;// 新长度下，最有一个字符的下标
        // 当indexNew和indexOld相等时，说明前面就没有空格了，即可退出
        while (indexNew != indexOld) {
            if (sb.charAt(indexOld) == ' ') {
                sb.setCharAt(indexNew--, '0');
                sb.setCharAt(indexNew--, '2');
                sb.setCharAt(indexNew--, '%');
            } else {
                sb.setCharAt(indexNew--, sb.charAt(indexOld));
            }
            indexOld--;
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
