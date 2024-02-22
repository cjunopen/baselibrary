package com.github.cjunopen.baselibrary.util;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import timber.log.Timber;

public class BaseLibraryUtil {
    /**
     * 初始化
     */
    public static void init(){
        Timber.plant(new Timber.DebugTree());

        RxJavaPlugins.setErrorHandler(throwable -> {
            throwable.printStackTrace();
        });
    }


}
