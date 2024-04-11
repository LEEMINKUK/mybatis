package com.ohgiraffers.common;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeDTO> searchAll();

    EmployeeDTO searchDetailCode(int code);

    int insertEmp(EmployeeDTO emp);

    int updateEmp(EmployeeDTO emp);
}
