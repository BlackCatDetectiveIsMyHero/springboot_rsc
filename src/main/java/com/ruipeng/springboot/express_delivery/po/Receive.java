package com.ruipeng.springboot.express_delivery.po;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Receive
 *
 * @description:派送邮件表
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 23:33
 */
@Entity
@Table(name = "tb_receive")
public class Receive implements Serializable {
    private final static long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long receive_id;

    //邮差工号
    @OneToOne(targetEntity = Postman.class)
    @JoinColumn(name = "postman_id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Postman postman;

    //快件编号
    @OneToOne(targetEntity = Postman.class)
    @JoinColumn(name = "package_id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Packages packages;

    //派送日期
    private Date date;

    //状态
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = ReceiveStatus.class)
    @JoinColumn(name = "receive_status_id",referencedColumnName = "receive_status_id")
    private ReceiveStatus receiveStatus;

    //详情
    private String detail;

    public Long getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(Long receive_id) {
        this.receive_id = receive_id;
    }

    public Postman getPostman() {
        return postman;
    }

    public void setPostman(Postman postman) {
        this.postman = postman;
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

    public ReceiveStatus getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(ReceiveStatus receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
