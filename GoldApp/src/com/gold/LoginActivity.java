package com.gold;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Login Activity 
 * @author Ankur.Goel
 *
 */
public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_login);
        
//        Fragment loginFragment = new LoginFragment();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.login_fragment, loginFragment);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.commit();
    }

}
