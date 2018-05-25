/*=====================================================================
□ Infomation
  ○ Data : 21.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○

□ Study
  ○ Intent
     - An Intent provides a facility for performing late runtime binding between the code in different applications.
       Its most significant use is in the launching of activities, where it can be thought of as the glue between activities.
       It is basically a passive data structure holding an abstract description of an action to be performed.s
=====================================================================*/
package com.eun1310434.callintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(data));
                //Intent.ACTION_CALL <- 바로 전화걸기
                startActivity(intent);
            }
        });
    }
}
