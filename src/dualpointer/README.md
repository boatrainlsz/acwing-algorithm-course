### 双指针的本质
将 $O(N^2)$ 的算法，根据其某种序列中的特性，优化为 $O(N)$ 的算法:

```java
for(int i = 0;i<nums.length;i++){
    for(int j = 0;j<nums.length;j++){

    }
}
```
优化为

```java
for(int i = 0;i<nums.length;i++){
    while(j < i && check(j))j++;
}
```
其中 `check` 是指j满足某种性质

### 例子
最简单的例子就是[字符串中的单词数](https://leetcode.cn/problems/number-of-segments-in-a-string/)
```java
class Solution {
    public int countSegments(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && s.charAt(j) != ' ') j++;
            if (i != j) ans++;
            i = j;
        }
        return ans;
    }
}
```

这里的性质就是j所在的字符不是空格