package com.hh.logincompoent;

import android.content.Context;
import android.content.Intent;

import com.hh.componentlib.ILoginService;

/**
 * Create by alex on 2020-03-23
 * desc:
 */
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
