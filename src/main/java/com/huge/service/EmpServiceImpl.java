/**
 * Create Date:2019年12月29日
 */
package com.huge.service;

import java.util.List;
import java.util.Map;

import com.huge.dao.EmpDao;
import com.huge.entity.Dept;
import com.huge.entity.Emp;
import com.huge.entity.EmpVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
@Service
@Transactional
public class EmpServiceImpl implements EmpService {
  @Autowired
  private EmpDao dao;

  /**
   * <br>Description:查询所有员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月29日
   *
   */
  public List<EmpVo> findAllEmp(Map<String, Object> map) {
    return dao.findAllEmp(map);
  }

  /**
   * <br>Description:查询所有部门 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   *
   */
  @Override
  public List<Dept> findAllDept() {
    return dao.findAllDept();
  }

  /**
   * <br>Description:添加员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   *
   */
  @Override
  public int addEmp(Emp emp) {
    return dao.addEmp(emp);
  }

  /**
   * <br>Description:根据eid查询员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   *
   */
  @Override
  public Emp findEmpByEid(Integer eid) {
    return dao.findEmpByEid(eid);
  }

  /**
   * <br>Description:根据eid修改员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   *
   */
  @Override
  public int updateEmpByEid(Emp emp) {
    return dao.updateEmpByEid(emp);
  }

  /**
   * <br>Description:根据eid删除员工信息方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年12月30日
   *
   */
  @Override
  public int deleteEmpByEid(Integer eid) {
    return dao.deleteEmpByEid(eid);
  }

}
