package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Role
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 22:28
 */
@Entity
@Table(name = "tb_role")
public class Role implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String authenticate;

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(String authenticate) {
        this.authenticate = authenticate;
    }
}
