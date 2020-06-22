package com.geespace.usermodel

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.geespace.commonlib.router.ArouterConstants
import com.geespace.commonlib.router.IUserComponentService

/**
 * Created by maozonghong
 * on 2020/6/19
 */
@Route(path = ArouterConstants.ServerPath.USER_SERVER)
class UserServerImpl:IUserComponentService {

    val TAG="UserServerImple"

    var isLoge=false

    override fun isLogin(): Boolean {

        return isLoge
    }

    override fun logOut(): Boolean {

        return true
    }

    override fun login(phone: String, code: String): Boolean {

        Log.e(TAG,"login phone:${phone}, code:${code}")
        isLoge=true
        return isLoge
    }

    override fun init(context: Context?) {

    }
}