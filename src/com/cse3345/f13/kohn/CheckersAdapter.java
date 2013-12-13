package com.cse3345.f13.kohn;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CheckersAdapter extends BaseAdapter
{
    private Context mContext;
    private GridView board;

    public CheckersAdapter (Context pContext, GridView grid)
    {
        this.mContext = pContext;
        board = grid;
        
        
    }

    @Override
    public int getCount()
        {
            return 64;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView lImageView;
        if (convertView == null) {  
            lImageView = new ImageView(mContext);
            int size = parent.getWidth()/8;
            lImageView.setLayoutParams(new GridView.LayoutParams(size,size));

	        //background black or white depending of the position
	        int col = position / 8 % 2;
	        if (col == 0) {
	            if (position%2 == 0) {
	                lImageView.setBackgroundColor(Color.WHITE);
	            }
	            else {
	                lImageView.setBackgroundColor(Color.BLACK);
	                if (position < 24)
	                	lImageView.setImageResource(R.drawable.red_piece);
	                else if (position > 40)
	                	lImageView.setImageResource(R.drawable.black_piece);
	            }
	        }
	        else {
	            if (position%2 == 0) {
	                lImageView.setBackgroundColor(Color.BLACK);
	                if (position < 24)
	                	lImageView.setImageResource(R.drawable.red_piece);
	                else if (position > 40)
	                	lImageView.setImageResource(R.drawable.black_piece);
	            }
	            else {
	                lImageView.setBackgroundColor(Color.WHITE);
	            }
	        }
		        
	        convertView = lImageView;
	
        }
        return convertView;
    
   }

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}