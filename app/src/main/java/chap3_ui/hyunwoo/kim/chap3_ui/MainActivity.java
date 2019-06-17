package chap3_ui.hyunwoo.kim.chap3_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 액티비티 생성될 때 자동 호출
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        Button button = new Button(this);
        button.setText("Button 1");
        mainLayout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click Click", Toast.LENGTH_SHORT).show();
            }
        });

        // 화면 인플레이션
        setContentView(mainLayout);
//        setContentView(R.layout.activity_main);
    }
}
