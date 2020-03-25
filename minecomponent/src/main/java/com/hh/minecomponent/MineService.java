package com.hh.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.hh.componentlib.IMineService;

/**
 * Create by alex on 2020-03-23
 * desc:
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context,MineActivity.class);
        context.startActivity(intent);
    }
}
