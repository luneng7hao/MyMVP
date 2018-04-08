package com.mymvp.base;

public interface CallBack<T> {

    /**
     * 数据请求成功
     * @param data
     */
    void onSuccess(T data);

    /**
     * 请求成功返回错误信息时
     * @param msg
     */
    void onFailure(String msg);

    /**
     * 请求数据失败，未接收到放回的数据
     */
    void onError();

    /**
     * 请求结束
     * 在此处可隐藏加载框
     */
    void onComplete();
}
