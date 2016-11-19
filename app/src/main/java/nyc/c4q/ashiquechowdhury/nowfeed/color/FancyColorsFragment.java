package nyc.c4q.ashiquechowdhury.nowfeed.color;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/18/16.
 */
public class FancyColorsFragment extends Fragment{
    RecyclerView mColorRecycler;
    List<Integer> myColorIntegerList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fancycolor, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mColorRecycler = (RecyclerView) getActivity().findViewById(R.id.color_rview);
        mColorRecycler.setLayoutManager(new GridLayoutManager(getActivity(), 1, GridLayoutManager.HORIZONTAL, false));
        fillColorList();
        mColorRecycler.setAdapter(new ColorAdapter(myColorIntegerList));
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
