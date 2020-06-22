package com.geespace.commonlib

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter
import com.geespace.commonlib.router.ModuleConfig
import java.lang.Exception

/**
 * Created by maozonghong
 * on 2020/6/18
 */
open class AbsApplication:Application() {

    companion object{
        var APPNAME:String?=null
        lateinit var mInstance:AbsApplication

        fun getInstance():AbsApplication{
            return mInstance
        }

    }

    override fun onCreate() {
        super.onCreate()
        mInstance=this
        APPNAME=packageManager.getApplicationLabel(applicationInfo).toString()
        if (true) {
            ARouter.openLog()   // 打印日志
            ARouter.openDebug()   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this)


        modulesApplicationInit()
    }

    private fun modulesApplicationInit(){
        for(moduleImpl in ModuleConfig.MODULELIST){

            try {
                var clazz=Class.forName(moduleImpl)

                var obj=clazz.newInstance()
                if(obj is IComponentApplication){
                    obj.onCreate(mInstance)
                }

            }catch (e:Exception){
                e.printStackTrace()
            }

        }
    }
}