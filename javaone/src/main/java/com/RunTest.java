package com;

public class RunTest {
    public static void main(String[] args){
        Student xues = new Student();
        xues.setName("欧");
        xues.setAge(18);
        xues.setClassName("s78");
        xues.setStuno(10086);
       /* xues.name="欧阳";
        xues.age=18;
        xues.className="s78";
        xues.stuno=10086;*/

        xues.study();
//        xues.Book();


        School gzs = new School();
        gzs.homework="数学作业";
        gzs.teacher="老师";

        gzs.setName("阳2");
        gzs.setAge(18);
        gzs.setClassName("s782");
        gzs.setStuno(10086);
//        gzs.Book();
        gzs.study();

    }
}
