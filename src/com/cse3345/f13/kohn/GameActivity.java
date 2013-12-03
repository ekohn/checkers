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
		View v;
		GridLayout board = (GridLayout) findViewById(R.id.gameboard);
		for (int i = 0; i < 64; i++) {
			v = new View(this);
			v.setMinimumHeight(100);
			v.setMinimumWidth(100);
			if (i % 2 == 0)
				v.setBackgroundColor(0x000000);
			else
				v.setBackgroundColor(0xFFFFFF);
			board.addView(v);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
