package com.jc.farm.service;

import com.jc.farm.dao.UserDao;
import com.jc.farm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc
 * @Author LinXing
 * @Date 2020/3/16 9:33
 * @Version 1.0
 */
@Service
public class UserService /*implements UserDetailsService*/ {

    @Autowired
    private UserDao userDao;

    public User getUser(String username,String password){
        User user;
        user = userDao.getUser(username);
        if(user != null && user.getPassword().equalsIgnoreCase(password)){
            return user;
        }
        return user;
    }


//    @Scheduled(cron = "0/5 * * * * 0-7")
//    public void hello(){
//        System.err.println("hello a!树哥");
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Map user = userDao.getUser(username);//获取用户
//        Collection<? extends GrantedAuthority> authorities = getAuthorities(); //获取角色信息
//        User user1 = new User(user.get("username").toString(),user.get("password").toString(),authorities);
//        System.err.println(user1.getAuthorities().toString());
//        return user1;
//    }
//
//    /**  * 获取用户的角色权限,为了降低实验的难度，这里去掉了根据用户名获取角色的步骤     * @param    * @return   */
//    private Collection<GrantedAuthority> getAuthorities(){
//        List<GrantedAuthority> authList = new ArrayList<>();
//        authList.add(new SimpleGrantedAuthority("V1"));
//        authList.add(new SimpleGrantedAuthority("V2"));
//        return authList;
//    }
}
