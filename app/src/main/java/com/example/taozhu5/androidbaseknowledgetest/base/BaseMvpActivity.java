package com.example.taozhu5.androidbaseknowledgetest.base;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author taozhu5
 * @date 2019/7/3 17:02
 * @description 基类
 */
public abstract class BaseMvpActivity extends AppCompatActivity implements IBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        initData();
        initView();
        initEvent();
    }

    public <T extends View> T $(@IdRes int id) {
        return findViewById(id);
    }
}