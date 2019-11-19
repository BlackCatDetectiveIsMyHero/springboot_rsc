package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.PackageStatus
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-18 23:55
 */
@Entity
@Table(name = "tb_package_status")
public class PackageStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long package_status_id;

    private String statusInformation;

    public Long getPackage_status_id() {
        return package_status_id;
    }

    public void setPackage_status_id(Long package_status_id) {
        this.package_status_id = package_status_id;
    }

    public String getStatusInformation() {
        return statusInformation;
    }

    public void setStatusInformation(String statusInformation) {
        this.statusInformation = statusInformation;
    }
}
