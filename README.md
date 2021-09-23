# LeetCode
种一棵树最好的时间是十年前，其次是现在  


|LeetCode|类名|时间|内容|知识点|
|:-----:|:----:|:----:|:----:|:----:|
|160|ListNodeIntersection|2021-09-22|找出两个链表的交点|链表|
|206|ListNodeReverseList|2021-09-17|链表反转|链表|

### 排序算法的复杂度
|名称|最优|平均|最坏|内存|稳定|
|:-----:|:----:|:----:|:----:|:----:|:----:|
|冒泡排序|n|n^2|n^2|1|Yes|
|插入排序|n|n^2|n^2|1|Yes|
|归并排序|nlog(n)|nlog(n)|nlog(n)|n|Yes|
|选择排序|n^2|n^2|n^2|1|No|
|堆排序|nlog(n)|nlog(n)|nlog(n)|1|No|
|快速排序|nlog(n)|nlog(n)|n^2|log(n)|No|
|希尔排序|nlog(n)|取决于差距序列|n(log(n))^2|1|No|  



## 数据结构

- 字符串
- 数组
- 链表
- 二叉树
- 堆
- 栈
- 队列
- 哈希

## 算法

- 查找
- 排序
- 贪心
- 分治
- 动态规划
- 回溯

## Git  
添加远程仓库  
git remote add origin https://github.com/chris0er/LeetCode.git  

push  
git push -u origin main  

fatal: unable to access 'https://github.com/chris0er/LeetCode.git/': OpenSSL SSL_read: Connection was reset, errno 10054  
git config --global http.sslVerify "false"