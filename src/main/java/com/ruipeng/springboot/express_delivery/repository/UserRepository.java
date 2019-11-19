package com.ruipeng.springboot.express_delivery.repository;

import com.ruipeng.springboot.express_delivery.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.repository.UserRepository
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-19 10:57
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
