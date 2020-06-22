package com.geespace.carmodule

import android.app.Application
import android.util.Log
import com.geespace.commonlib.AbsApplication
import com.geespace.commonlib.IComponentApplication

/**
 * Created by maozonghong
 * on 2020/6/18
 */
class CarApplicationLike:IComponentApplication {

    val TAG="CarApplicationLike"

    lateinit var application:AbsApplication

    override fun onCreate(application: AbsApplication) {

        Log.e(TAG,"onCreate")
        this.application=application
    }

    override fun getApplication(): Application {

        return application
    }

}