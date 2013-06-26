package hss.mirim;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.e("alarm","알람 이라능ㅎㅎㅎㅎㅎㅎ");
		Intent newIntent = new Intent(context, AlarmViewActivity.class);
		newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | 
						  Intent.FLAG_ACTIVITY_CLEAR_TOP | 
						  Intent.FLAG_ACTIVITY_SINGLE_TOP);
		context.startActivity(newIntent);
	}
}
