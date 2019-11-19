package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.ReceiveStatus
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-19 00:06
 */
@Entity
@Table(name = "tb_receiveStatus")
public class ReceiveStatus implements Serializable {
    private final static Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long receive_status_id;
    private String statusInfomation;

    public Long getReceive_status_id() {
        return receive_status_id;
    }

    public void setReceive_status_id(Long receive_status_id) {
        this.receive_status_id = receive_status_id;
    }

    public String getStatusInfomation() {
        return statusInfomation;
    }

    public void setStatusInfomation(String statusInfomation) {
        this.statusInfomation = statusInfomation;
    }
}
