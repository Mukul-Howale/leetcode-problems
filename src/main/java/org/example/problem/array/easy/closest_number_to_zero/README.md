# Closest Number to Zero

## Problem Description

Given an integer array `nums` of size `n`, return the number with the value closest to `0` in `nums`.  
If there are multiple numbers with the same distance to `0`, return the **largest** number.

---

## Examples

### Example 1:
**Input:**  
`nums = [-4,-2,1,4,8]`  
**Output:**  
`1`  
**Explanation:**
- The distance from `-4` to `0` is `|-4| = 4`.
- The distance from `-2` to `0` is `|-2| = 2`.
- The distance from `1` to `0` is `|1| = 1`.
- The distance from `4` to `0` is `|4| = 4`.
- The distance from `8` to `0` is `|8| = 8`.

Thus, the closest number to `0` in the array is `1`.

---

### Example 2:
**Input:**  
`nums = [2,-1,1]`  
**Output:**  
`1`  
**Explanation:**
- Both `1` and `-1` are the closest numbers to `0`.
- Since `1` is larger, it is returned.

---

## Constraints:
- `1 <= n <= 1000`
- `-10⁵ <= nums[i] <= 10⁵`
