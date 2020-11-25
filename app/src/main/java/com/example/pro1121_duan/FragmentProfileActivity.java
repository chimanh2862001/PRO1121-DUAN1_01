package com.example.pro1121_duan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class FragmentProfileActivity extends Fragment {

    LinearLayout lnThongTin, lnDieuKhoan, lnVeChungToi, lnDangXuat;
    Toolbar toolbar;

    public FragmentProfileActivity() {
        // Required empty public constructor
    }

    String tk,mk;
    TextView textView10;
    TextView tvTTTK;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile_activity, container, false);

        lnDangXuat = view.findViewById(R.id.lnDangXuat);
        lnVeChungToi = view.findViewById(R.id.lnVeChungToi);
        lnDieuKhoan = view.findViewById(R.id.lnDieuKhoan);
        lnThongTin = view.findViewById(R.id.lnThongTinTaiKhoan);
        lnThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ThongTinTaiKhoan.class);
                intent.putExtra("tk",tk);
                startActivity(intent);
            }
        });

        lnDieuKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DieuKhoanActivity.class);
                startActivity(intent);
            }
        });

        lnVeChungToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),VeChungToiActivity.class);
                startActivity(intent);
            }
        });

        lnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),DangNhap.class);
                startActivity(intent);
            }
        });

        toolbar = view.findViewById(R.id.toolbarProfile);
        toolbar.setTitle("Profile");
        tvTTTK=view.findViewById(R.id.tvTTTK);
          textView10=view.findViewById(R.id.textView10);
           tk=getArguments().getString("us2");
          textView10.setText(getArguments().getString("us2"));




          tvTTTK.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent=new Intent(getActivity(),ThongTinTaiKhoan.class);
                  intent.putExtra("tk",tk);
                  startActivity(intent);
              }
          });
        return view;
    }
}