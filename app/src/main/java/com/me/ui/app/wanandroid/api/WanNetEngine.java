package com.me.ui.app.wanandroid.api;

import com.me.ui.app.common.network.RetrofitClient;
import com.me.ui.app.wanandroid.config.WanConstants;
import com.me.ui.app.wanandroid.data.WanArticleBean;
import com.me.ui.app.wanandroid.data.WanBannerBean;
import com.me.ui.app.wanandroid.data.WanHotKeyBean;
import com.me.ui.app.wanandroid.data.WanListModule;
import com.me.ui.app.wanandroid.data.WanModule;
import com.me.ui.app.wanandroid.data.WanWebsiteBean;

import rx.Observable;

/**
 * @author tangqi on 17-3-14.
 */
public class WanNetEngine {

    private final WanApi mWanApi;
    private static final WanNetEngine sInstance = new WanNetEngine();

    public static WanNetEngine getInstance() {
        return sInstance;
    }

    private WanNetEngine() {
        mWanApi = RetrofitClient.getInstance().buildApi(WanConstants.BASE_URL, WanApi.class);
    }

    public Observable<WanModule<WanArticleBean>> getMainArticleList(int page) {
        return mWanApi.getMainArticleList(page);
    }

    public Observable<WanListModule<WanBannerBean>> getMainBanner() {
        return mWanApi.getMainBanner();
    }

    public Observable<WanListModule<WanWebsiteBean>> getMainWebsite() {
        return mWanApi.getMainWebsite();
    }

    public Observable<WanListModule<WanHotKeyBean>> getMainHotKey() {
        return mWanApi.getMainHotKey();
    }
}
