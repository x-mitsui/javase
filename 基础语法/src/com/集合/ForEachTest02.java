package com.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("你好");
        strList.add("世界");
        Iterator<String> it = strList.iterator();

        //迭代器方式遍历
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        //下标方式遍历
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //使用foreach
        for (String s :
                strList) {
            System.out.println(s);
        }
    }
}
