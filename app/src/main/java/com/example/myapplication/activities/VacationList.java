package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VacationList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacation_list);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VacationList.this, VacationDetails.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_vacation_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }

        /*if (item.getItemId() == R.id.addSampleProducts) {
            Repository repo = new Repository(getApplication());
            Product product = new Product(1, "bicycle", 100.0);
            repo.insert(product);
            product = new Product(2, "tricycle", 150.0);
            repo.insert(product);
            List<Product> allProducts = repository.getAllProducts();
            RecyclerView recyclerView = findViewById(R.id.recyclerview);
            final ProductAdapter productAdapter = new ProductAdapter(this);
            recyclerView.setAdapter(productAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            productAdapter.setProducts(allProducts);

            return true;
        }*/
        //return super.onOptionsItemSelected(item);
        return true;
    }

}