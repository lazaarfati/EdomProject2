package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 7/21/2016.
 */
public class User {
    private int id;

    private String Code;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    private String username;

    private String email;
    private String password;

    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    private Role roleInstance;

    private List<Logment> logmentList;


    public User() {
    }

    public User(String login, String password) {

        this.username =login;

       // this.password=BCrypt.hashpw(password, BCrypt.gensalt(12))

        ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       // this.password = BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    public Role getRoleInstance() {
        return roleInstance;
    }

    public void setRoleInstance(Role roleInstance) {
        this.roleInstance = roleInstance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Logment> getLogmentList() {
        return logmentList;
    }

    public void setLogmentList(List<Logment> logmentList) {
        this.logmentList = logmentList;
    }


    public User(int id, String userName, String email, String password) {
        this.id = id;
        this.username = userName;
        this.email = email;
        this.password = password;
    }
}
