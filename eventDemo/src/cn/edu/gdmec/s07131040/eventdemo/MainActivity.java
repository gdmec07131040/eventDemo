package cn.edu.gdmec.s07131040.eventdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTv;
	EditText myEt;
	CheckBox myCb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv = (TextView) findViewById(R.id.textView1);
        myEt = (EditText) findViewById(R.id.editText1);
        myCb = (CheckBox) findViewById(R.id.checkBox1);
        myEt.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				int metaState = event.getMetaState();
				int unicodeChar = event.getUnicodeChar();
				 String msg="";
			        msg +="按键动作:" + String.valueOf(event.getAction())+"\n";
			        msg +="按键代码:" + String.valueOf(keyCode)+"\n";
			        msg +="按键字符:" + (char)unicodeChar+"\n";
			        msg +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
			        msg +="重复次数:" + String.valueOf(event.getRepeatCount())+"\n";
			        msg +="功能键状态:" + String.valueOf(metaState)+"\n";
			        msg +="硬件编码:" + String.valueOf(event.getScanCode())+"\n";
			        msg +="按键标志:" + String.valueOf(event.getFlags())+"\n";
			      myTv.setText(msg);
			      if(myCb.isChecked()){
			      return true;
			      }else{  
				return false;
			      }
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
