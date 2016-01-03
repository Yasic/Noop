package com.yasic.noop.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yasic.noop.R;

/**
 * Created by ESIR on 2016/1/4.
 */
public class NoteListFgrament extends Fragment {
    /**
     * 根视图的对象
     */
    private View rootView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_notelist, container, false);
        }
        return rootView;
    }
}
