package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为 K 的子数组
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (map.containsKey(prefixSum - k))
                cnt += map.get(prefixSum - k);
            if (map.containsKey(prefixSum))
                map.replace(prefixSum, map.get(prefixSum) + 1);
            else
                map.put(prefixSum, 1);
        }
        return cnt;
    }
}
// @lc code=end
