package com.yongli.myfirstapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.yongli.myfirstapp.view.fragment.ConnectedFragment;
import com.yongli.myfirstapp.view.fragment.MeFragment;
import com.yongli.myfirstapp.view.fragment.ScanFragment;

public class MainActivity extends FragmentActivity {

    public static final String TAG = "MainActivity";

    private Fragment[] fragments;
    private ScanFragment mScanFragment;
    private ConnectedFragment mConnectedFragment;
    private MeFragment mMeFragment;

    private TextView scandvLabel;// 扫描出的设备textview
    private TextView connectedLable;// 已连接的设备textview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mScanFragment = new ScanFragment();
        mConnectedFragment = new ConnectedFragment();
        mMeFragment = new MeFragment();

        scandvLabel = (TextView) findViewById(R.id.scan_dv_number);
        connectedLable = (TextView) findViewById(R.id.connected_number);
    }
}
