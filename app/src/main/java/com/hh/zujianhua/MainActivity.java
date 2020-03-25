package com.hh.zujianhua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hh.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        ServiceFactory.getInstance().getLoginService().launch(this,"");
    }

    public void mine(View view) {
        ServiceFactory.getInstance().getMineService().launch(this,"");
    }
}
