package com.geespace.arouter

import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.geespace.commonlib.BaseActivity
import com.geespace.commonlib.router.ArouterConstants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    val TAG="MainActivity"

    var callback=object:NavigationCallback{
        override fun onLost(postcard: Postcard?) {
            Log.e(TAG,"onLost:"+postcard?.path)
        }

        override fun onFound(postcard: Postcard?) {
            Log.e(TAG,"onFound")
        }

        override fun onInterrupt(postcard: Postcard?) {
            Log.e(TAG,"onInterrupt")
        }

        override fun onArrival(postcard: Postcard?) {
            Log.e(TAG,"onArrival")
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car_list.setOnClickListener{
           ARouter.getInstance().
                build(ArouterConstants.ARouterAddress.CAR_LIST_PATH).navigation(this,callback)
        }
    }



}
