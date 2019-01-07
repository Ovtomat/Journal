import java.util.Random;

public class Learner extends Participant {
    Parent[] parents=new Parent[2];
    int [][] journal=new int[10][2];
    final Random random = new Random();
    Learner(int numbs,String Names,int id,Parent batya,Parent mama){
        this.phonenumber=numbs;
        this.Fullname=Names;
        this.cardId=id;
        this.parents[0]=batya;
        this.parents[1]=mama;
        for (int i=0;i<10;i++){
            journal[i][0]=i+1;
            journal[i][1]=random.nextInt(5);

        }

    }
}
