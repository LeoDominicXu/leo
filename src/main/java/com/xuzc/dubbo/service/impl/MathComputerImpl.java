package com.xuzc.dubbo.service.impl;

import com.xuzc.dubbo.service.MathComputer;

/**
 * @Description: The description of the file.
 * @Author: Lagou
 * @Date: 2016/11/9
 */
public class MathComputerImpl implements MathComputer {
    @Override
    public int addMethod(int a, int b) {
        return a+b;
    }
}
