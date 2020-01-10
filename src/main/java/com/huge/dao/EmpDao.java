/**
 * Create Date:2019年12月29日
 */
package com.huge.dao;

import java.util.List;
import java.util.Map;

import com.huge.entity.Dept;
import com.huge.entity.Emp;
import com.huge.entity.EmpVo;
import org.apache.ibatis.annotations.Param;



/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
public interface EmpDao {
  //根据eid删除员工信息 
  int deleteEmpByEid(@Param("eid") Integer eid);

  //根据eid修改员工信息 
  int updateEmpByEid(Emp emp);

  //根据eid查询员工信息
  Emp findEmpByEid(@Param("eid") Integer eid);

  //添加员工信息
  int addEmp(Emp emp);

  //查询所有部门信息
  List<Dept> findAllDept();

  //查询所有员工信息
  List<EmpVo> findAllEmp(Map<String, Object> map);
}
