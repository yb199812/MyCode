package cn.yxin.redis;

/**
 * Created by Administrator on 2019/4/4 0004.
 */
public interface JedisOpereta {
    String get(String key);//读取数据
    String set(String key,String value);//向redis中中写入数据
    String hget(String hkey,String key);//获取存储结构是hasmao类型的操作
    long hset(String hkey,String key, String value);
    long incr(String key);
    long expire(String key,int second);//设置缓存生存时间
    long ttl(String key);
    long del(String key);//删除数据
    long hdel(String hkey,String key);




}
