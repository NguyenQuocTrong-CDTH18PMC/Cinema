package com.example.cinema.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cinema.R;
import com.example.cinema.adapters.CommentAdapter;
import com.example.cinema.adapters.MovieAdapter;
import com.example.cinema.models.Comment;
import com.example.cinema.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link binhluan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class binhluan extends Fragment {

    RecyclerView recyclerView;
    List<Comment> comments;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public binhluan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment binhluan.
     */
    // TODO: Rename and change types and number of parameters
    public static binhluan newInstance(String param1, String param2) {
        binhluan fragment = new binhluan();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_binhluan, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rcv_binhluan);

        comments = new ArrayList<>();
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.spidercover));
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.spidercover));
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.themartian));
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.themartian));
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.themartian));
        comments.add(new Comment("[Preview] diệt gọn khương tử nha trên \n bảng danh thu phong vé..",R.drawable.themartian));

        CommentAdapter commentAdapter = new CommentAdapter(getContext(),comments);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setFocusable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}