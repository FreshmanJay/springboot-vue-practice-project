package com.example.demo.entity;

public class PageRequest {
    private int currentPage;
    private int pageSize;
    private String userName; // 用于搜索的姓名参数

    // Getters and Setters
    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String name) {
        this.userName = name;
    }
}