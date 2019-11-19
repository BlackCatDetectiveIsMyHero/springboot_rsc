package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.PostmanStatus
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-19 00:16
 */
@Entity
@Table(name = "tb_postman_status")
public class PostmanStatus implements Serializable {
    private final static Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postman_status_id;

    private String statusInformation;

    public Long getPostman_status_id() {
        return postman_status_id;
    }

    public void setPostman_status_id(Long postman_status_id) {
        this.postman_status_id = postman_status_id;
    }

    public String getStatusInformation() {
        return statusInformation;
    }

    public void setStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
    }
}
