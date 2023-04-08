package _Gun_45_JavaTekrar;

public class Soru5 {
    public static void main(String[] args) {
  int data[]={2010,2013,2014,2015,2014};
  int key =2014;
  int count =0;

  for(int e :data)
  {
      if(e !=key){
          continue;
  }
      count++;
  }
        System.out.println( count +"Found");
    }
    //bu sekilde olunca 2 Found yazdirir
    //count continue nun direk altinda olunca cmpile error verir.
    // Cunku continue nin direk altinda bisey olamaz
}
