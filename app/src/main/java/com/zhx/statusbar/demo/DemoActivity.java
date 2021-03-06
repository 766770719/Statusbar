package com.zhx.statusbar.demo;

import android.app.Activity;
import android.os.Bundle;

import com.zhx.statusbar.SmartBarUtils;
import com.zhx.statusbar.StatusBarUtils;

/**
 * DemoActivity
 * Created by owner on 2016/5/23.
 */
public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_demo);

        //隐藏魅族的SmartBar,这句话可要可不要，不是必须
        SmartBarUtils.hide(getWindow().getDecorView());

        //透明状态栏
        StatusBarUtils.translucentStatusBar(this, findViewById(R.id.v_title));

        //解决:android:windowSoftInputMode=adjustResize,键盘弹出UI无法Resize问题 --> 布局XML中最后加入:KeyboardDisplayView(参考demo)
        //注意:在使用KeyboardDisplayView的布局中，不能出现:android:fitsSystemWindows="true"
    }
}
