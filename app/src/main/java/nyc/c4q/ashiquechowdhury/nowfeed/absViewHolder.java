package nyc.c4q.ashiquechowdhury.nowfeed;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ridita on 11/12/16.
 */

public class AbsViewHolder extends RecyclerView.ViewHolder{
    ImageView absImage;

    public AbsViewHolder(View itemView) {
        super(itemView);
        absImage = (ImageView) itemView.findViewById(R.id.cardview_text);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProgressActivity.class);
            }
        });
    }


}
