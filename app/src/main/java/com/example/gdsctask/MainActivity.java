package com.example.gdsctask;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String States[]
            = { "Andhra Pradesh", "Arunachal Pradesh","Bihar",
            "Chhattisgarh", "Goa",
            "Gujarat", "Haryana",
            "Himachal Pradesh","Jharkhand","Karnataka","Kerala"
            ,"Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha",
            "Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttarakhand"
            ,"Uttar Pradesh","West Bengal"};
    int images [] = {R.drawable.andhra,R.drawable.arunachal,R.drawable.bihar,R.drawable.chhatisgarh,R.drawable.goa,R.drawable.modi,R.drawable.haryana,
            R.drawable.himachal,R.drawable.jharkhand,R.drawable.karnataka,R.drawable.kerala,
            R.drawable.madhya,R.drawable.maharashtra,R.drawable.manipur,R.drawable.meghalaya,R.drawable.mizoram,R.drawable.nagaland,
            R.drawable.samanta,R.drawable.punjab,R.drawable.hawamahal,R.drawable.sikkim,R.drawable.tamilnadu,R.drawable.telangana,
            R.drawable.tripura,R.drawable.utarakhand,R.drawable.yogi,R.drawable.bengal};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.list);
      CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),States,images);
      l.setAdapter(customBaseAdapter);
    }
}
