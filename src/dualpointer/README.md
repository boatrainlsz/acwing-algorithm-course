### 双指针的本质
将 $O(N^2)$ 的算法，根据其某种序列中的特性，优化为 $O(N)$ 的算法:

```java
for(int i = 0;i<nums.length;i++){
    for(int j = 0;j<nums.length;j++){

    }
}
```

```java
for(int i = 0;i<nums.length;i++){
    while(j <i&&check(j))j++;
}
```
其中 `check` 是指j满足某种性质