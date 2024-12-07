# Candy

## Problem Description

There are `n` children standing in a line, and each child is assigned a rating value given in the integer array `ratings`.  
You are tasked with distributing candies to these children subject to the following rules:
1. Each child must receive at least **one candy**.
2. Children with a **higher rating** than their neighbors must receive **more candies** than their neighbors.

Return the **minimum number of candies** required to satisfy these rules.

---

## Examples

### Example 1:
**Input:**  
`ratings = [1,0,2]`  
**Output:**  
`5`  
**Explanation:**  
You can distribute the candies as follows:
- The first child gets `2` candies.
- The second child gets `1` candy.
- The third child gets `2` candies.

---

### Example 2:
**Input:**  
`ratings = [1,2,2]`  
**Output:**  
`4`  
**Explanation:**  
You can distribute the candies as follows:
- The first child gets `1` candy.
- The second child gets `2` candies.
- The third child gets `1` candy, as it satisfies the rules.

---

## Constraints:
- `n == ratings.length`
- `1 <= n <= 2 * 10⁴`
- `0 <= ratings[i] <= 2 * 10⁴`
