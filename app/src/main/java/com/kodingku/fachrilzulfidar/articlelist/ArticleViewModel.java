package com.kodingku.fachrilzulfidar.articlelist;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ArticleViewModel extends BaseObservable {

    private Article article;
    private Context context;

    public ArticleViewModel(Article article, Context context) {
        this.article = article;
        this.context = context;
    }

    @Bindable
    public String getTitle(){
        return article.getTitle();
    }

    @Bindable
    public String getWriter(){
        return article.getWriter();
    }
}
