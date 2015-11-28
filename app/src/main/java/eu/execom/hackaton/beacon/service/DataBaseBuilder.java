package eu.execom.hackaton.beacon.service;


import android.util.Log;

import com.orm.SugarApp;

import java.util.List;

import eu.execom.hackaton.beacon.model.Article;

public class DataBaseBuilder extends SugarApp {
    Article article = new Article("Razer DeathAdder", "High Performance Gaming Mouse", 150, 0);
    article.save();

    List<Article> articles = Article.listAll(Article.class);

    for (Article article1: articles)
            Log.i("Razer DeathAdder", article1.toString());
}
