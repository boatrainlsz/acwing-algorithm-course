### 定义
见[leetcode56题](https://leetcode.cn/problems/merge-intervals/description/)

### 思路
1. 先按左端点排序
2. 维护一个candidate，然后从左到右遍历各个区间current.
3. 如果current和candidate没交集，则把candidate加入答案，再把current变为新的candidate.
4. 如果有交集，则合并两区间.
5. 循环结束后，再把candidate加入答案.