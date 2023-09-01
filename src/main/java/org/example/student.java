package org.example;

public class student {
    private String studentNum;
    private String studentName;

    public student(String studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public String getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentNum='" + studentNum + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
