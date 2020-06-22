package com.geespace.carmodule

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.geespace.commonlib.router.ArouterConstants
import com.geespace.commonlib.router.ICarComponentService

/**
 * Created by maozonghong
 * on 2020/6/19
 */
@Route(path = ArouterConstants.ServerPath.CAR_SERVER)
class CarServerImpl :ICarComponentService{

    val  TAG="CarServerImpl"

    var carMap=HashMap<String,ArrayList<Any>>()

    var footList=ArrayList<Any>()

    override fun getCarNum(userId: String): Int {
        Log.e(TAG,"getCarNum()")
        return carMap[userId]?.size?:0
    }

    override fun addFootPrintMark(any: Any) {
        Log.e(TAG,"addFootPrintMark(${any})")
        footList.add(any)
    }

    override fun init(context: Context?) {

    }
}