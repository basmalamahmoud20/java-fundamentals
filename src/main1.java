public class main1 {
    public static void main(String[]args){
int current=312032486;
int seconds=365*60*60*24;
int birth=seconds/7;
int death=seconds/13;
int immigrant=seconds/45;
int nextyear=birth-death+immigrant;
for(int i=1;i<6;i++){
    current+=nextyear;
    System.out.println("year"+i+"population :"+current+nextyear);
       }
    }
}
