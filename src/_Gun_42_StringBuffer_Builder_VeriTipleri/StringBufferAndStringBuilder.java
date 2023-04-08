package _Gun_42_StringBuffer_Builder_VeriTipleri;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle="";

        cumle=cumle +"Bugun";
        cumle=cumle+"hava";
        cumle+="cok soguk";

        System.out.println("cumle="+cumle);
        System.out.println("cumle.concat()="+cumle.concat(",fakat dun sicakti"));
        System.out.println("cumle = " + cumle);

        cumle= cumle.concat("fakat dun sicakti");
        System.out.println("cumle = " + cumle);

        //*********String Builder

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugun");
        cumle2.append("hava");
        cumle2.append("soguk");

        System.out.println("cumle2 = " + cumle2);

        /******* + ;concat ,StringBuilder 3 model in hizi test edilecek *******/

        long startTime= System.currentTimeMillis();
        String test1="";
        for(int i=0 ;  i<10000 ;i++)
            test1 = test1+ " merhaba";
        System.out.println((System.currentTimeMillis()-startTime)+"ms");

        startTime= System.currentTimeMillis();
        String test2="";
        for(int i=0 ;  i<10000 ;i++)
            test2 = test2.concat( " merhaba");
        System.out.println((System.currentTimeMillis()-startTime)+"ms");

        startTime= System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for(int i=0 ;  i<10000 ;i++)
            test3=test3.append( " merhaba");
        System.out.println((System.currentTimeMillis()-startTime)+"ms");

        //Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.


        //StringBuilder in metodlari:
        
        System.out.println("String Metodlari:");
        StringBuilder sb=new StringBuilder();//atama gerektirmeden ekleme yapar
        sb.append("Bugun ");
        sb.append("hava ");
        sb.append("guzel");
        System.out.println("sb = " + sb);

        System.out.println("sb = " + sb.length());
        sb.append(4);//eklenen her seyi toString hali varsa cevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse(); //stringi terse cevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); //0.index dahil 5 haric siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);     //belirtilen indexteki harfi siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime ");//5 nolu indexe kelimeyi ekledi
        System.out.println("sb = " + sb);

        sb=new StringBuilder("Bugun hava cok guzel");//sifirladi, ilk degeri atadi
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu");//verilen araligi bu stringle degistirir
        System.out.println("sb = " + sb);

        String strSb=sb.toString();


        StringBuffer sBuffer=new StringBuffer();

        //String Builder ile hersey ayni.Tek farki , paralel calisan yazilimlarda StringBuffer kullanilir.


    }
}
