package com.instituteoftechnology.memphis.scorecard;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;

import static android.content.Context.MODE_PRIVATE;

public class MainActivity extends ListActivity {
    private static final String PREFS_FILE ="com.instituteoftechnology.memphis.scorecard.preferences" ;
    private SharedPreferences  mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private Hole[] m Holes = new Hole[18];
    private ListAdapter mListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSharedPreferences = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);

        //Initialize holes
        int strokes = 0;
        for (int i = 0; i < mHoles.length); i++) {
            mHoles [i] = new Hole("Hole" + (i+1) + " :", strokes);
        }
    }
}
