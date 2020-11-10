package org.martin.baseapi;

import java.util.ArrayList;

/**
 * 如果希望向ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 从jdk 1.7+开始，右侧的尖括号内部可以不写内容
        ArrayList<String> strList = new ArrayList<>();
        // 打印的不是地址，而是内容
        System.out.println(strList);
        // 方法：
        strList.add("a");
        strList.get(0);
        //返回的是被删除的元素
        String deleteContent = strList.remove(0);
    }
}
