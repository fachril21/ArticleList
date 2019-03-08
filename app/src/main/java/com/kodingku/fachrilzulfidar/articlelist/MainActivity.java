package com.kodingku.fachrilzulfidar.articlelist;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kodingku.fachrilzulfidar.articlelist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Article> articles;
    private RecyclerView recyclerView;
    private ArticleAdapter articleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);

        addData();

        articleAdapter = new ArticleAdapter(articles, this);
        binding.recyclerView.setAdapter(articleAdapter);


    }

    void addData(){
        articles = new ArrayList<>();
        articles.add(new Article("OOP Java","Fachril"));
        articles.add(new Article("Recycler View","Rahmat"));
        articles.add(new Article("Rest API","Harun"));
        articles.add(new Article("Circle Image","Faiz Fanani"));
        articles.add(new Article("Bottom Sheet","Renal"));
        articles.add(new Article("Lifecycle Activity Diagram","Farhan"));
        articles.add(new Article("OOP Java","Fachril"));
        articles.add(new Article("Recycler View","Rahmat"));
        articles.add(new Article("Rest API","Harun"));
        articles.add(new Article("Circle Image","Faiz Fanani"));
        articles.add(new Article("Bottom Sheet","Renal"));
        articles.add(new Article("Lifecycle Activity Diagram","Farhan"));
    }
}
