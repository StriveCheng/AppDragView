package com.example.strivecheng.appdragview.data;

import com.chad.library.adapter.base.entity.SectionEntity;

/**
 * Created by xingcc on 2018/7/23.
 * main function
 *
 * @author strivecheng
 */

public class ClothesSection extends SectionEntity<ClothesInfo> {

    public ClothesSection(boolean isHeader, String header) {
        super(isHeader, header);
    }

    public ClothesSection(ClothesInfo clothesInfo) {
        super(clothesInfo);
    }
}
