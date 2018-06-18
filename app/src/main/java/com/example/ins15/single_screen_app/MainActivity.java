package com.example.ins15.single_screen_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address=findViewById(R.id.add);
        String htmlString = "<u>Cake Studio, 8, Greenwoods, Vadodara, India</u>";
        address.setText(Html.fromHtml(htmlString));

    }

    public void openmap(View view)
    {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=22.354298, 73.174318(Cake Studio)"));
        startActivity(intent);

    }

}
