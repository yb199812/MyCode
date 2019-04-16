package cn.yxin.service;

import cn.yxin.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2019/4/4 0004.
 */
public interface UserService {
    //查所有
    public List<User> Findall();
    //加数据
    public void saveUser(User user);
}
