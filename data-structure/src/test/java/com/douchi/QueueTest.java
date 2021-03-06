package com.douchi;

import com.douchi.queue.ArrayQueue;
import com.douchi.queue.LinkedQueue;
import com.douchi.queue.MyQueue;
import org.junit.Test;

/**
 * @description: 队列测试
 * @author: Lee
 * @time: 2020/1/17 17:06
 */
public class QueueTest {

    @Test
    public void ArrayQueueTest() {
        MyQueue<String> queue = new ArrayQueue<>(3);
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
//        queue.enQueue("d");

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        queue.enQueue("e");

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

    }


    @Test
    public void linkedQueueTest(){
        MyQueue<String> queue = new LinkedQueue<String>();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
//        queue.enQueue("d");

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());

        queue.enQueue("e");

        System.out.println(" 大小  ： " +queue.size());
        System.out.println(" 队头  ： " +queue.peek());
        System.out.println(" 出列  ： " + queue.deQueue());
    }
}
