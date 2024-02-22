package com.github.cjunopen.baselibrary.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import autodispose2.AutoDispose;
import autodispose2.AutoDisposeConverter;
import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider;

/**
 * @Description:
 * @Author: CJ
 * @CreateDate: 2023/5/31 1:03
 */
public class RxjavaUtils {
    /**
     * rxjava 绑定生命周期
     * @param owner
     * @param event
     * @param <T>
     * @return
     */
    public static <T> AutoDisposeConverter<T> bindAutoDispose(LifecycleOwner owner, Lifecycle.Event event) {
        return AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(owner, event));
    }
}
