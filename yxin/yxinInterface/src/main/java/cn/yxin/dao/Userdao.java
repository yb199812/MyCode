package cn.yxin.dao;

import cn.yxin.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface Userdao {
    //查所有
    public List<User> Findall();
    //加数据
    public void saveUser(User user);
}
