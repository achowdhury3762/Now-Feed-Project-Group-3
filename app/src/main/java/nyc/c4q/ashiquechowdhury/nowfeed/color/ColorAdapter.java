package nyc.c4q.ashiquechowdhury.nowfeed.color;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/18/16.
 */
public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {
    List<Integer> myColorIntegerList;

    public ColorAdapter(List<Integer> myColorIntegerList) {
        this.myColorIntegerList = myColorIntegerList;
    }

    @Override
    public ColorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View childView = inflater.inflate(R.layout.color_view_holder,parent,false);
        return new ColorViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ColorViewHolder holder, int position) {
        holder.bind(myColorIntegerList.get(position));
    }

    @Override
    public int getItemCount() {
        return myColorIntegerList.size();
    }
}
