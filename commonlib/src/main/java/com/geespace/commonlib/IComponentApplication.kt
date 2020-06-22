package com.geespace.commonlib

import android.app.Application

/**
 * Created by maozonghong
 * on 2020/6/18
 */
interface IComponentApplication {

    fun onCreate(application:AbsApplication)

    fun getApplication(): Application

}