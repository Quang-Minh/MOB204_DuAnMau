package com.example.mob204_duanmau.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mob204_duanmau.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.Qlsach:
                startActivity(new Intent(Home.this, BookManeger.class));
                break;
            case R.id.QlNguoiDung:
                startActivity(new Intent(Home.this,ManagerUser.class));
                break;
            case R.id.QlHoaDon:
                startActivity(new Intent(Home.this,ManagerBill.class));
                break;
            case R.id.QlTheLoai:
                break;
            case R.id.QlSoLuongSach:
                startActivity(new Intent(Home.this,ManagerNumberBook.class));
                break;
            case R.id.DangXuat:
                System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }

}