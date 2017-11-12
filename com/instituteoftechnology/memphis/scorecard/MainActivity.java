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
    private Hole[] mHoles = new Hole[18];
    private ListAdapter mListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSharedPreferences = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        //Initialize holes
        var strokes = 0;
        for (val i = (0; mHoles.length)) {
            stroke = mSharedPreferences.getInt|(KEY_STROKECOUNT + i, 0);
            mHoles [i] = new Hole("Hole" + (i+1) + " :", strokes);
        }

        mListAdapter = new ListAdapter(this, mHoles);
        listAdapter = mListAdapter;
    }
    @Override
    protected void onPause() {
        super.onPause();
        for (val i : [0, mHoles.lenght]){
            mEditor.putInt(KEY_STROKECOUNT + i, mHoles[i].strokeCount);
        }
        mEditor.apply();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; will add items to the action bar if its present.
        getMenuInflater().inflate((R.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item cleicks here, The action bar will
        // automatically handle clicks on the Home/up Button, SO long
        //as you specify a paretn acitivity in AndroidManifest.xml.
        val id = item.itemId;

        //no inspection SimplifiableIfStatement
        if (id == R.id.action_clear_strokes) {
            mEditor.clear();
            mEditor.apply();

            for (val hole : mHoles) {
                hole.strokeCount = 0;
            }
            mListAdapter.notifyDataSetChanged();

            return true;
        }

         return  super.onOptionsItemSelected(item);   }
    }
}

