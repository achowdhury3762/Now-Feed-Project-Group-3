package nyc.c4q.ashiquechowdhury.nowfeed.color;

import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/19/16.
 */
public class GeneralColorCardViewHolder extends RecyclerView.ViewHolder {
    RecyclerView mColorRecycler;
    List<Integer> myColorIntegerList;

    public GeneralColorCardViewHolder(View itemView) {
        super(itemView);
        mColorRecycler = (RecyclerView) itemView.findViewById(R.id.cardview_rv);
        mColorRecycler = (RecyclerView) itemView.findViewById(R.id.color_rview);
        mColorRecycler.setLayoutManager(new GridLayoutManager(itemView.getContext(), 1, GridLayoutManager.HORIZONTAL, false));
        fillColorList();
        mColorRecycler.setAdapter(new ColorAdapter(myColorIntegerList));
    }

    public void bind() {
    }

    private void fillColorList() {
        myColorIntegerList = new ArrayList<>();
        for (int i = 0; i <= 255; i+=20) {
            for (int j = 0; j <= 255; j+=20) {
                for (int k = 0; k <= 255; k+=20) {
                    int colorInt = Color.rgb(i,j,k);
                    myColorIntegerList.add(colorInt);
                }
            }
        }
    }
}
