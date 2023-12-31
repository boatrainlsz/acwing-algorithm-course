### 定义

离散化，就是当我们只关心数据的大小关系时，
用排名代替原数据进行处理的一种预处理方法。 
离散化本质上是一种哈希，它在保持原序列大小关系的前提下把其映射成正整数。 当原数据很大或含有负数、小数时，难以表示为数组下标，一些算法和数据结构（如BIT）无法运作，这时我们就可以考虑将其离散化。一般适用于数据的值域很大，但是值都很稀疏的情况。

### 例子
$a[] = [1,3,100,200,500000]$ 可以映射到 $a' = [0,1,2,3,4]$ 。

### 问题
要完成离散化，需要解决以下两个问题：
1. 对原数组去重，这个没啥难度
2. 计算出原数组中每个值离散化后的值(即它的下标)，一般通过二分查找来解决。