package com.wulee.selectabletexthelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wulee.selectabletext.SelectableTextView;

public class MainActivity extends AppCompatActivity {

    private SelectableTextView mTvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvTest = (SelectableTextView) findViewById(R.id.tv_test);


    }
}
