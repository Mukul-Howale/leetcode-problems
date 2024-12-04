# Trapping Rain Water

## Problem Description

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water can be trapped after raining.

---

## Examples

### Example 1:
**Input:**  
`height = [0,1,0,2,1,0,1,3,2,1,2,1]`  
**Output:**  
`6`  
**Explanation:**  
The elevation map is represented by the array `[0,1,0,2,1,0,1,3,2,1,2,1]`.  
In this case, `6` units of rainwater (blue section) are trapped.

Illustration:  
The black bars represent the elevation, and the blue section represents the trapped rainwater.

---

### Example 2:
**Input:**  
`height = [4,2,0,3,2,5]`  
**Output:**  
`9`  
**Explanation:**  
The elevation map `[4,2,0,3,2,5]` traps `9` units of rainwater.

---

## Constraints:
- `n == height.length`
- `1 <= n <= 2 * 10⁴`
- `0 <= height[i] <= 10⁵`
