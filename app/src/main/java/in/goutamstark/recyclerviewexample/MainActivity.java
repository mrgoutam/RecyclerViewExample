package in.goutamstark.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    //Adapter is basically the bridge between our RecyclerView and our data. I will return as many item as we need.
    private RecyclerView.Adapter mAdaper;

    //Layout manager is responsible for aligning the single view in our list.
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_child, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_extension, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_child, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_extension, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_child, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_extension, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_child, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_extension, "Line 5", "Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_child, "Line 3", "Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_extension, "Line 5", "Line 6"));

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdaper = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdaper);
    }
}
