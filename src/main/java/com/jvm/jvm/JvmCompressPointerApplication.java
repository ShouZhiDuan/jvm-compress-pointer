package com.jvm.jvm;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class JvmCompressPointerApplication {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start main function ......");
        System.out.println("args：" + args[0]);
        //SpringApplication.run(JvmCompressPointerApplication.class, args);
        List<Integer> list = new LinkedList<>();
        int total = Integer.parseInt(args[0]) * 10000;
        for (int i = 0; i < total; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        // 留给观察和截图的时间
        Thread.sleep(6000);
        // 维持一个引用
        System.out.println("结束：" + list.size());
    }

}
