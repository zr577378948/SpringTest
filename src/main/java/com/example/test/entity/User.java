
package com.example.test.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author zhangrui
 * @Date 13:28 2018/12/27
 */
@Entity
@Table(name="USER_TAB")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mseq")
    @SequenceGenerator(name="mseq",sequenceName="USER_TAB_SEQUENCE",allocationSize=1)
    private Integer id;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
