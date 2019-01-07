import java.util.Arrays;

public class Section {
    String Name;
    Learner[]students=new Learner[0];
    Teacher ClassTeacher;
    Section(String subject,Teacher uchi){
        this.Name=subject;
        this.ClassTeacher=uchi;

    }

    public void getList(){
        for (int i =0;i<this.students.length;i++){
            System.out.println(this.students[i].Fullname);
            System.out.println(this.students[i].cardId);
            System.out.println(this.students[i].phonenumber);
        }
    }
    public  void getlistparents(){
        for (int i =0;i<this.students.length;i++){
            System.out.println(this.students[i].Fullname);
            System.out.println(this.students[i].parents[0].Fullname+":"+this.students[i].parents[0].phonenumber);
            System.out.println(this.students[i].parents[1].Fullname+":"+this.students[i].parents[1].phonenumber);
        }
    }

}
