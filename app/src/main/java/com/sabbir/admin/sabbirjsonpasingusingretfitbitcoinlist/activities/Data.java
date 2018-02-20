package com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.R;
import com.sabbir.admin.sabbirjsonpasingusingretfitbitcoinlist.model.ProductDetails;

/**
 * Created by Admin on 2/19/2018.
 */

public class Data extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tv=findViewById(R.id.textview);
        ProductDetails myData = (ProductDetails) getIntent().getExtras().getSerializable("data");
        tv.setText(myData.toString());
    }
}
