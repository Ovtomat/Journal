import java.util.Arrays;

public class Class {
    String classnumber;
    Teacher ClassTeacher;
    Learner[]learners=new Learner[0];
    Class(String number,Teacher uch){
        this.ClassTeacher=uch;
        this.classnumber=number;
    }

    public void getList(){
        for (int i =0;i<this.learners.length;i++){
            System.out.println(this.learners[i].Fullname);
            System.out.println(this.learners[i].cardId);
            System.out.println(this.learners[i].phonenumber);
        }
    }
    public  void getlistparents(){
        for (int i =0;i<this.learners.length;i++){
            System.out.println(this.learners[i].Fullname);
            System.out.println(this.learners[i].parents[0].Fullname+":"+this.learners[i].parents[0].phonenumber);
            System.out.println(this.learners[i].parents[1].Fullname+":"+this.learners[i].parents[1].phonenumber);
        }
    }


}
