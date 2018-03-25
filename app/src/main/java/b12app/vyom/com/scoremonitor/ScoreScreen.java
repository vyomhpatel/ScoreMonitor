package b12app.vyom.com.scoremonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreScreen extends AppCompatActivity {

    TextView team1, team2;
    ImageButton btnPlus1, btnReduce1;
    ImageButton btnPlus2, btnReduce2;
    int count = 0;
    int count2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);

        btnPlus1 = findViewById(R.id.team1_plus);
        btnReduce1 = findViewById(R.id.team1_minus);
        team1 = findViewById(R.id.tvs);

        btnPlus2 = findViewById(R.id.team2_plus);
        btnReduce2 = findViewById(R.id.team2_minus);
        team2 = findViewById(R.id.tvScore);

    }

    public void reduce(View view) {

        switch (view.getId()){
            case R.id.team1_minus:
                count--;
                team1.setText(String.valueOf(count));
                break;
            case R.id.team2_minus:
                count2--;
                team2.setText(String.valueOf(count2));
                break;
        }
    }

    public void add(View view) {

        switch (view.getId()) {
            case R.id.team1_plus:
                count++;
                team1.setText(String.valueOf(count));
                break;
            case R.id.team2_plus:
                count2++;
                if(count2>0) {
                    team2.setText(String.valueOf(count2));

                }

                else{
                    team2.setText("0");
            }
                break;
        }
    }
}
