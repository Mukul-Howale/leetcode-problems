# Merge Sorted Array

## Problem Description

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2`, respectively.

Merge `nums1` and `nums2` into a single array sorted in non-decreasing order.  
The final sorted array should be stored **in-place** inside `nums1`.

To accommodate the merge:
- `nums1` has a length of `m + n`, where:
    - The first `m` elements are the elements to be merged.
    - The last `n` elements are set to `0` and should be ignored.
- `nums2` has a length of `n`.

---

## Examples

### Example 1:
**Input:**  
`nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3`  
**Output:**  
`[1,2,2,3,5,6]`  
**Explanation:**  
The arrays being merged are `[1,2,3]` and `[2,5,6]`.  
The result of the merge is `[1,2,2,3,5,6]`.

---

### Example 2:
**Input:**  
`nums1 = [1]`, `m = 1`, `nums2 = []`, `n = 0`  
**Output:**  
`[1]`  
**Explanation:**  
The arrays being merged are `[1]` and `[]`.  
The result of the merge is `[1]`.

---

### Example 3:
**Input:**  
`nums1 = [0]`, `m = 0`, `nums2 = [1]`, `n = 1`  
**Output:**  
`[1]`  
**Explanation:**  
The arrays being merged are `[]` and `[1]`.  
Since `m = 0`, there are no elements in `nums1`.  
The result of the merge is `[1]`.

---

## Constraints:
- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10⁹ <= nums1[i], nums2[j] <= 10⁹`
