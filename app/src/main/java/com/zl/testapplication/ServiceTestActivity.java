package com.zl.testapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ServiceTestActivity extends AppCompatActivity {

    @BindView(R.id.button_start)
    Button buttonStart;
    @BindView(R.id.button_stop)
    Button buttonStop;
    @BindView(R.id.image_life)
    ImageView imageLife;
    @BindView(R.id.button_bind)
    Button buttonBind;
    @BindView(R.id.button_unbind)
    Button buttonUnbind;
    @BindView(R.id.image_bind_life)
    ImageView imageBindLife;
    @BindView(R.id.tv_info)
    TextView tvInfo;
    private boolean startServiceClicked = false;
    private boolean bindServiceClicked = false;

    private MyService.DownloadBinder mDownloadBinder;
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d("mTag", "ServiceConnection(MyService)：onServiceConnected()");
            mDownloadBinder = (MyService.DownloadBinder) service;
            mDownloadBinder.startDownload();
            mDownloadBinder.getProgress();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("mTag", "ServiceConnection(MyService)：onServiceDisconnected()");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_service_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button_start, R.id.button_stop, R.id.button_bind, R.id.button_unbind})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_start:
                startService(new Intent(ServiceTestActivity.this, MyService.class));
                imageLife.setVisibility(View.VISIBLE);
                imageLife.setImageResource(R.drawable.service_life);

                startServiceClicked = true;
                if (startServiceClicked && bindServiceClicked) {
                    tvInfo.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.button_stop:
                stopService(new Intent(ServiceTestActivity.this, MyService.class));
                break;
            case R.id.button_bind:
                bindService(
                        new Intent(ServiceTestActivity.this, MyService.class),
                        mServiceConnection,
                        BIND_AUTO_CREATE);

                imageBindLife.setVisibility(View.VISIBLE);
                imageLife.setImageResource(R.drawable.bind_service);

                bindServiceClicked = true;
                if (startServiceClicked && bindServiceClicked) {
                    tvInfo.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.button_unbind:
                unbindService(mServiceConnection);
                break;
        }
    }
}
