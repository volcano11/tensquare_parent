package com.tensquare.qa.client.impl;

import com.tensquare.qa.client.LabelClient;
import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

@Component
public class LabelClientImpl implements LabelClient {


    @Override
    public Result findById(String id) {
        System.out.println("熔断器启动了");
        return new Result(false, StatusCode.REMOTEERROR,"熔断器启动了");
    }
}
