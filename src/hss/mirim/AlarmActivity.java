package hss.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;

public class AlarmActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ArrayList<String>alarms=new ArrayList<String>();
        alarms.add("첫번째 알람"); alarms.add("두번째 알람");
        
        ListView alarmList=(ListView)findViewById(R.id.alarmList);
        CustomArrayAdapter alarmArray=new CustomArrayAdapter(this, android.R.layout.simple_list_item_1, alarms);
        alarmList.setAdapter(alarmArray);
        
        alarmList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int position,
					long arg3) {
				Log.d("test",alarms.get(position));
			}
		});
        
        Button btnPlus=(Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(AlarmActivity.this, AlarmSet.class);
				startActivity(intent);
			}
		});
    }//onCreate
}