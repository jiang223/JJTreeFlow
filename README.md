# 项目地址
- github:[https://github.com/jiang223/JJTreeFlow](https://github.com/jiang223/JJTreeFlow)   

# 简单介绍
该框架的灵感来自于多叉树。本人在项目中经常遇到如一笔业务经常有多成系统或交易直接的流转
如一笔取款交易需要调用关联系统校验、取款交易，需要调用外围系统的相关接口，由这些接口最终串成最终的工作链，而每个节点或交易之间
也有存在成功、超时、失败等不同的结果从而需要根据上一节点的处理结果分发到下个模块中，从而本人想到了通过多叉树的方式，定义整个工作链，来处理这种类似的流程业务：

- context：对应工作流的中的上下文，由该参数串联全部节点（data）
- node：一个节点
- action：节点中的处理过程
- tree：由多个节点组成一个完整的树 
- handelTreeNode：串联节点与节点之间关系以及调用action。

node可以直接action，通过多个node组成完整的tree，然后handelTreeNode通过tree
来调用node中的action,而context连接着所有的node。