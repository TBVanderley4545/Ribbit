package tbvanderleystudios.com.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by tylervanderley on 2/22/15.
 */

public class RibbitApplication extends Application {

    @Override
    public void onCreate()
    {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "NAa5kkUQ94BUluJLoPcT81WmO6F3XKoKydmQ9Lji", "JedxVt0pvNX19LkHdJvmkYZbBqERkLWw85O1hKX9");
    }
}
