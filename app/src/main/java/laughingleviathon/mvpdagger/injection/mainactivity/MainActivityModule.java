package laughingleviathon.mvpdagger.injection.mainactivity;

import dagger.Module;
import dagger.Provides;
import laughingleviathon.mvpdagger.injection.view.mainactivity.MainActivityContract;
import laughingleviathon.mvpdagger.injection.view.mainactivity.MainActivityPresenter;

/**
 * Created by User on 5/3/2017.
 */


@Module
public class MainActivityModule {

    @Provides
    public MainActivityPresenter provideMainActivityPresenter() {
        return new MainActivityPresenter();
    }
}
