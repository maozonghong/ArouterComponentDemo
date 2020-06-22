package com.geespace.arouter

import android.content.Context
import android.widget.Toast

/**
 * Created by maozonghong
 * on 2020/5/22
 */
class HelloServiceImple :HelloService {
    var context:Context?=null

    override fun sayHello(name: String) {
        Toast.makeText(context,"say hello ${name}",1).show()
    }

    override fun init(context: Context?) {
        this.context=context
        println("hello service has init")
    }
}