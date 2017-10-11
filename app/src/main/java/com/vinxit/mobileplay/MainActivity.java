package com.vinxit.mobileplay;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @BindView(R.id.drawerlayout)
    DrawerLayout drawelayout;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.navigation_view)
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.inflateMenu(R.menu.menu_main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawelayout,toolbar,R.string.navigation1,R.string.navigation2);
        drawelayout.addDrawerListener(toggle);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.appUpdate){

        }else if (id == R.id.download){

        }else if (id == R.id.setting){

        }
        drawelayout.closeDrawer(GravityCompat.START);
        //true  item选中状态  false item未选中状态
        return true;
    }
}
