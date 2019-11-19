package com.ruipeng.springboot.express_delivery.po;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.po.User
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-17 21:49
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String realname;

    @NotNull
    private String number;

    @ManyToMany(cascade = {CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role",joinColumns = {@JoinColumn(name = "user_id")},inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;

    @OneToMany(fetch = FetchType.EAGER,targetEntity = Packages.class,mappedBy = "user")
    private Set<Packages> packages;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Set<Packages> getPackages() {
        return packages;
    }

    public void setPackages(Set<Packages> packages) {
        this.packages = packages;
    }
}
