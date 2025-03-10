package com.garciatomas.nicestart;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainBab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bab);

//        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
//
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View v = inflater.inflate(R.layout.custom_action_bar, null);
//
//        TextView titleTextView = (TextView) v.findViewById(R.id.custom_action_bar_title);
//        titleTextView.setText(this.getTitle());
//        titleTextView.setTypeface(App.getInstance().getActionBarTypeFace());
//
//        this.getSupportActionBar().setCustomView(v);

        // cast al xml
        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar);
        FloatingActionButton myfab = findViewById(R.id.fab);

        //click event en el  FAB
        myfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainBab.this, R.string.fab_clicked, Toast.LENGTH_SHORT).show();
            }
        });

        //click event en el Hamburguer menu
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainBab.this, R.string.menu_clicked, Toast.LENGTH_SHORT).show();
//                sheetBehavior = BottomSheetBehavior.from(sheet);
            }


        });

        //click event en el Bottom bar menu item
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (R.id.heart == item.getItemId()) {
                    Toast.makeText(MainBab.this, R.string.added_to_favourites, Toast.LENGTH_SHORT).show();
                }
                if (R.id.search == item.getItemId()) {
                    Toast.makeText(MainBab.this, R.string.beginning_search, Toast.LENGTH_SHORT).show();
                }

//                switch (item.getItemId()) {
//                    case R.id.heart:
//                        Toast.makeText(MainBab.this, "Added to favourites", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.search:
//                        Toast.makeText(MainBab.this, "Beginning search", Toast.LENGTH_SHORT).show();
//                        break;
//                }
                return false;
            }
        });


    }
}