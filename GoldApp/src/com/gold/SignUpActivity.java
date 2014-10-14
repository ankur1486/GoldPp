package com.gold;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Signup activity
 * @author Ankur.Goel
 *
 */
public class SignUpActivity extends ActionBarActivity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_signup);
        
//        Fragment signupFragment = new SignUpFragment();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.signup_fragment, signupFragment);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.commit();
    }

}
