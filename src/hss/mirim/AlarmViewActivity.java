package hss.mirim;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class AlarmViewActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alarm_view);
		
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON | 
							 WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD | 
							 WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
							 WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
	}
}
