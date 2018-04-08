package com.mymvp.base;

public interface BaseView {

    /**
     * 显示正在加载的View
     */
    void showLoading();

    /**
     * 隐藏正在加载的View
     */
    void hideLoading();

    /**
     * 显示提示信息
     * @param msg
     */
    void showToast(String msg);
}
