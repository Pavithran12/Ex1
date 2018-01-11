package com.pavi.helloworld;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	 Button btn;
     EditText t1;
     TextView tv1,tv2,tv3,tv4;
     Typeface tf1,tf2,tf3;
     String clr,clr1,clr2;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tf1=Typeface.createFromAsset(getAssets(),"f1.ttf");
        tf2=Typeface.createFromAsset(getAssets(),"f2.otf");
        tf3=Typeface.createFromAsset(getAssets(),"f3.ttf");
        btn=(Button)findViewById(R.id.button1);
        t1=(EditText)findViewById(R.id.editText1);
        tv2=(TextView)findViewById(R.id.textView1);
        tv3=(TextView)findViewById(R.id.textView2);
        tv4=(TextView)findViewById(R.id.textView3);
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv2.setTypeface(tf1);
				clr="#4286f4";
				clr1="#ed473b";
				clr2="#3bed7f";
				tv2.setTextColor(Color.parseColor(clr));
				tv2.setTextSize(TypedValue.COMPLEX_UNIT_DIP,26);
				tv2.setText("Hello "+t1.getText());
				tv3.setTypeface(tf2);
				tv3.setTextColor(Color.parseColor(clr1));
				tv3.setTextSize(TypedValue.COMPLEX_UNIT_DIP,26);
				tv3.setText("Hello "+t1.getText());
				tv4.setTypeface(tf3);
				tv4.setTextColor(Color.parseColor(clr2));
				tv4.setTextSize(TypedValue.COMPLEX_UNIT_DIP,26);
				tv4.setText("Hello "+t1.getText());
				
			}
		});
    }
}
