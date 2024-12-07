# Merge Strings Alternately

## Problem Description

You are given two strings `word1` and `word2`. Merge the strings by adding letters in **alternating order**, starting with `word1`.  
If one string is longer than the other, append the remaining letters of the longer string to the merged result.

Return the **merged string**.

---

## Examples

### Example 1:
**Input:**  
`word1 = "abc"`, `word2 = "pqr"`  
**Output:**  
`"apbqcr"`  
**Explanation:**  
The merged string is created as follows:
- `word1`: `a   b   c`
- `word2`: `  p   q   r`
- `merged`: `a p b q c r`

---

### Example 2:
**Input:**  
`word1 = "ab"`, `word2 = "pqrs"`  
**Output:**  
`"apbqrs"`  
**Explanation:**
- `word1`: `a   b`
- `word2`: `  p   q   r   s`
- `merged`: `a p b q   r   s`

Since `word2` is longer, the remaining letters `"rs"` are appended.

---

### Example 3:
**Input:**  
`word1 = "abcd"`, `word2 = "pq"`  
**Output:**  
`"apbqcd"`  
**Explanation:**
- `word1`: `a   b   c   d`
- `word2`: `  p   q`
- `merged`: `a p b q c   d`

Since `word1` is longer, the remaining letters `"cd"` are appended.

---

## Constraints:
- `1 <= word1.length, word2.length <= 100`
- `word1` and `word2` consist of lowercase English letters.
