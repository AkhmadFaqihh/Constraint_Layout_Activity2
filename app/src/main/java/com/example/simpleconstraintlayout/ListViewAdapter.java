package com.example.simpleconstraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    // Deklarasi variabel dengan jenis data context
    Context mContext;

    // Deklarasi variabel dnegan jenis data layout inflater
    LayoutInflater inflater;

    // Deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arraylist;

    // Membuat konstruktor Listviewadapter
    public ListViewAdapter(Context context){
        // Memberi nilai mContext dengan context
        mContext = context;

        // Mengatur layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        // Membarikan nilai arraylist dari class ClassNama
        this.arraylist = new ArrayList<ClassNama>();

        // Menambah semua elemen ke arraylist
        this.arraylist.addAll(Home_Activity.classNamaArrayList);
    }
    // Membuat class untuk mendeklarasiukan tempat untuk meletakkan isi kedalam listview
    public class ViewHolder{
        // Mendeklarasikan variabel dengan jenis textview
        TextView name;
    }
    //Fungsi getCount () mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount() {
        // Mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }
    // Fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    // tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi
    // tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        // Mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }
    // Fungsi mengembalikam "nilai" dari posisi item ke adaptor
    @Override
    public long getItemId(int i) {
        return i;
    }
    // Fungsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    // ditampilkan atau akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Deklarasi variabel dengan jenis data ViewHolder
        final ViewHolder holder;

        // Membuat kondisi apakah view null atau tidak
        if (view == null){

            // Membuat objek view holder
            holder = new ViewHolder();

            // Mengatur layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);

            // set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            // Menyimpan data dalam tampilan tanpa menggunakan struktur data lain
            view.setTag(holder);

        }else{
            // Mengatur holder untuk mengembalikan nilai dari view tag
            holder = (ViewHolder) view.getTag();
        }
        // Set item ke TextViews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        // Mengembalikan nilai ke variabel view
        return view;
    }
}
