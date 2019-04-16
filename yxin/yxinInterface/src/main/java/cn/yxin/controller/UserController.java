package cn.yxin.controller;

import cn.yxin.domain.User;
import cn.yxin.redis.iml.JsdisOperetaIml;
import cn.yxin.service.UserService;
import cn.yxin.service.impl.UserServiceImpl;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/4 0004.
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl us;
    @RequestMapping(path = "/log")
    public String log(){
        return "zucee";
    }
@RequestMapping(path = "/look")
   public String look(Model model){
    List<User> users = us.Findall();
    model.addAttribute("user",users);
    System.out.println("来到look");
    return "zuce";
}

//注册
    @RequestMapping(path = "/zuce")
    public String zuce(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("开始注册");
        System.out.println(user.getName());

       try {
         //  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

           us.saveUser(user);
       }catch (Exception e){
           return "erro";
       }
        request.getRequestDispatcher("/look").forward(request,response);
       return null;

    }
    //接受ajax传输
    @Autowired
    JsdisOperetaIml jsd;
    @RequestMapping(path = "/aj")
    @ResponseBody
    public String aj(Model model,@RequestBody JSONObject js){

       System.out.println("获得ajax请求");
        System.out.println(js.get("name"));
        String name = (String) js.get("name");
        String id = (String) js.get("id");
        System.out.println(jsd.set(id,name));
        System.out.println("处理完redis返回"+jsd.get("111110"));
        System.out.println("处理完ajax请求");
       return "{}";


    }

}
