package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.Packages
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 23:31
 */
@Entity
@Table(name = "tb_package")
public class Packages implements Serializable {
    private final static long serialVersionUID = 1L;

    //邮件编码
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long package_id;

    //寄件用户编码(FK)
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private User user;

    //邮政编码
    private String postalCode;

    //寄件人地址
    private String senderAddress;

    //寄件人详细地址
    private String senderFullAddress;

    //收件人姓名
    private String recipientSName;

    //收件人电话
    private String recipientPhoneNumber;

    //收件人地址
    private String recipientSAddress;

    //收件人详细地址
    private String recipientFullAddress;

    //邮件重量
    private double weight;

    //原价格
    private BigDecimal price;

    //折后价
    private BigDecimal priceAfterDiscount;

    //邮件状态(FK)
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = PackageStatus.class)
    @JoinColumn(name = "status_id",referencedColumnName = "package_status_id")
    private PackageStatus packageStatus;

    public Long getPackage_id() {
        return package_id;
    }

    public void setPackage_id(Long package_id) {
        this.package_id = package_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderFullAddress() {
        return senderFullAddress;
    }

    public void setSenderFullAddress(String senderFullAddress) {
        this.senderFullAddress = senderFullAddress;
    }

    public String getRecipientSName() {
        return recipientSName;
    }

    public void setRecipientSName(String recipientSName) {
        this.recipientSName = recipientSName;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    public void setRecipientPhoneNumber(String recipientPhoneNumber) {
        this.recipientPhoneNumber = recipientPhoneNumber;
    }

    public String getRecipientSAddress() {
        return recipientSAddress;
    }

    public void setRecipientSAddress(String recipientSAddress) {
        this.recipientSAddress = recipientSAddress;
    }

    public String getRecipientFullAddress() {
        return recipientFullAddress;
    }

    public void setRecipientFullAddress(String recipientFullAddress) {
        this.recipientFullAddress = recipientFullAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(BigDecimal priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public PackageStatus getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
    }
}
