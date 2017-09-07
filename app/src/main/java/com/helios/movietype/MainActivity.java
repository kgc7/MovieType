package com.helios.movietype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb_h,rb_c,rb_t,rb_s,rb_r;
    Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    RadioButton rb_h = (RadioButton) findViewById(R.id.rb_h);
    RadioButton rb_c = (RadioButton) findViewById(R.id.rb_c);
    RadioButton rb_t = (RadioButton) findViewById(R.id.rb_t);
    RadioButton rb_s = (RadioButton) findViewById(R.id.rb_s);
    RadioButton rb_r = (RadioButton) findViewById(R.id.rb_r);
    Button select = (Button) findViewById(R.id.select);

    public void select(View view){

}


}
