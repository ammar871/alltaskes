package com.taskesnoad.alltaskes.screens;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import com.taskesnoad.alltaskes.R;
import com.taskesnoad.alltaskes.commen.Commen;
import com.taskesnoad.alltaskes.databinding.ActivitySpilashBinding;
import com.taskesnoad.alltaskes.languach.SelectLangactivity;

import java.util.Timer;
import java.util.TimerTask;

public class SpilashActivity extends AppCompatActivity {
    private static final int WAIT_TIME = 1000;

    ActivitySpilashBinding binding;
    Timer waitTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Commen.setlang(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_spilash);

        waitTimer = new Timer();
        //Check is login

        waitTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                SpilashActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(SpilashActivity.this, SelectLangactivity.class));
                        finish();

                    }
                });
            }
        }, WAIT_TIME);
    }
}