package com.example.spring_data_jdbc_demo.callback;

public class callBackMainTest {

    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.print();
    }
}
