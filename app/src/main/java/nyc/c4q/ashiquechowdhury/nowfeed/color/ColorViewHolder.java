package nyc.c4q.ashiquechowdhury.nowfeed.color;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ashiquechowdhury on 11/18/16.
 */
public class ColorViewHolder extends RecyclerView.ViewHolder {
    public ColorViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(Integer integer) {
        itemView.setBackgroundColor(integer);
    }
}
