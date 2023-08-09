种一棵树最好的时间是十年前，其次是现在

# LeetCode

| number | LeetCode |             实现              |     时间     | 知识点 | 备注 |     内容      |
|:------:|:--------:|:---------------------------:|:----------:|:---:|:--:|:-----------:|
|   1    |    2     |    Nodes.addTwoNumbers()    | 2023-05-31 | 链表  |    |    两数相加     |
|   2    |    21    |    Nodes.mergeListNode()    | 2021-09-17 | 链表  |    |  合并两个有序链表   |
|   3    |   160    | Nodes.getIntersectionNode() | 2021-09-22 | 链表  |    |  找出两个链表的交点  |
|   4    |   206    |     ListNodeReverseList     | 2021-09-17 | 链表  |    |    链表反转     |
|   5    |    27    |   Arrays.removeElement()    | 2023-06-01 | 数组  |    |    移除元素     |
|   6    |    88    |   Arrays.mergeTwoArrays()   | 2023-06-02 | 数组  |    |  合并两个有序数组   |
|   7    |    26    |  Arrays.removeDuplicate()   | 2023-06-05 | 数组  |    |   删除有序重复项   |
|   8    |    80    |  Arrays.removeDuplicates()  | 2023-06-06 | 数组  |    |   删除有序重复项   |
|   9    |   169    |  Arrays.majorityElement()   | 2023-06-12 | 数组  | *  |    多数元素     |
|   10   |   1768   | Strings.mergeAlternately()  | 2023-06-15 | 字符串 |    |   交替合并字符串   |
|   11   |   1071   |   Strings.gcdOfStrings()    | 2023-06-17 | 字符串 |    |  字符串的最大公因子  |
|   12   |   1431   |  Arrays.kidsWithCandies()   | 2023-06-20 | 数组  |    |  拥有最多糖果的孩子  |
|   13   |   605    |  Arrays.canPlaceFlowers()   | 2023-06-21 | 数组  |    |    种花问题     |
|   14   |   345    |   Strings.reverseVowels()   | 2023-07-01 | 字符串 |    | 反转字符串中的元音字母 |
|   15   |   151    |   Strings.reverseWords()    | 2023-07-02 | 字符串 |    |  反转字符串中的单词  |
|   16   |   238    | Arrays.productExceptSelf()  | 2023-07-09 | 数组  |    | 除自身以外数组的乘积  |
|   17   |   334    | Arrays.increasingTriplet()  | 2023-07-09 | 数组  |    |  递增的三元子序列   |
|   18   |   443    |      Arrays.compress()      | 2023-07-19 | 数组  | *  |    压缩字符串    |
|   19   |   283    |     Pointers.moveZero()     | 2023-07-20 | 双指针 | *  |     移动零     |

# 索引

|        类名        |     时间     |      内容       |  知识点  |
|:----------------:|:----------:|:-------------:|:-----:|
| FindOddFromArray | 2021-10-01 | 从数组中找出出现奇数次的数 | 异或(^) |

# 排序

注意：

- 调用递归函数时需要消耗栈空间，栈空间的大小取决于递归调用的深度，因此调用递归函数的空间复杂度就取决于递归调用的深度

术语铺垫：  
1.稳定排序：如果 a 原本在 b 的前面，且 a == b，排序之后 a 仍然在 b 的前面，则为稳定排序  
2.非稳定排序：如果 a 原本在 b 的前面，且 a == b，排序之后 a 可能不在 b 的前面，则为非稳定排序  
3.原地排序：原地排序就是指在排序过程中不申请多余的存储空间，只利用原来存储待排数据的存储空间进行比较和交换的数据排序  
4.非原地排序：需要利用额外的数组来辅助排序  
5.时间复杂度：一个算法执行所消耗的时间，一般默认指最坏情况下的时间复杂度  
6.空间复杂度：运行完一个算法所需的内存大小

### 排序算法的复杂度

|  名称  |   最优    |   平均    |     最坏      |   内存   | 稳定  |
|:----:|:-------:|:-------:|:-----------:|:------:|:---:|
| 冒泡排序 |    n    |   n^2   |     n^2     |   1    | Yes |
| 插入排序 |    n    |   n^2   |     n^2     |   1    | Yes |
| 归并排序 | nlog(n) | nlog(n) |   nlog(n)   |   n    | Yes |
| 选择排序 |   n^2   |   n^2   |     n^2     |   1    | No  |
| 堆排序  | nlog(n) | nlog(n) |   nlog(n)   |   1    | No  |
| 快速排序 | nlog(n) | nlog(n) |     n^2     | log(n) | No  |
| 希尔排序 | nlog(n) | 取决于差距序列 | n(log(n))^2 |   1    | No  |  

## 测试方法

对于测试方法，不是所有方法都有对应的在线测试(OJ online judge)，所以可以采用“对数器”测试，具体操作如下：

