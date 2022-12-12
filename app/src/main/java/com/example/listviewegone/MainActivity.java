package com.example.listviewegone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] gamesList = {"Realm Defense","PUBG","FreeFire","Need For Speed","PUBG Lite","GTA Vice"+
                         "Call Of Duty","Ludo Star","FIFA","Real Cricket","WCC 2","WWE","Taken 3" +
                         "Taken 5","Clash of clans","LifeAfter","Angry Birds","Candy Crush","8 Ball Pool"+
                         "Word Pizza","CATS","Air Force"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        listView = findViewById (R.id.gamesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<> (this,android.R.layout.simple_list_item_1,gamesList);
        listView.setAdapter (adapter);
    }
}