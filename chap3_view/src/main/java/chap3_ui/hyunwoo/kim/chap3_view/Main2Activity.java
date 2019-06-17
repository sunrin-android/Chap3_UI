package chap3_ui.hyunwoo.kim.chap3_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView target_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); // 메모리 인플레이션

        // 텍스트 뷰 찾아오기
        target_text = findViewById(R.id.target_text);
    }

    public void onBtn1Clicked(View v) {
        // 텍스트 뷰 표시
        target_text.setVisibility(View.VISIBLE);
    }

    public void onBtn2Clicked(View v) {
        // 텍스트 뷰 숨기기
        target_text.setVisibility(View.INVISIBLE);
    }
}
