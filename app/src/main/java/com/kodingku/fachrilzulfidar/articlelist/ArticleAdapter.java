package com.kodingku.fachrilzulfidar.articlelist;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kodingku.fachrilzulfidar.articlelist.databinding.ListItemBinding;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.BindingHolder> {

    private ArrayList<Article> articles;
    private Context context;

    public ArticleAdapter(ArrayList<Article> articles, Context context) {
        this.articles = articles;
        this.context = context;
    }

    @NonNull
    @Override
    public ArticleAdapter.BindingHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding listItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.list_item, parent, false);
        return new BindingHolder(listItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleAdapter.BindingHolder articleViewHolder, int i) {
        ListItemBinding listItemBinding = articleViewHolder.listItemBinding;
        listItemBinding.setAvm(new ArticleViewModel(articles.get(i), context));
    }

    @Override
    public int getItemCount() {
        return (articles != null) ? articles.size() : 0;
    }

    public class BindingHolder extends RecyclerView.ViewHolder{

        private ListItemBinding listItemBinding;

        public BindingHolder(ListItemBinding listItemBinding){
            super(listItemBinding.contentCard);
            this.listItemBinding = listItemBinding;
        }
    }
}
