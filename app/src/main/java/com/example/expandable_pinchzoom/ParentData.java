package com.example.expandable_pinchzoom;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class ParentData extends ExpandableGroup<ChildData> {
    public ParentData(String title, List<ChildData> items) {
        super(title, items);
    }
}
