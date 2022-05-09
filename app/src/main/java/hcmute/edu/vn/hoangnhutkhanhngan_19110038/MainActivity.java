package hcmute.edu.vn.hoangnhutkhanhngan_19110038;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.ConditionVariable;

public class MainActivity extends AppCompatActivity implements TruyenSinhVien{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentInfo);

        Configuration configuration = getResources().getConfiguration();

        if (fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            fragmentStudentInfo.SetInfo(sinhVien);
        } else {
            Intent intent = new Intent(MainActivity.this, StudentInfomation.class);
            intent.putExtra("thongTinSinhVien", sinhVien);
            startActivity(intent);
        }

    }
}