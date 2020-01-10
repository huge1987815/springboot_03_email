/**
 * Create Date:2019年12月29日
 */
package com.huge.entity;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
public class Dept {
  private Integer did;

  private String dname;

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
   * @return the dname
   */
  public String getDname() {
    return dname;
  }

  /**
   * @param dname the dname to set
   */
  public void setDname(String dname) {
    this.dname = dname;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   * @param did
   * @param dname
   */
  public Dept(Integer did, String dname) {
    super();
    this.did = did;
    this.dname = dname;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   */
  public Dept() {
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
    return "Dept [did=" + did + ", dname=" + dname + "]";
  }

}
