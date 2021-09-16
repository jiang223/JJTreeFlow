package com.jjtree.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础上下文
 */
class BaseConText {
    public String preStatus = new String();//节点处理状态
    public List<Node>   walkedNodeList = new ArrayList();//已经历过的节点
    public String statusesNames = new String();//节点处理状态路径

}
