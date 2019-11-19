package com.ruipeng.springboot.express_delivery.po;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Postman
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 23:32
 */
@Entity
@Table(name = "tb_postman")
public class Postman implements Serializable {
    private final static Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobNumber; //工号

    private String area; //所属区域

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private User user; //用户编码(FK)

    @ManyToOne(fetch = FetchType.EAGER,targetEntity = PostmanStatus.class)
    @JoinColumn(name = "postman_status_id",referencedColumnName = "postman_status_id")
    private PostmanStatus postmanStatus; //状态(FK)

    public Long getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Long jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostmanStatus getPostmanStatus() {
        return postmanStatus;
    }

    public void setPostmanStatus(PostmanStatus postmanStatus) {
        this.postmanStatus = postmanStatus;
    }
}
