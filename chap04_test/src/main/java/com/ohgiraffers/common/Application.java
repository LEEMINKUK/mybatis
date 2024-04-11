package com.ohgiraffers.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController();

        do{
            System.out.println("======== Employee ==========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("번호를 선택해 주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: employeeController.searchAll();
                    break;
                case 2: employeeController.searchDetailCode(inputDetailCode());
                    break;
                case 3: employeeController.insertEmpId(inputEmpId());
                    break;
                case 4: employeeController.modifyEmp(inputModifyEmp());
                    break;
                case 5: employeeController.deleteEmp(inputDetailCode());
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해 주세요 ");
                    break;
            }
        }while (true);
    }



    private static Map<String, String> inputDetailCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("EMP_ID #CODE(숫자 200~222) 를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("empId",empId);

        return parameter;
    }
    private static Map<String, String> inputEmpId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("직원 이름을 입력 하세요 : ");
        String name = sc.nextLine();
        System.out.println("직원의 주민번호를 입력하세요 ex) 930329-1111111 (하이픈 포함) ");
        String empNo = sc.nextLine();
        System.out.println("직원의 email을 입력하세요 ex) email123@gmail.com (@ 포함)");
        String email = sc.nextLine();
        System.out.println("직원의 전화번호를 입력하세요 ex) 010-1234-5678 (하이픈 포함)");
        String phone = sc.nextLine();
        System.out.println("deptCode 를 입력하세요. ex) D1 ~ D9 이후 입력 안받을래요. 귀찮음");
        String deptCode =sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("empNo",empNo);
        parameter.put("email",email);
        parameter.put("phone",phone);
        parameter.put("deptCode",deptCode);

        return parameter;
    }
    private static Map<String, String> inputModifyEmp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 직원의 EMP_ID를 선택해주세요.");
        String empId =sc.nextLine();
        System.out.print("수정할 직원 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("수정할 주민번호 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("수정할 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("수정할 전화번호를 입력 하세요 : ");
        String phone = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("empId",empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);

        return parameter;
    }
}
