# Search in Rotated Sorted Array

## Problem Description

You are given an integer array `nums` sorted in ascending order (with distinct values). The array `nums` is possibly **rotated** at an unknown pivot index `k` (where `1 <= k < nums.length`).  
The resulting array appears as `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]`.

For example, the array `[0,1,2,4,5,6,7]` might be rotated at pivot index `3` to become `[4,5,6,7,0,1,2]`.

### Task:
Given the rotated array `nums` and an integer `target`, return:
- The **index** of `target` if it is in `nums`.
- `-1` if `target` is not in `nums`.

### Requirements:
- Write an algorithm with **O(log n)** runtime complexity.

---

## Examples

### Example 1:
**Input:**  
`nums = [4,5,6,7,0,1,2]`, `target = 0`  
**Output:**  
`4`

---

### Example 2:
**Input:**  
`nums = [4,5,6,7,0,1,2]`, `target = 3`  
**Output:**  
`-1`

---

### Example 3:
**Input:**  
`nums = [1]`, `target = 0`  
**Output:**  
`-1`

---

## Constraints:
- `1 <= nums.length <= 5000`
- `-10⁴ <= nums[i] <= 10⁴`
- All values in `nums` are **unique**.
- `nums` is an ascending array that is possibly rotated.
- `-10⁴ <= target <= 10⁴`
