/**
 * Create Date:2019年12月29日
 */
package com.huge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huge.entity.Emp;
import com.huge.entity.EmpVo;
import com.huge.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年12月29日
 */
@Controller
public class EmpController {
  @Autowired
  private EmpService service;

  //删除员工信息
  @RequestMapping("deleteEmp.do")
  @ResponseBody
  public Object deleteEmp(@RequestParam(value = "eid") Integer eid) {
    return service.deleteEmpByEid(eid) > 0 ? true : false;
  }

  //修改员工信息
  @RequestMapping("updateEmp.do")
  @ResponseBody
  public Object updateEmp(Emp emp) {
    return service.updateEmpByEid(emp) > 0 ? true : false;
  }

  //实现员工回显
  @RequestMapping("getEmp.do")
  @ResponseBody
  public Object getEmp(@RequestParam(value = "eid") Integer eid) {
    return service.findEmpByEid(eid);
  }

  //跳转到修改页面
  @RequestMapping("toUpdateEmp.do")
  public String toUpdateEmp(@RequestParam(defaultValue = "") Integer eid, Model model) {
    model.addAttribute("eid", eid);
    return "updateEmp";
  }

  //添加员工信息
  @RequestMapping("addEmp.do")
  @ResponseBody
  public Object addEmp(Emp emp) {
    return service.addEmp(emp) > 0 ? true : false;
  }

  //查询所有部门信息
  @RequestMapping("getDept.do")
  @ResponseBody
  public Object getDept() {
    return service.findAllDept();
  }

  //跳转到添加员工页面
  @RequestMapping("toAddEmp.do")
  public String toAddEmp() {
    return "addEmp";
  }

  //查询所有员工信息
  @RequestMapping("list.do")
  public String listEmp(Model model, @RequestParam(defaultValue = "1") Integer pageNum,
    @RequestParam(defaultValue = "") String ename, @RequestParam(defaultValue = "") String begin,
    @RequestParam(defaultValue = "") String end) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("ename", ename);
    map.put("begin", begin);
    map.put("end", end);
    //pageHelper分页
    PageHelper.startPage(pageNum, 2);
    List<EmpVo> list = service.findAllEmp(map);
    PageInfo<EmpVo> page = new PageInfo<EmpVo>(list);
    model.addAttribute("page", page);
    model.addAttribute("ename", ename);
    model.addAttribute("begin", begin);
    model.addAttribute("end", end);
    return "list";
  }
}
