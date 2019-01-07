import java.util.Arrays;

public class School {
    Teacher [] teachers=new Teacher[0];
    Learner [] learners=new Learner[0];
    Employee [] employees=new Employee[0];
    Class[]classes=new Class[0];
    Electives[]electives=new Electives[0];
    Section[]sections=new Section[0];
    String Name;
    String Addres;
    School(String name,String add){
        this.Name=name;
        this.Addres=add;
    }
    public void addstudenttoclass(Learner b,Class c){
       if( Arrays.asList(this.learners).contains(b)){
           if (Arrays.asList(c.learners).contains(b)){
           System.out.println("Такой ученик уже есть в классе");
           }
           else{
               c.learners  = Arrays.copyOf(c.learners, c.learners.length + 1);
               c.learners[c.learners.length-1]=b;
           }
       }
       else{
           c.learners  = Arrays.copyOf(c.learners, c.learners.length + 1);
           c.learners[c.learners.length-1]=b;
           this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
           this.learners[this.learners.length-1]=b;
       }
    }
    public void addstudenttoelectives(Learner b, Electives c){
        if( Arrays.asList(this.learners).contains(b)){
            if (Arrays.asList(c.students).contains(b)){
                System.out.println("Такой ученик уже есть в элективе");
            }
            else{
                c.students  = Arrays.copyOf(c.students, c.students.length + 1);
                    c.students[c.students.length-1]=b;
            }
        }
        else{
            c.students  = Arrays.copyOf(c.students, c.students.length + 1);
            c.students[c.students.length-1]=b;
            this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
            this.learners[this.learners.length-1]=b;
        }
    }
    public void addstudenttosection(Learner b, Section c){
        if( Arrays.asList(this.learners).contains(b)){
            if (Arrays.asList(c.students).contains(b)){
                System.out.println("Такой ученик уже есть в элективе");
            }
            else{
                c.students  = Arrays.copyOf(c.students, c.students.length + 1);
                c.students[c.students.length-1]=b;
            }
        }
        else{
            c.students  = Arrays.copyOf(c.students, c.students.length + 1);
            c.students[c.students.length-1]=b;
            this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
            this.learners[this.learners.length-1]=b;
        }
    }
    public void addClass(Class m){
        if( Arrays.asList(this.classes).contains(m)){
               System.out.println("Такой класс уже есть");
        }
            else{
                this.classes  = Arrays.copyOf(this.classes, this.classes.length + 1);
                this.classes[this.classes.length-1]=m;
            }if (!Arrays.asList(this.teachers).contains(m.ClassTeacher)){
            this.teachers  = Arrays.copyOf(this.teachers, this.teachers.length + 1);
            this.teachers[this.teachers.length-1]=m.ClassTeacher;

        }
        for (int i=0;i<m.learners.length;i++){
            if (!Arrays.asList(this.learners).contains(m.learners[i])){
                this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
                this.learners[this.learners.length-1]=m.learners[i];}
        }
    }


     public void addElectives(Electives m){
         if( Arrays.asList(this.electives).contains(m)){
             System.out.println("Такой электив  уже есть");
         }
         else{
             this.electives  = Arrays.copyOf(this.electives, this.electives.length + 1);
             this.electives[this.electives.length-1]=m;
         }if (!Arrays.asList(this.teachers).contains(m.ClassTeacher)){
             this.teachers  = Arrays.copyOf(this.teachers, this.teachers.length + 1);
             this.teachers[this.teachers.length-1]=m.ClassTeacher;}
         for (int i=0;i<m.students.length;i++){
             if (!Arrays.asList(this.learners).contains(m.students[i])){
                 this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
                 this.learners[this.learners.length-1]=m.students[i];}
         }
     }
 public void addSection(Section s){
        if( Arrays.asList(this.sections).contains(s)){
            System.out.println("Такой класс уже есть");
        }
        else{
            this.sections  = Arrays.copyOf(this.sections, this.sections.length + 1);
            this.sections[this.sections.length-1]=s;
        }if (!Arrays.asList(this.teachers).contains(s.ClassTeacher)){
            this.teachers  = Arrays.copyOf(this.teachers, this.teachers.length + 1);
            this.teachers[this.teachers.length-1]=s.ClassTeacher;}
        for (int i=0;i<s.students.length;i++){
            if (!Arrays.asList(this.learners).contains(s.students[i])){
                this.learners  = Arrays.copyOf(this.learners, this.learners.length + 1);
                this.learners[this.learners.length-1]=s.students[i];}
            }
        }

