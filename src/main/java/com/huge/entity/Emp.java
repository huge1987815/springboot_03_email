/**
 * Create Date:2019年12月29日
 */
package com.huge.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
public class Emp {
  private Integer eid;

  private String ename;

  private String sex;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthdate;

  private Integer did;

  /**
   * @return the eid
   */
  public Integer getEid() {
    return eid;
  }

  /**
   * @param eid the eid to set
   */
  public void setEid(Integer eid) {
    this.eid = eid;
  }

  /**
   * @return the ename
   */
  public String getEname() {
    return ename;
  }

  /**
   * @param ename the ename to set
   */
  public void setEname(String ename) {
    this.ename = ename;
  }

  /**
   * @return the sex
   */
  public String getSex() {
    return sex;
  }

  /**
   * @param sex the sex to set
   */
  public void setSex(String sex) {
    this.sex = sex;
  }

  /**
   * @return the birthdate
   */
  /* @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")*/
  public Date getBirthdate() {
    return birthdate;
  }

  /**
   * @param birthdate the birthdate to set
   */
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  /**
   * @return the did
   */
  public Integer getDid() {
    return did;
  }

  /**
   * @param did the did to set
   */
  public void setDid(Integer did) {
    this.did = did;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   * @param eid
   * @param ename
   * @param sex
   * @param birthdate
   * @param did
   */
  public Emp(Integer eid, String ename, String sex, Date birthdate, Integer did) {
    super();
    this.eid = eid;
    this.ename = ename;
    this.sex = sex;
    this.birthdate = birthdate;
    this.did = did;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   */
  public Emp() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   * @see Object#toString()
   */
  @Override
  public String toString() {
    return "Emp [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", birthdate=" + birthdate + ", did="
      + did + "]";
  }

}
