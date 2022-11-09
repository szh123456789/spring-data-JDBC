package com.example.spring_data_jdbc_demo.callback;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class A implements CallBackInterface{

    private final B  b;

    public void print(){
        System.out.println("回调开始");
        b.toCallBack(this);
        System.out.println("回调结束");
    }

    @Override
    public void callBack() {
        System.out.println("回调函数");
    }
}
