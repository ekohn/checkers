package com.cse3345.f13.kohn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.GridLayout;

public class GameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		View v = new View(this);
		v.setMinimumHeight(100);
		v.setMinimumWidth(100);
		v.setBackgroundColor(android.R.color.black);
		GridLayout board = (GridLayout) getViewById(R.id.gameboard);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
