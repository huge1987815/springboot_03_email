/**
 * Create Date:2019年12月29日
 */
package com.huge.entity;

import java.sql.Date;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
public class EmpVo {
  private Integer eid;

  private String ename;

  private String sex;

  private Date birthdate;

  private Dept dept;

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
   * @return the dept
   */
  public Dept getDept() {
    return dept;
  }

  /**
   * @param dept the dept to set
   */
  public void setDept(Dept dept) {
    this.dept = dept;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   * @param eid
   * @param ename
   * @param sex
   * @param birthdate
   * @param dept
   */
  public EmpVo(Integer eid, String ename, String sex, Date birthdate, Dept dept) {
    super();
    this.eid = eid;
    this.ename = ename;
    this.sex = sex;
    this.birthdate = birthdate;
    this.dept = dept;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   */
  public EmpVo() {
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
    return "EmpVo [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", birthdate=" + birthdate + ", dept="
      + dept + "]";
  }

}