    public void hireTeacher(Teacher t){
        if( Arrays.asList(this.teachers).contains(t)){

            System.out.println("Такой учитель уже есть");
        }
        else{
            this.teachers  = Arrays.copyOf(this.teachers, this.teachers.length + 1);
            this.teachers[this.teachers.length-1]=t;
        }
    }
    public void hireEmployee(Employee e){
        if( Arrays.asList(this.employees).contains(e)){

            System.out.println("Такой работник уже есть");
        }
        else{
            this.employees  = Arrays.copyOf(this.employees, this.employees.length + 1);
            this.employees[this.employees.length-1]=e;
        }
    }
    public  void setTeachertoClass (Teacher t,Class c){
        c.ClassTeacher=t;
    }
    public void setTeachertoelective(Teacher t,Electives e){
        e.ClassTeacher=t;
    }
    public void setTeachertosection(Teacher t,Section s){
        s.ClassTeacher=t;
    }
    public void getList(){
        for (int i=0;i<this.learners.length;i++){
            System.out.println(this.learners[i].Fullname+"   Номер:"+this.learners[i].phonenumber+".  Id"+this.learners[i].cardId+".");
        }
    }
    public void getListTeachers(){
        for (int i=0;i<this.teachers.length;i++){
            System.out.println(this.teachers[i].Fullname+".   Номер:"+this.teachers[i].phonenumber+".  Id "+this.teachers[i].cardId+".  Предмет "+this.teachers[i].subject);
        }
    }
    public void getListEmployees(){
        for (int i=0;i<this.employees.length;i++){
            System.out.println(this.employees[i].Fullname+"   Номер:"+this.employees[i].phonenumber+".  Id "+this.employees[i].cardId+".   Должность  "+this.employees[i].position);
        }
    }
    public void getlisofClasses(){
        for (int i=0;i<this.classes.length;i++){
            System.out.println("Номер:"+this.classes[i].classnumber+".  Учитель "+this.classes[i].ClassTeacher.Fullname+".  Учеников: "+this.classes[i].learners.length+".");
        }
    }
    public void getlisofElectives(){
        for (int i=0;i<this.electives.length;i++){
            System.out.println("Номер:"+this.electives[i].Academicsubject+".  Учитель"+this.classes[i].ClassTeacher.Fullname+".   Учеников:"+this.classes[i].learners.length);
        }
    }
    public void getlisofSections(){
        for (int i=0;i<this.sections.length;i++){
            System.out.println("Номер:"+this.sections[i].Name+".  Учитель"+this.classes[i].ClassTeacher.Fullname+".  Учеников:"+this.classes[i].learners.length+".");
        }
    }
    public void getParticipant(Participant b){
        System.out.println(b.Fullname+" "+b.cardId+" "+b.phonenumber+" "+((Object)b).getClass().getName());
        if(((Object)b).getClass().getName()=="Teacher"){
            System.out.println(((Teacher)b).subject);
        }else if(((Object)b).getClass().getName()=="Employee"){
            System.out.println(((Employee)b).position);
        }else if(((Object)b).getClass().getName()=="Learner"){
            System.out.println(((Learner)b).parents[0].Fullname+" "+((Learner)b).parents[0].phonenumber);
            System.out.println(((Learner)b).parents[1].Fullname+" "+((Learner)b).parents[1].phonenumber);
        }

    }
    public void getJournal(){
        System.out.println("Журнал:");

        for (int i=0;i<this.learners.length;i++){
            System.out.println("\n"+this.learners[i].Fullname);
            System.out.print("Дата:   ");
            for (int q=0;q<10;q++){
                System.out.print(this.learners[i].journal[q][0]+"  ");
            }
            System.out.print("\n"+"Оценка: ");
            for (int q=0;q<10;q++){
                System.out.print(this.learners[i].journal[q][1]+"  ");
            }

        }
    }
    }








