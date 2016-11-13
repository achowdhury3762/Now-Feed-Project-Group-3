package nyc.c4q.ashiquechowdhury.nowfeed;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by ridita on 11/12/16.
 */
public class ProgressActivity extends AppCompatActivity {
    EditText weightTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_layout);

        super.onCreate(savedInstanceState);

        weightTextView = (EditText) findViewById(R.id.weightedittext);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("WEIGHT", weightTextView.getText().toString());
        editor.apply();
        }
    }
}