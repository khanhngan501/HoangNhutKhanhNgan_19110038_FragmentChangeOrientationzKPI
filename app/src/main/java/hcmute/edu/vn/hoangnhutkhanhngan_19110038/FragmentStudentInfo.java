package hcmute.edu.vn.hoangnhutkhanhngan_19110038;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentStudentInfo extends Fragment {

    TextView txtHoTen, txtNamSinh, txtDiaChi, txtEmail;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info, container, false);
        AnhXa();
        return view;
    }

    public void SetInfo(SinhVien sv){
        txtHoTen.setText(sv.getHoTen());
        txtNamSinh.setText("Năm sinh: " + sv.getNamSinh());
        txtDiaChi.setText("Địa chỉ: " + sv.getDiaChi());
        txtEmail.setText("Email: " + sv.getEmail());
    }

    private void AnhXa(){
        txtHoTen = (TextView) view.findViewById(R.id.textviewName);
        txtNamSinh = (TextView) view.findViewById(R.id.textviewNamSinh);
        txtDiaChi = (TextView) view.findViewById(R.id.textviewDiaChi);
        txtEmail = (TextView) view.findViewById(R.id.textviewEmail);

    }
}
