package com.hjw.frame.business.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table(name = "`im_user`")
public class ImUser implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "`username`")
    private String username;

    /**
     * 密码加密后的hash值
     */
    @Column(name = "`pwd_hash`")
    private String pwdHash;

    /**
     * 盐
     */
    @Column(name = "`salt`")
    private String salt;

    @Column(name = "`gmt_create`")
    private Date gmtCreate;

    @Column(name = "`gmt_update`")
    private Date gmtUpdate;

    @Column(name = "`deleted`")
    private Boolean deleted;

    private static final long serialVersionUID = 1L;
}