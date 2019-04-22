package com.tlong.core.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: 各种类型转换为List集合
 *
 * @auther: wangzhuo
 * @date: 2019-03-20 10:35
 */
public class IterableToListUtil {

    public static <T> List<T> IterableToList(Iterable<T> iter) {
        List newList = new ArrayList();
        iter.forEach(one -> newList.add(one));
        return newList;
    }
}
