package com.geespace.commonlib

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Created by maozonghong
 * on 2020/6/18
 */
open class BaseActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(javaClass.name,"onCreate")
        ARouter.getInstance().inject(this)
    }

}