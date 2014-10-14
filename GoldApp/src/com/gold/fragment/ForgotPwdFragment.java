package com.gold.fragment;

import com.gold.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/*
 * Forgot password fragment 
 */
public class ForgotPwdFragment extends Fragment implements OnClickListener {

	/**
	 * email edit filed 
	 */
	private EditText emailEditText;
	/**
	 * forgot activity context  
	 */
	private Activity mforgotActivity;

	@Override
	public void onAttach(Activity activity) {
		mforgotActivity = activity;
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.forgotpwd_fragment,
				container, false);
		
		initForgotScreenComponents(view);
		return view;
	}
	
	/**
	 * init forgot screen componenets
	 * @param view
	 */
	private void initForgotScreenComponents(View view) {
		emailEditText = (EditText)view.findViewById(R.id.forgot_editText);
		
		Button submitButton = (Button)view.findViewById(R.id.forgot_button);
		submitButton.setOnClickListener(this);
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
		case R.id.forgot_button:
			
			break;

		default:
			break;
		}
	}
}
