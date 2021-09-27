种一棵树最好的时间是十年前，其次是现在  
  

# LeetCode

|LeetCode|类名|时间|内容|知识点|
|:-----:|:----:|:----:|:----:|:----:|
|21|ListNodeMerge|2021-09-17|合并两个有序链表|链表|
|160|ListNodeIntersection|2021-09-22|找出两个链表的交点|链表|
|206|ListNodeReverseList|2021-09-17|链表反转|链表|


# 排序

注意：  
- 调用递归函数时需要消耗栈空间，栈空间的大小取决于递归调用的深度，因此调用递归函数的空间复杂度就取决于递归调用的深度

术语铺垫：  
1.稳定排序：如果 a 原本在 b 的前面，且 a == b，排序之后 a 仍然在 b 的前面，则为稳定排序  
2.非稳定排序：如果 a 原本在 b 的前面，且 a == b，排序之后 a 可能不在 b 的前面，则为非稳定排序  
3.原地排序：原地排序就是指在排序过程中不申请多余的存储空间，只利用原来存储待排数据的存储空间进行比较和交换的数据排序  
4.非原地排序：需要利用额外的数组来辅助排序  
5.时间复杂度：一个算法执行所消耗的时间  
6.空间复杂度：运行完一个算法所需的内存大小  

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


# Git  

- 添加远程仓库  
git remote add origin https://github.com/chris0er/LeetCode.git  
  
- add  
git add .  

- commit  
git commit -m "comment"  
  
- push  
git push -u origin main  

- 查看提交历史，后面加上  --pretty=oneline  能使内容单行显示  
git log  
  
- 查看仓库当前的状态  
git status  
  
- fatal: unable to access 'https://github.com/chris0er/LeetCode.git/': OpenSSL SSL_read: Connection was reset, errno 10054    
git config --global http.sslVerify "false"  


# 逻辑运算 Logical operation

逻辑运算符：与，或，非，异或
## 1.与运算（&）
进行运算的两个数据，按二进制位进行“与”运算。  
规则：0&0=0;   0&1=0;    1&0=0;     1&1=1;  
即： 两位同时为“1”，结果才为“1”，否则为0

## 2.或运算（|）
进行运算的两个数据，按二进制位进行“或”运算。  
运算规则：0|0=0；   0|1=1；   1|0=1；    1|1=1；  
即 ：参加运算的两个对象只要有一个为1，其值为1。

## 3.非运算：~
1取0，0取1 ~1 = 0, ~0 = 1 ~(10001) = 01110

## 4.异或运算（^）
参加运算的两个数据，按二进制位进行“异或”运算。  
运算规则：0^0=0；   0^1=1；   1^0=1；   1^1=0；  
即：参加运算的两个对象，如果两个相应位为“异”（值不同），则该位结果为1，否则为0。  
考点：交换两个变量的值（不借助第三个变量）  
使用异或运算符：  
例：a=6,b=5  
核心代码：  
a = a ^ b;
b = a ^ b;
a = a ^ b;

```java
import java.util.Scanner;

public class ChangeAB {
    public static void main(String[] args) {
        System.out.println("请输入两个数A与B");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a ="+a +","+"b="+b);
    }
}
```