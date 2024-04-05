package com.ohgiraffers.section02.javaconfig;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList){
            System.out.println(menu);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode){
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패 하셨습니다.";
            break;
            case "selectOne" : errorMessage = "메뉴 상세 조회를 실패 하셨습니다.";
            break;
            case "insert" : errorMessage = "신규 메뉴 등록을 실패 하셨습니다.";
            break;
        }
        System.out.println(errorMessage);
    }

    public void printMenu(MenuDTO menu) {

        System.out.println(menu);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage ="";
        switch (successCode){
            case "insert" : successMessage = "신규 등록을 성공 했습니다";
            break;
        }
        System.out.println(successMessage);

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
