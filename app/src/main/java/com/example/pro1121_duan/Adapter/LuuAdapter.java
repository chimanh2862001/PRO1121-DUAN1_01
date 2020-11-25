package com.example.pro1121_duan.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pro1121_duan.DAO.LuuDao;
import com.example.pro1121_duan.Model.Luu;
import com.example.pro1121_duan.R;
import com.example.pro1121_duan.SQLite.MySQLite;

import java.util.List;

public class LuuAdapter extends BaseAdapter {
    List<Luu> luuList;


    public LuuAdapter(List<Luu> luuList){

        this.luuList = luuList;
    }
    @Override
    public int getCount() {
        return luuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.luu,viewGroup,false);
        TextView tieude= view.findViewById(R.id.textView7);
        TextView diachi= view.findViewById(R.id.textView8);
        TextView dientich= view.findViewById(R.id.tvDienTichAdapter);
        TextView phongngu = view.findViewById(R.id.tvPhongNguAdapter);
        TextView veSinh = view.findViewById(R.id.tvVeSinhAdapter);
        TextView loaiPhong = view.findViewById(R.id.tvLoaiPhongAdapter);
        TextView gia= view.findViewById(R.id.textView2);

       ImageView xoa = view.findViewById(R.id.imageView3);

        Luu tt = luuList.get(i);


        tieude.setText(""+tt.TieuDe);
        diachi.setText(""+tt.TenDiaDiem);
        dientich.setText(tt.DienTich+"");
        phongngu.setText(tt.PhongNgu +"");
        veSinh.setText(tt.VeSinh +"");
        gia.setText(""+tt.Gia+"");
        loaiPhong.setText(""+tt.LoaiPhong);

xoa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Luu luu = luuList.get(i);
        MySQLite mySQLite = new MySQLite(viewGroup.getContext());
        LuuDao luuDao = new LuuDao(mySQLite);
        luuDao.delete(luu.getTieuDe());
        luuList.remove(i);
        notifyDataSetChanged();

        Toast.makeText(viewGroup.getContext(),"Xoa Thanh Cong",Toast.LENGTH_LONG).show();
    }
});



        return view;
    }


}
