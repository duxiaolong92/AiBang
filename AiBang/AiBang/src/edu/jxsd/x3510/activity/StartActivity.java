package edu.jxsd.x3510.activity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class StartActivity extends Activity {
     private TextView start;
     private TextView ibang;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		start = (TextView) findViewById(R.id.activity_start_tv_start);
		ibang = (TextView)findViewById(R.id.activity_start_tv_Ibang);
		Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/HelveticaNeueLTPro-ThEx.otf");
		start.setTypeface(typeface); 
		ibang.setTypeface(typeface);
		
		Animation animation = AnimationUtils.loadAnimation(StartActivity.this, R.anim.alpha);
		start.startAnimation(animation);
		
		
		
		new Handler().postDelayed(new Runnable(){
 
			@Override
			public void run() {
				// TODO Auto-generated method stub
			

				Intent intent = new Intent (StartActivity.this,LoginActivity.class);			

				startActivity(intent);		
				overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
				StartActivity.this.finish();
			}
			
		}, 3000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
