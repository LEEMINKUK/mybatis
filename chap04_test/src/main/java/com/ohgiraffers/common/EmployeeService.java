package com.ohgiraffers.common;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class EmployeeService {
    public static List<EmployeeDTO> searchAll() {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> employeeList = employeeMapper.searchAll();

        sqlSession.close();

        return employeeList;
    }

    public static EmployeeDTO searchDetailCode(int empId) {

        SqlSession sqlSession =getSqlSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO emp = employeeMapper.searchDetailCode(empId);

        sqlSession.close();

        return emp;
    }

    public static boolean deleteMenu(EmployeeDTO emp) {
        return false;
    }


    public boolean insertEmp(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        EmployeeMapper EmpMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = EmpMapper.insertEmp(emp);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
    public static boolean modifyEmp(EmployeeDTO emp) {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper menuMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = menuMapper.updateEmp(emp);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
