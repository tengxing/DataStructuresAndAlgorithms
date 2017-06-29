package cn.yjxxclub.process.MyCollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-6-28
 * Time: 下午6:44
 * Describe: HashMap HashTable 学习
 */
public class HashTest {

    public static void main(String[] args){

        map();
        list();
    }

    /**
     * List
     */
    public static void list(){
        /*ist接口一共有三个实现类，分别是ArrayList、Vector和LinkedList,特点:有序可重复*/
        //Linked适合数据的动态插入和删除，随机访问和遍历速度比较慢
        List linked = new LinkedList();
        //内部是通过数组实现的，它允许对元素进行快速随机访问,当然,数组是有缺点的,比如不能有间隔,有大小限制,
        //是个遍历和查找,不适合插入和删除
        List array = new ArrayList();
        //Vector提供indexOf(obj, start)接口，ArrayList没有
        //vector和ArrayList一样,数组实现,区别就是vector支持同步,线程安全,速度慢
        //线程安全开销大,一般都不使用,如HashTable
        List vector = new Vector();
        

    }

    /**
     * Map
     */
    public static void map(){
        //HashMap可以为空,HashTable不能为空.
        //都实现了Map接口,HashMap是非同步的,所以是非线程安全的.单线程下HashMap速度比HashTable块,性能更高.
        Map hash = new HashMap();
        //HashMap也可以同步
        Map m = Collections.synchronizedMap(hash);
        //HashTable 是sychronized 同步的,所以线程安全,就是说一次仅有一个线程能够改变HashTable(更新之前必须获得同步锁).
        Map table = new Hashtable();
        //ConcurrentHashMap是HashTable的一个替代品,自jdk１.5以后
        Map concurrenthash = new ConcurrentHashMap();
        //HashMap的迭代器(Iterator)是fail-fast迭代器，而Hashtable的enumerator迭代器不是fail-fast的
        //哈希值的使用不同，Hashtable直接使用对象的hashCode,HashMap重新计算hash值
        /*HashMap基于Map接口实现、允许null键/值、非同步、不保证有序(比如插入的顺序)、也不保证序不随时间变化*/
    }

}
