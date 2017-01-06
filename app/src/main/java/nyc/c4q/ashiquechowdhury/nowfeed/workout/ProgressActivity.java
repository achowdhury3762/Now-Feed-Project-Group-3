package nyc.c4q.ashiquechowdhury.nowfeed.workout;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import nyc.c4q.ashiquechowdhury.nowfeed.R;

/**
 * Created by ashiquechowdhury on 11/19/16.
 */
public class ProgressActivity extends AppCompatActivity {
    EditText weightTextView;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_layout);
        weightTextView = (EditText) findViewById(R.id.weightedittext);
        prefs = getPreferences(Context.MODE_PRIVATE);
    }

    public void onClickSubmit(View view){
        Toast.makeText(this, "Saved Weight!", Toast.LENGTH_LONG).show();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("WEIGHT", weightTextView.getText().toString());
        editor.apply();
    }
}