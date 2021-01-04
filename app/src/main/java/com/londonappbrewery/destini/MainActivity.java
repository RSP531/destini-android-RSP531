package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView dStory;
    private Button topButton;
    private Button bottomButton;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        dStory = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (mStoryIndex){
                    case 1:
                    case 2:
                        dStory.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        dStory.setText(R.string.T6_End);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        mStoryIndex = 6;
                        break;
                    default:
                }
            }
        });

        // Take another look at the story structure diagram. When the user clicks a button the text in story TextView
        // and the text on both buttons needs to change.

        // When the top button, displaying T1_Ans1 is clicked, the TextView needs to change to display T3_Story.
        // The top button then changes to display T3_Ans1 and the bottom button needs to display T3_Ans2.

        //When the user clicks the bottom button that displays T1_Ans2, your TextView needs to update to display T2_Story.
        // The top button should display T2_Ans1 and the bottom button should display T2_Ans2.

        // Hint: When testing out the app you can rotate your device to reset the adventure to the beginning and try a different path.
        // Here’s a brief summary of where the different strings need to be displayed

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (mStoryIndex){
                    case 1:
                        dStory.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        bottomButton.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        dStory.setText(R.string.T4_End);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        mStoryIndex = 4;
                        break;
                    case 3:
                        dStory.setText(R.string.T5_End);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        mStoryIndex = 5;
                        break;
                    default:
                }
            }
        });

    }
}
