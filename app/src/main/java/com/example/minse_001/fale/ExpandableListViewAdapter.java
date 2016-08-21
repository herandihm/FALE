package com.example.minse_001.fale;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by minse_001 on 2016-08-21.
 */
public class ExpandableListViewAdapter extends BaseExpandableListAdapter{
    private Context mContext;
    private ArrayList<String> mParentList;
    private ArrayList<String> mChildList;
    private HashMap<String, ArrayList<String>> mChildHashMap;

    public ExpandableListViewAdapter(){}

    public ExpandableListViewAdapter(Context context, ArrayList<String> parentList, HashMap<String, ArrayList<String>> childHashMap){
        this.mContext = context;
        this.mParentList = parentList;
        this.mChildHashMap = childHashMap;
    }
    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int i) {
        return 0;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
