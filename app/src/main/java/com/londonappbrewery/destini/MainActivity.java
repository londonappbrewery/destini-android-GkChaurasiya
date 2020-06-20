package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mButtonTop, mButtonBottom;
    TextView mStoryTextView;
    int mStoryIndex = 1;
    int mButtonIndex;
    int mStoryNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mButtonIndex = 0;
                mStoryNumber = updateStory();
                mStoryIndex = mStoryNumber;


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mButtonIndex = 1;
                mStoryNumber = updateStory();
                mStoryIndex = mStoryNumber;


            }
        });

    }

    public int updateStory()
    {
        if (mStoryIndex == 1 && mButtonIndex == 0)// T1_answer
        {
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
            return 3;//returning story 3
        } else if (mStoryIndex == 1 && mButtonIndex == 1) {
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
            return 2;
        }
        if (mStoryIndex == 3) {
            if (mButtonIndex == 0) {
                mStoryTextView.setText(R.string.T6_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            } else if (mButtonIndex == 1) {
                mStoryTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
        } else if (mStoryIndex == 2) {
            if (mButtonIndex == 0) {
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
                return 3;

            } else if (mButtonIndex == 1) {
                mStoryTextView.setText(R.string.T4_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBottom.setVisibility(View.GONE);
            }
        }
        return 0;
    }

}
