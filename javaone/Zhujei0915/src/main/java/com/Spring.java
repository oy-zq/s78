package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  //声明这个类是配置类，
// 在启动的时候 spring 会将 这个类看成是一个等同 **.xml 的配置文件
public class Spring {

    @Bean   //声明这个方法是 Bean 的配置， 等同于<bean class="***"></bean>
    @Scope("prototype")
    public Student getStudent(){
        return new Student();
    }
    @Bean
    public Teacher getTecher(){
        return new Teacher();
    }
}
