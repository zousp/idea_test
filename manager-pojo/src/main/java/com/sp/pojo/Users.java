package com.sp.pojo;

/**
 * @Auther: http://www.zousp.con
 * @Date: 2018/12/19
 * @Description: com.sp.pojo
 * @version: 1.0
 */
public class Users {

    private Integer suerId;
    private String username;
    private Integer userage;

    public Users() {
    }

    public Users(Integer suerId, String username, Integer userage) {
        this.suerId = suerId;
        this.username = username;
        this.userage = userage;
    }

    public Integer getSuerId() {
        return suerId;
    }

    public void setSuerId(Integer suerId) {
        this.suerId = suerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
