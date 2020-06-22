package com.geespace.commonlib.router

/**
 * Created by maozonghong
 * on 2020/6/19
 */
class ArouterConstants {
    companion object{
        const val NEED_LOGIN:Int=0x01
    }

    class ARouterAddress{
        companion object{

            /**
             * 车辆列表选择页面
             */
            const val CAR_LIST_PATH = "/car/carlist"

            /**
             * 登录页面
             */
            const val USER_LOGIN_PATH = "/user/login"
        }
    }


     class ServerPath{

        companion object{
            const val USER_SERVER="/user/server"

           const val CAR_SERVER="/car/server"
        }

    }
}