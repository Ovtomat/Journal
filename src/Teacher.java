public class Teacher extends Participant {
    public static String Position="Учитель";
    String subject;
    Teacher(int numb,String Name,int id,String subject){
        this.cardId=id;
        this.Fullname=Name;
        this.subject=subject;
        this.phonenumber=numb;
    }
}
