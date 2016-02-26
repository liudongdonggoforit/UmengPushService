package com.liudongdong.umengpush;

import android.app.Activity;
import android.os.Bundle;

import com.umeng.update.UmengUpdateAgent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		UmengUpdateAgent.setUpdateOnlyWifi(false);
		UmengUpdateAgent.update(this);
	}

	
}
