public class Main {
    public static void main(String[] arqs) {
        School samsungit=new School("Samsung It","Ploshad ilyacha");
        int a=5;
        Teacher ucha=new Teacher(6966,"gggggg",85855656,"Infa");
        Employee e=new Employee(3956795,"Batya",6555778,"Уборщица");
        Parent batya=new Parent(6767967,"hghhhhhhh");
        Parent mama=new Parent(676966,"ggfghh");
        Learner q1=new Learner(767676,"fgffgf",76766666,batya,mama);
        Learner q2=new Learner(767676,"fgffgfhfsg",76766666,batya,mama);
        Class a8=new Class("8a",ucha);


        samsungit.getParticipant(e);
        samsungit.hireEmployee(e);
        samsungit.hireEmployee(e);
        samsungit.getListEmployees();
        samsungit.addClass(a8);



        samsungit.getListTeachers();
        samsungit.getlisofClasses();
        samsungit.getList();





    }
}