- 对于要测试的方法A()，再写一个同功能的方法B()。B()可以忽视时间复杂度，用最简单的暴力法，力求结果最正确
- 在方法C()里生成随机长度、随机大小的测试数据，同时对A()、B()进行测试，测试某固定次数，对比测试结果，如果结果不一样，则分析A()
  。测试的次数逐渐增大。C()称之为[对数器](https://www.bilibili.com/video/BV13g41157hK)

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

- 初始化
  git init

- add  
  git add .

- commit  
  git commit -m "comment"

- push  
  git push -u origin main  
  git push origin master

- 查看提交历史，后面加上 --pretty=oneline 能使内容单行显示  
  git log

- 查看仓库当前的状态  
  git status

- fatal: unable to access 'https://github.com/chris0er/LeetCode.git/': OpenSSL SSL_read: Connection was reset, errno
  10054    
  git config --global http.sslVerify "false"

# 逻辑运算 Logical operation

逻辑运算符：与，或，非，异或

## 1.与运算（&）

进行运算的两个数据，按二进制位进行“与”运算。  
规则：0&0=0; 0&1=0; 1&0=0; 1&1=1;  
即： 两位同时为“1”，结果才为“1”，否则为0

## 2.或运算（|）

进行运算的两个数据，按二进制位进行“或”运算。  
运算规则：0|0=0； 0|1=1； 1|0=1； 1|1=1；  
即 ：参加运算的两个对象只要有一个为1，其值为1。

## 3.非运算：~

1取0，0取1 ~1 = 0, ~0 = 1 ~(10001) = 01110

## 4.异或运算（^）

参加运算的两个数据，按二进制位进行“异或”运算。

- 运算规则：0^0=0； 0^1=1； 1^0=1； 1^1=0；  
  即：参加运算的两个对象，如果两个相应位为“异”（值不同），则该位结果为1，否则为0。
- 两个数的异或运算可以理解为无进位相加
- 异或运算满足交换律和结合律，a ^ b == b ^ a, a ^ b ^ c == a ^ (b ^ c)
- 0异或任何数=任何数
- 1异或任何数=任何数取反
- 任何数异或自己=0

考点：交换两个变量的值（不借助第三个变量）  
使用异或运算符：  
例：a=6,b=5  
核心代码：  
a = a ^ b;  
b = a ^ b;  
a = a ^ b;  
注意：

-

a和b的值可以一样，但是a和b指向的内存地址必需是两个独立的，如果是同一个内存地址，就变成自己和自己异或，结果为0，所以不建议使用这种方法交换两个变量的值  
可以使用  
a = a + b;  
b = a - b;  
a = a - b;

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
        System.out.println("a =" + a + "," + "b=" + b);
    }
}
```

# 原码、反码、补码

## 原码：

- 用最高位表示符号位，‘1’表示负号，‘0’表示正号。其他位存放该数的二进制的绝对值

原码的特点：

1. 原码表示直观、易懂，与真值转换容易
2. 原码中0有两种不同的表示形式，给使用带来了不便

- 通常0的原码用+0表示，若在计算过程中出现了-0，则需要用硬件将-0变成+0

3. 原码表示加减运算复杂

-

利用原码进行两数相加运算时，首先要判别两数符号，若同号则做加法，若异号则做减法。在利用原码进行两数相减运算时，不仅要判别两数符号，使得同号相减，异号相加；还要判别两数绝对值的大小，用绝对值大的数减去绝对值小的数，取绝对值大的数的符号为结果的符号。可见，原码表示不便于实现加减运算。

## 反码:

- 正数的反码还是等于原码；负数的反码就是它的原码除符号位外，按位取反

## 补码：

- 正数的补码等于它的原码；负数的补码等于反码+1（这只是一种算补码的方式，多数书籍对于补码就是这句话）
- 补码原点总是最高位是‘1’，其他位是‘0’

补码的规定如下：
对正数来说，最高位为0，其余各位代表数值本身(以二进制表示)，如+42的补码为00101010。
对负数而言，把该数绝对值的补码按位取反，然后对整个数加1，即得该数的补码。如-42的补码为11010110(
00101010按位取反11010101+1即11010110)
用补码来表示数，0的补码是单一的，都为00000000。(而在原码，反码表示中，+0和-0的表示是不单一的，可参见相应的书籍)
。而且可以用111111表示-1的补(这也是补码与原码和反码的区别)。

[讲解](https://blog.csdn.net/afsvsv/article/details/94553228/)  
![](https://img-blog.csdn.net/2018072421145662?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poaXdlbl9h/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

## 取反

- 是Java与C/C++使用补码来表示二进制数，在补码表示中，最高位为符号位，正数的符号位为0，负数为1。

运算方法：

- 正数取反  
  先将初始数值转换成二进制数，再对二进制数的每一位（包括第一位的符号位）进行运算：即将0变为1、将1变为0。得到的是最终结果的补码，要转换为最终结果的原码则需再次取补码，就能得到计算结果。  
  【例1】对 5 进行取反。  
  假设为16位。  
  5转换为二进制数为： 0000 0000 0000 0101得到二进制数  
  每一位取反： 1111 1111 1111 1010得到最终结果的补码  
  取补码： 1000 0000 0000 0110得到最终结果的原码  
  转换为十进制数：-6  
  则 5 取反为 -6

- 负数取反  
  先将初始数值转换成二进制数，再取得二进制数的补码，之后对补码的每一位（包括第一位的符号位）进行运算：即将0变为1、将1变为0。得到的是最终结果的补码（到达这一步后所得的二进制数为正数，由于正数的原码、反码、补码相同，后面的运算可以忽略，视此步得到的为最终结果的二进制数），要转换为最终结果的原码则需再次取补码，就能得到计算结果。  
  【例2】对 -5 进行取反。  
  假设为16位。  
  -5 转换为二进制数为： 1000 0000 0000 0101得到二进制数  
  取补码： 1111 1111 1111 1011得到二进制数的补码  
  每一位取反： 0000 0000 0000 0100 得到最终结果的补码  
  取补码： 0000 0000 0000 0100得到最终结果的原码  
  转换为十进制数：4  
  则 -5 取反为 4

- 简便方法  
  也可以用适合人类运算的计算方法：  
  如对 a 按位取反，则得到的结果为 -(a+1)   
  此条运算方式对正数负数和零都适用  


## [动态规划](https://zhuanlan.zhihu.com/p/365698607)
什么样的问题可以考虑使用动态规划解决？
> 如果一个问题，可以把所有可能的答案穷举出来，并且穷举出来后，发现存在重叠子问题，就可以考虑使用动态规划