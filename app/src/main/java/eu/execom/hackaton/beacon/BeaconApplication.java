package eu.execom.hackaton.beacon;

import android.app.Application;
import android.util.Log;

import com.gimbal.android.Gimbal;
import com.gimbal.logging.GimbalLogConfig;
import com.gimbal.logging.GimbalLogLevel;
import com.orm.SugarApp;

import org.androidannotations.annotations.EApplication;

import java.util.List;

import eu.execom.hackaton.beacon.model.Article;

@EApplication
public class BeaconApplication extends SugarApp {

    private static final String GIMBAL_API_KEY = "34712be4-47d8-4ec7-a53b-cc6bcafc3f17";

    @Override
    public void onCreate() {
        super.onCreate();

        //hi stefania :D hi again
        Gimbal.setApiKey(this, GIMBAL_API_KEY);
        GimbalLogConfig.setLogLevel(GimbalLogLevel.INFO);
        GimbalLogConfig.enableFileLogging(this);

        Article article = new Article("Article", "Article", 17.5, 30);
        article.save();

        List<Article> articles = Article.listAll(Article.class);

        for (Article article1: articles)
            Log.i("Article", article1.toString());
    }

}
