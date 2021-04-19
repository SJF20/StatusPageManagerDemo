package com.shijingfeng.staus_page_manager.app.status_page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;

import com.shijingfeng.status_page_manager.status_page.StatusPage;
import com.shijingfeng.staus_page_manager.app.R;

/**
 * Function: 空页 状态页
 * Date: 2021/4/19 10:23
 * Description:
 *
 * @author ShiJingFeng
 */
public class EmptyStatusPage extends StatusPage {

    /**
     * 创建View
     *
     * @param context Context
     * @return View
     */
    @NonNull
    @Override
    @SuppressLint("InflateParams")
    public View onCreateView(@NonNull Context context) {
        return LayoutInflater.from(context).inflate(R.layout.layout_empty_status_page, null);
    }

}
