package com.cse3345.f13.kohn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;

public class GameActivity extends Activity {
	GridView gameBoard;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		gameBoard = (GridView) findViewById(R.id.gameboard);
		CheckersAdapter adapter = new CheckersAdapter(this, gameBoard);
        
        gameBoard.setAdapter(adapter);
		
//		for (int i = 1; i < 65; i++) {
//			ImageView curr = new ImageView(this);
//			if (i % 2 == 0)
//				curr.setBackgroundColor(Color.BLACK);
//			else
//				curr.setBackgroundColor(Color.WHITE);
//			gameBoard.addView(curr);
//		}
		
		startGame();
	}

	
	private void startGame() {
		
	}

}
