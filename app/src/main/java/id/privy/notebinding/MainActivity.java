package id.privy.notebinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.privy.notebinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    List<Book> books;
    BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setUpData();
        adapter = new BookAdapter(getApplicationContext(), books);
        RecyclerView.LayoutManager layoutManager    = new LinearLayoutManager(this);
        binding.bookList.setLayoutManager(layoutManager);
        binding.bookList.setAdapter(adapter);

    }

    private void setUpData() {
        books   = new ArrayList<>();
        books.add(new Book("Senja Di Puncak Kehidupan","Raka Adi Nugroho"));
        books.add(new Book("Kotlin for Android Developer","Raka Adi Nugroho"));
        books.add(new Book("Rockstar React Native","Raka Adi Nugroho"));
    }
}
