package com.geespace.commonlib.router

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Created by maozonghong
 * on 2020/6/19
 *
 * 车辆模块对外方法
 */
interface ICarComponentService:IProvider {

    /**
     * 获取车辆数目
     */
    fun getCarNum(userId:String):Int

    /**
     * 添加浏览历史记录
     */
    fun addFootPrintMark(any:Any)
}