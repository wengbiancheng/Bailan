package com.example.ggxiaozhi.store.the_basket.mvp.presenter;

import com.example.ggxiaozhi.store.the_basket.base.BaseActivity;
import com.example.ggxiaozhi.store.the_basket.base.mvpbase.BasePresenter;
import com.example.ggxiaozhi.store.the_basket.mvp.view.fragment_view.AppIntroduceFragmentView;

/**
 * 工程名 ： BaiLan
 * 包名   ： com.example.ggxiaozhi.store.the_basket.mvp.presenter
 * 作者名 ： 志先生_
 * 日期   ： 2017/9/26
 * 功能   ：
 */

public interface AppIntroduceFragmentPresent extends BasePresenter<AppIntroduceFragmentView> {

    void getAppIntroduceFragmentData(BaseActivity activity, String packageName);
}
