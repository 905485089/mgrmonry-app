package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 理财产品实体类
 * @author houzehua
 * @since jdk8
 *
 *
 */
@Data
@NoArgsConstructor
public class Product implements Serializable {
    //产品编号
    private String id;
    //产品名称
    private String name;
    //产品起投金额
    private BigDecimal startAmount;
    //产品投资步长
    private BigDecimal stepAmount;
    //产品锁定期
    private Integer locakupPeriod;
    //产品收益率
    private BigDecimal rarningRate;
    //产品状态
    private String status;
    //产品备注
    private String remark;
    //创建时间
    private Date createAt;
    //创建者
    private String createUser;
    //更新时间
    private Date updateAt;
    //更新者
    private String updateUser;

    public void setStatus(ProductStatus ps){
        this.status = ps.getDesc();
    }
}
