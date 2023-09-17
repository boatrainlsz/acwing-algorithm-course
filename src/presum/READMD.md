### 前缀和定义
对于一个数组 $a$，前缀和定义为：

![presum.svg](presum.svg)

之所以 $S_{0}=0 $，是为了便于处理边界情况.

### 用途

唯一的用途就是用来求区间和:

$sum[i,j]=S[j]-S[i-1]$

### 二维前缀和

https://oi-wiki.org/basic/prefix-sum/
