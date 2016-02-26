package com.liudongdong.umengpush;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.umeng.message.PushAgent;
import com.umeng.message.UmengRegistrar;
import com.umeng.update.UmengUpdateAgent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		UmengUpdateAgent.setUpdateOnlyWifi(false);
		UmengUpdateAgent.update(this);
		PushAgent mPushAgent = PushAgent.getInstance(getApplicationContext());
		mPushAgent.enable();
		PushAgent.getInstance(getApplicationContext()).onAppStart();
		String device_token = UmengRegistrar.getRegistrationId(getApplicationContext());
		Log.i("MyLog", "token="+device_token);
	}

	
}
