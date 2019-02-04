package cejv669.concordia.com.practice_callthesubactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.btn1);
        Button bt2 = findViewById(R.id.btn2);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivityForResult(i,1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivityForResult(i, 2);
            }
        });
            }
            @Override
            protected void onActivityResult(int requestCode, int resultCode, Intent data){
                if(requestCode==1 && resultCode == RESULT_OK){
                    TextView tv = findViewById(R.id.tv1);
                    String myString = data.getStringExtra("return text");
                    tv.setText(myString);
                }
                if(requestCode==2 && resultCode == RESULT_OK){
                    TextView tv = findViewById(R.id.tv2);
                    String myString = data.getStringExtra("return text");
                    tv.setText(myString);
                }
            }

}
