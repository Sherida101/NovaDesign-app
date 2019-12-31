package com.example.thomas.bottomdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.thomas.bottomdrawer.component.DrawingView;
import com.example.thomas.bottomdrawer.fragment.AlbumViewPage;
import com.example.thomas.bottomdrawer.fragment.FlowtextFragment;
import com.example.thomas.bottomdrawer.fragment.GridFragment;
import com.example.thomas.bottomdrawer.fragment.CanvasFragment;
import com.example.thomas.bottomdrawer.fragment.HomeFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Home");
        loadFragment(new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    toolbar.setTitle("Home");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_flowtext:
                    toolbar.setTitle("Flow text");
                    fragment = new FlowtextFragment();
                    loadFragment(fragment);
                    break;
                case R.id.navigation_canvas:
                    toolbar.setTitle("Canvas");
//                    fragment = new CanvasFragment();
//                    loadFragment(fragment);
//                    return true;
                    setContentView(R.layout.activity_canvas);
                    break;
                case R.id.navigation_grid:
                    toolbar.setTitle("Grid");
                    GridFragment gridView = new GridFragment(MainActivity.this);
                    gridView.setNumColumns(5);
                    gridView.setNumRows(5);
                    setContentView(gridView);
                    break;
                case R.id.navigation_books:
                    toolbar.setTitle("Books");
//                    fragment = new BooksFragment();
//                    loadFragment(fragment);
//                    return true;
                    Intent booksTab = new Intent(MainActivity.this, AlbumViewPage.class);
                    startActivity(booksTab);

                    break;
            }

            return false;
        }
    };

    /**
     * loading fragment into FrameLayout
     *
     * @param fragment
     */
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
