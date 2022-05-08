package hcmute.edu.vn.hoangnhutkhanhngan_19110038;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class FragmentStudentList extends ListFragment {

    ArrayList<SinhVien> arraySinhVien;
    StudentAdapter adapter;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        arraySinhVien = new ArrayList<>();
        AddArraySV();
        adapter = new StudentAdapter(getActivity(), R.layout.row_student, arraySinhVien);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_student_list, container, false);

    }

    private void AddArraySV(){
        arraySinhVien.add(new SinhVien("Nguyễn Văn A", 1999, "Hà Nội", "nva@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn B", 1996, "Hà Nam", "nvb@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn C", 1991, "Cao Bằng", "nvc@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn D", 1990, "Huế", "nvd@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn E", 1993, "Quảng Ninh", "nve@yahoo.com"));
        arraySinhVien.add(new SinhVien("Nguyễn Văn F", 1992, "Thành phố Hồ Chí Minh", "nvf@yahoo.com"));
    }
}
