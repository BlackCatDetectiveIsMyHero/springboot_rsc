package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.DeliveryStatus
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-19 00:04
 */
@Entity
@Table(name = "tb_delivery_status")
public class DeliveryStatus implements Serializable {
    private final static Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long delivery_status_id;
    private String statusInformation;

    public Long getDelivery_status_id() {
        return delivery_status_id;
    }

    public void setDelivery_status_id(Long delivery_status_id) {
        this.delivery_status_id = delivery_status_id;
    }

    public String getStatusInformation() {
        return statusInformation;
    }

    public void setStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
    }
}
