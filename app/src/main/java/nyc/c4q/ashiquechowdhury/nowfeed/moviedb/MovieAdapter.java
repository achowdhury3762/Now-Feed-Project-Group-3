package nyc.c4q.ashiquechowdhury.nowfeed.moviedb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/13/16.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieYearViewHolder> {
    List<MovieDescriptions> myMovieList;

    public MovieAdapter(List<MovieDescriptions> myMovieList){
        this.myMovieList = myMovieList;
    }

    @Override
    public MovieYearViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View childview = inflater.inflate(R.layout.movie_row, parent, false);
        return new MovieYearViewHolder(childview);
    }

    @Override
    public void onBindViewHolder(MovieYearViewHolder holder, int position) {
        holder.bind(myMovieList.get(position));
    }

    @Override
    public int getItemCount() {
        return myMovieList.size();
    }
}
