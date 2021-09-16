package com.jjtree.base;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 节点
 *
 * 多叉树构成，子节点存放在nodeMap中。
 */
class Node {
    private  Action action;//处理器
    private  String nodeName;//节点名称
    private Map<String,Node> nodeMap = new HashMap();//
}
