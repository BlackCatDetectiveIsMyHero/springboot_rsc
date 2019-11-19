package com.ruipeng.springboot.express_delivery.po;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Delivery
 *
 * @description:收件表
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 23:33
 */
@Entity
@Table(name = "tb_delivery")
public class Delivery implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long delivery_id;

    //邮差工号
    @OneToOne(targetEntity = Postman.class)
    @JoinColumn(name = "postman_id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Postman postman;

    //邮件编号
    @OneToOne(targetEntity = Packages.class)
    @JoinColumn(name = "package_id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Packages packages;

    //收件日期
    private Date date;

    //状态
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = DeliveryStatus.class)
    @JoinColumn(name = "delivery_status_id",referencedColumnName = "delivery_status_id")
    private DeliveryStatus deliveryStatus;

    //详情
    private String detail;

    public Long getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Long delivery_id) {
        this.delivery_id = delivery_id;
    }

    public Postman getPostman() {
        return postman;
    }

    public void setPostman(Postman postman) {
        this.postman = postman;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Packages getPackages() {
        return packages;
    }

    public void setPackages(Packages packages) {
        this.packages = packages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
