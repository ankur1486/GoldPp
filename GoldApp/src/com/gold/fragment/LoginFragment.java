package com.gold.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gold.DashboardActivity;
import com.gold.ForgotPwdActivity;
import com.gold.R;
import com.gold.SignUpActivity;

/**
 * Login Fragment
 * 
 * @author Ankur.Goel
 * 
 */
public class LoginFragment extends Fragment implements OnClickListener {

	/**
	 * activity login context
	 */
	private Activity mLoginActivity;
	/**
	 * username edit text field 
	 */
	private EditText usernameEditText;
	/**
	 * password edit field 
	 */
	private EditText passwordEditText;

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mLoginActivity = activity;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.login_fragment, container, false);

		initLoginComponents(view);
		return view;
	}

	/**
	 * Initializing login view components
	 * 
	 * @param view
	 */
	private void initLoginComponents(View view) {
		usernameEditText = (EditText) view
				.findViewById(R.id.username_login_editText);
		passwordEditText = (EditText) view
				.findViewById(R.id.password_login_editText);

		Button loginButton = (Button) view.findViewById(R.id.login_button);
		loginButton.setOnClickListener(this);

		TextView forgotpwdTextview = (TextView) view
				.findViewById(R.id.forgot_textview);
		forgotpwdTextview.setOnClickListener(this);

		TextView signupTextview = (TextView) view
				.findViewById(R.id.signup_textview);
		signupTextview.setOnClickListener(this);

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onStop() {
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		super.onDetach();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.login_button:
			
			Intent dashboardIntent = new Intent(mLoginActivity,
					DashboardActivity.class);
			startActivity(dashboardIntent);

			break;
		case R.id.signup_textview:

			Intent signupIntent = new Intent(mLoginActivity,
					SignUpActivity.class);
			startActivity(signupIntent);

			break;
		case R.id.forgot_textview:

			Intent forgotIntent = new Intent(mLoginActivity,
					ForgotPwdActivity.class);
			startActivity(forgotIntent);

			break;

		default:
			break;
		}
	}

}
