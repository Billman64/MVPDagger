package laughingleviathon.mvpdagger.injection.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import laughingleviathon.mvpdagger.R;
import laughingleviathon.mvpdagger.injection.mainactivity.DaggerMainActivityComponent;
import laughingleviathon.mvpdagger.injection.view.mainactivity.MainActivityContract;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerMainActivityComponent.create().inject(this);  // need mainactivitycomponent and m..a..presenter

        presenter.addView(this);
        presenter.doCalculation("hello world");


    }

    @Override
    public void updateView(String log){
        Log.d("TAG", "updateView: " + log);

    }
}
