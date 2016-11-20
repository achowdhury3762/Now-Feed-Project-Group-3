package nyc.c4q.ashiquechowdhury.nowfeed.workout;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/19/16.
 */
public class ProgressActivity extends AppCompatActivity {
    EditText weightTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_layout);

        weightTextView = (EditText) findViewById(R.id.weightedittext);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("WEIGHT", weightTextView.getText().toString());
        editor.apply();
    }
}