package com.geespace.arouter

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Created by maozonghong
 * on 2020/5/22
 */
interface HelloService :IProvider{
    fun sayHello(name:String)
}