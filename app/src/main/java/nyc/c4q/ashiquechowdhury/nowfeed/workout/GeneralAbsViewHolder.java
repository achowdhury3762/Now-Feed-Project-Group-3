package nyc.c4q.ashiquechowdhury.nowfeed.workout;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ashiquechowdhury on 11/19/16.
 */
public class GeneralAbsViewHolder extends RecyclerView.ViewHolder {
    public GeneralAbsViewHolder(View childView) {
        super(childView);
    }

    public void bind() {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProgressActivity.class);
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
