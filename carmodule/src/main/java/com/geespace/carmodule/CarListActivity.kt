package com.geespace.carmodule

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.geespace.commonlib.BaseActivity
import com.geespace.commonlib.router.ArouterConstants
import com.geespace.commonlib.router.ICarComponentService

/**
 * Created by maozonghong
 * on 2020/6/18
 */

//路由注解，以及extra标记为该页面需要登录
@Route(path = ArouterConstants.ARouterAddress.CAR_LIST_PATH,extras = ArouterConstants.NEED_LOGIN)
class CarListActivity:BaseActivity() {

    @JvmField
    @Autowired
    var carServerImpl:ICarComponentService?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_activity_car)

        //1. by Type
        //carServerImpl= ARouter.getInstance().navigation(ICarComponentService::class.java)
        //2. by Name
       // carServerImpl=ARouter.getInstance().build(ArouterConstants.ServerPath.CAR_SERVER).navigation()


        carServerImpl?.addFootPrintMark("哈哈哈")
    }
}