package laughingleviathon.mvpdagger.injection.mainactivity;

import dagger.Component;
import laughingleviathon.mvpdagger.injection.view.mainactivity.MainActivity;

/**
 * Created by User on 5/3/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
