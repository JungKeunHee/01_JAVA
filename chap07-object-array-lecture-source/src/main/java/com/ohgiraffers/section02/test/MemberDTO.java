package com.ohgiraffers.section02.test;

public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;

    public MemberDTO() {
    }

    public MemberDTO(int no, String id, String pwd, String name) {
        this.no = no;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
