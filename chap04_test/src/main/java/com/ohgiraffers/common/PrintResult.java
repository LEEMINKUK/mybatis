package com.ohgiraffers.common;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        for(EmployeeDTO emp : employeeList){
            System.out.println(emp);
        }

    }

    public void printErrorMessage(String error) {

        String errorMessage = "";

        switch (error){
            case "searchAll" : errorMessage = "전체 직원 조회 실패.";
            break;
            case "detail" : errorMessage = "직원 상세 조회 실패.";
            break;
            case "insertEmp" : errorMessage="직원 등록 실패.";
            break;
            case "modify" : errorMessage="직원 정보 수정 실패";
            break;
        }
        System.out.println(errorMessage);
    }

    public void printDetailCode(EmployeeDTO emp) {

        System.out.println(emp);
    }

    public void printInsertEmp(String emp) {
        String insertEmp ="";
        switch (emp){
            case "insertEmp" : insertEmp="직원 등록 성공";
            break;
        }
        System.out.println(insertEmp);
    }

    public void printModifyMessage(String modify) {

        String modifyMessage = "";
        switch (modify){
            case "modify" : modifyMessage = "수정 완료 했습니다.";
                break;
        }
        System.out.println(modifyMessage);
    }

    public void printDeleteMenuMessage(String delete) {

        String deleteMessage = "";
        switch (delete){
            case "delete" : deleteMessage = "삭제 완료 했습니다.";
                break;
        }
        System.out.println(deleteMessage);
    }
    }

