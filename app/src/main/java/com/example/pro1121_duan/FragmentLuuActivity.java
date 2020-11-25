package com.example.pro1121_duan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pro1121_duan.Adapter.LuuAdapter;
import com.example.pro1121_duan.DAO.LuuDao;
import com.example.pro1121_duan.Model.Luu;
import com.example.pro1121_duan.SQLite.MySQLite;

import java.util.List;


public class FragmentLuuActivity extends Fragment {
    ListView listView;
    Toolbar toolbar;

    public FragmentLuuActivity() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_luu_activity, container, false);

        listView =view.findViewById(R.id.listds);
        toolbar = view.findViewById(R.id.toolBarOGhep);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);

        MySQLite mySQL = new MySQLite(getActivity());
        LuuDao luuDao = new LuuDao(mySQL);
        List<Luu> list = luuDao.getAll();
        LuuAdapter luuAdapter = new LuuAdapter(list);
        listView.setAdapter(luuAdapter);

        return view;
    }
}