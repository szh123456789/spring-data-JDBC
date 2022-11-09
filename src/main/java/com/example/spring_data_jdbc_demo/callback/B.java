package com.example.spring_data_jdbc_demo.callback;

import lombok.Data;

@Data
public class B {

    public void toCallBack(CallBackInterface callBackInterface){
        callBackInterface.callBack();
    }
}
