package com.geespace.commonlib.router

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Created by maozonghong
 * on 2020/6/19
 *
 * 用户模块对外方法
 */
interface IUserComponentService:IProvider {

    /**
     * 是否已登录
     */
    fun isLogin():Boolean

    /**
     * 退出登录
     */
    fun logOut():Boolean

    /**
     * 执行登录操作
     */
    fun login(phone:String,code:String):Boolean
}