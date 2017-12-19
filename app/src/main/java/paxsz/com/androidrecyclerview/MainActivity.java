package paxsz.com.androidrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana);
            fruitList.add(banana);
            Fruit mango = new Fruit("Mango", R.drawable.mango);
            fruitList.add(mango);
            Fruit lemon = new Fruit("Lemon", R.drawable.lemon);
            fruitList.add(lemon);
            Fruit grape = new Fruit("Grape", R.drawable.grape);
            fruitList.add(grape);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry);
            fruitList.add(cherry);
            Fruit peach = new Fruit("Peach", R.drawable.peach);
            fruitList.add(peach);
        }
    }
}
