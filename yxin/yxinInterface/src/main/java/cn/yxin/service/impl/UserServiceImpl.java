package cn.yxin.service.impl;

import cn.yxin.dao.Userdao;
import cn.yxin.domain.User;
import cn.yxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/4/4 0004.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    Userdao userdao;

    @Override
    public List<User> Findall() {
        List<User> s = userdao.Findall();
        System.out.println(s.toString());
        return s;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
       // user.setCreattime((java.sql.Date) new Date());
        userdao.saveUser(user);
        System.out.println("添加账户信息成功");



    }
}
