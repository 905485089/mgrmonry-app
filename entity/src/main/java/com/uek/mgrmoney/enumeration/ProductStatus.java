package com.uek.mgrmoney.enumeration;

import com.uek.mgrmoney.entity.Product;

/**
 * 产品状态
 */
public enum ProductStatus {
    LOCKED("锁定"),SALING("销售中"),END("结束");

    private String desc;
    private ProductStatus(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }
}
