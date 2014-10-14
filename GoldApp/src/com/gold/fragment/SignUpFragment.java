package com.gold.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.gold.R;

/**
 * signup fragment
 * @author Ankur.Goel
 *
 */
public class SignUpFragment extends Fragment implements OnClickListener {
	/**
	 * create username edit field  
	 */
	private EditText usernameEditText;
	/**
	 *  setting password edit field 
	 */
	private EditText passwordEditText;
	/**
	 * Confirming password edit field
	 */
	private EditText passwordConfirmEditText;
	/**
	 * activity context 
	 */
	private Activity mSignUpActivity;

	@Override
	public void onAttach(Activity activity) {
		mSignUpActivity = activity;
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.signup_fragment,
				container, false);
		
		initSignUpComponenets(view);
		return view;
	}
	
	/**
	 *  init sign up componenets
	 * @param view 
	 */
	private void initSignUpComponenets(View view) {
		
		usernameEditText = (EditText) view
				.findViewById(R.id.username_editText);
		passwordEditText = (EditText) view
				.findViewById(R.id.password_editText);
		passwordConfirmEditText = (EditText) view
				.findViewById(R.id.confirm_password_editText);

		Button registerButton = (Button) view.findViewById(R.id.register_button);
		registerButton.setOnClickListener(this);
		
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
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
		case R.id.register_button:
			
			break;

		default:
			break;
		}
	}
}
