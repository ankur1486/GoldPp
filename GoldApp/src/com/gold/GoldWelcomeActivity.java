package com.gold;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

import com.gold.R.id;

/**
 * WELCOME ACTIVITY 
 * @author Ankur.Goel
 *
 */
public class GoldWelcomeActivity extends ActionBarActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_welcome);
        
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(id.welcome_main_layout);
        relativeLayout.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.welcome_main_layout :
			startLogin();
			break;

		default:
			break;
		}
	}

	/**
	 * start login page
	 */
	private void startLogin() {
		Intent intent = new Intent(GoldWelcomeActivity.this , LoginActivity.class);
		startActivity(intent);
		finish();
	}
}
