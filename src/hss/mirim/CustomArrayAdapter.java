package hss.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomArrayAdapter extends ArrayAdapter<String>{
	public CustomArrayAdapter(AlarmActivity mainActivity,int listRow, ArrayList<String> items){
		super(mainActivity, listRow, items);
	}
	public View getView(int position, View convertView, ViewGroup parent){
		View view=convertView;
		if(view==null){
			LayoutInflater inflater=((Activity)getContext()).getLayoutInflater();
			view=inflater.inflate(R.layout.list_shape,null);
		}
		TextView alarmName=(TextView)view.findViewById(R.id.alarmName);
		
		//alarmName.setText(getText());
		
		return view;
	}
}
