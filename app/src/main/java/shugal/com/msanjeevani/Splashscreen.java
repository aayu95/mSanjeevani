package shugal.com.msanjeevani;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.facebook.shimmer.ShimmerFrameLayout;

/**
 * Created by abhishek on 30/10/15.
 */
public class Splashscreen extends AppCompatActivity {


    int SCREEN_TIMEOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        startSplashscreen();

        ShimmerFrameLayout container =
                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.setDuration(3000);
        container.startShimmerAnimation();
    }

    private boolean isFirstTime() {
        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isfirstrun", true);
        if (isFirstRun) {
            getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().
                    putBoolean("isfirstrun", false).commit();

            return true;

        } else {
            return false;
        }
    }

    private void startSplashscreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (isFirstTime()) {
                    createDatabases();
                    Intent firstInputs = new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(firstInputs);
                } else {
                    Intent proceedToMain = new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(proceedToMain);
                }

                finish();
            }
        }, SCREEN_TIMEOUT);
    }

    private void createDatabases() {
        DatabaseHelper db = new DatabaseHelper(this);


        DoctorData datas0 = new DoctorData("Dr Aman", "Fortis");
        db.addDoctor(datas0);



        AppointmentData data = new AppointmentData("kk", 9, "k", "k", "k", "k", "k");
        db.addAppointment(data);
        SampleData data1 = new SampleData("kk", 9, "k", "k", "k", "k");
        db.addSample(data1);
        db.deleteFirstValues();


        db.close();
    }

}
