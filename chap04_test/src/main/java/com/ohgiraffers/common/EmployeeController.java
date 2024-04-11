package com.ohgiraffers.common;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController(){
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }
    public void searchAll() {

        List<EmployeeDTO> employeeList = EmployeeService.searchAll();

        if (employeeList != null){
            printResult.printEmployeeList(employeeList);
        }else {
            printResult.printErrorMessage("searchAll");
        }

    }

    public void searchDetailCode(Map<String, String> parameter) {

        int empId = Integer.parseInt(parameter.get("empId"));

        EmployeeDTO emp = EmployeeService.searchDetailCode(empId);

        if (emp != null){
            printResult.printDetailCode(emp);
        }else {
            printResult.printErrorMessage("detail");
        }

    }

    public void insertEmpId(Map<String, String> parameter) {

        String name = parameter.get("name");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String deptCode = parameter.get("deptCode");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpName(name);
        emp.setEmpNo(empNo);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(deptCode);

        if (employeeService.insertEmp(emp)){
            printResult.printInsertEmp("insertEmp");
        }else {
            printResult.printErrorMessage("insertEmp");
        }
    }

    public void modifyEmp(Map<String, String> parameter) {
        int empId = Integer.parseInt(parameter.get("empId"));
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(empId);
        emp.setEmpName(empName);
        emp.setEmpNo(empNo);
        emp.setEmail(email);
        emp.setPhone(phone);

        if (EmployeeService.modifyEmp(emp)){
            printResult.printModifyMessage("modify");
        }else {
            printResult.printErrorMessage("modify");
        }
    }

    public void deleteEmp(Map<String, String> parameter) {

        int empId = Integer.parseInt(parameter.get("empId"));

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(empId);

        if (EmployeeService.deleteMenu(emp)){
            printResult.printDeleteMenuMessage("delete");
        }else {
            printResult.printErrorMessage("delete");
        }

    }
}
