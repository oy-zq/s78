package com;

import com.Student;
//高中生
public class School extends Student {
    //重载    方法名相同参数不同
    // 在同一个类中
    // 重载是多态的实现之一，重载特性，可以让我们一个方法有多种实现
    public void abc(int a){}
    public void abc(String a){}

    //重写
    //实际上就是在子类新建一个同名方法，覆盖掉父类方法

    public void study() {
        System.out.println("高中生在学习");
    }
}
