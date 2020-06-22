package com.geespace.usermodel

import android.os.Bundle
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.geespace.commonlib.BaseActivity
import com.geespace.commonlib.router.ArouterConstants
import com.geespace.commonlib.utils.PreferencesUtil
import kotlinx.android.synthetic.main.user_activity_login.*

/**
 * Created by maozonghong
 * on 2020/6/18
 */
@Route(path = ArouterConstants.ARouterAddress.USER_LOGIN_PATH)
class LoginActivity:BaseActivity(){
    @Autowired
    @JvmField
    var userServer:UserServerImpl?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_activity_login)


        tv_login.setOnClickListener {
                userServer?.login("18521507187","76587")
            Toast.makeText(this,"登录成功",1).show()
            PreferencesUtil.writeBoolean("isLogin",true)
            finish()
            ARouter.getInstance().build(ArouterConstants.ARouterAddress.CAR_LIST_PATH).navigation()
        }
    }
}