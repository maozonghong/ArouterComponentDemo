package com.geespace.commonlib.router

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
import com.alibaba.android.arouter.launcher.ARouter
import com.geespace.commonlib.utils.PreferencesUtil

/**
 * Created by maozonghong
 * on 2020/6/19
 * 登录拦截器
 * 跳转过程中处理登陆事件，这样就不需要在目标页重复做登陆检查
 * 拦截器会在跳转之间执行
 */
@Interceptor(priority = 8,name = "登录拦截器")
class LoginInterceptor : IInterceptor {

    val TAG="LoginInterceptor"

    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
        Log.e(TAG,"process:${postcard?.path}")

        if(ArouterConstants.NEED_LOGIN!=postcard?.extra) {
            callback?.onContinue(postcard)
            return
        }
        if(checkIsLogin()){
            callback?.onContinue(postcard)
        }else{
            callback?.onInterrupt(null)
            ARouter.getInstance().build(ArouterConstants.ARouterAddress.USER_LOGIN_PATH).greenChannel().navigation()
        }
    }

    override fun init(context: Context?) {
        // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
        Log.e(TAG,"LoginInterceptor init")
    }

    /**
     * 判断是否登录
     * @return
     */
    private fun checkIsLogin(): Boolean {
        //isNotLogin = 登录逻辑
        return PreferencesUtil.readBoolean("isLogin",false)
    }


}