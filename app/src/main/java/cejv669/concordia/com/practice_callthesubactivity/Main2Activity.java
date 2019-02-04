package cejv669.concordia.com.practice_callthesubactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b1 = findViewById(R.id.btn_return);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = findViewById(R.id.textToReturn);
                String textToReturn = e.getText().toString();
                Intent data = new Intent();
                data.putExtra("return text", textToReturn);
             setResult(RESULT_OK,data);
             Main2Activity.this.finish();
            }
        });
    }
}
