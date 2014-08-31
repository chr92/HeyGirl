package net.chendriksen.pickuplinepro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class PickupLinePro extends Activity {

    private LineBook mLineBook = new LineBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup_line_pro);


        // Declare our View variables and assign the Views from the layout file
        final TextView lineLabel = (TextView) findViewById(R.id.lineTextView);
        final Button showLineButton = (Button) findViewById(R.id.showLineButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.background);

        String line = mLineBook.getLine();
        // Update the label with our dynamic fact
        lineLabel.setText(line);
        int color = mColorWheel.getColor();
        relativeLayout.setBackgroundColor(color);
        showLineButton.setTextColor(color);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String line = mLineBook.getLine();
                // Update the label with our dynamic fact
                lineLabel.setText(line);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showLineButton.setTextColor(color);

            }
        };

        showLineButton.setOnClickListener(listener);

    }




}

