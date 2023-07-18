package my.android.linkup;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class InstagramOffline extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance("https://link-up-b90a9-default-rtdb.firebaseio.com/").setPersistenceEnabled(true);
    }
}
