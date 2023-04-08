package _Gun_39_Sorular_oop.Soru5;

public class AdanaKebap  implements IFood{


      public void marinade(){
            System.out.println("Etiniz marine edildi.");
      }

      public void grill(){System.out.println("Kebabiniz kömür atesinde pisirildi.");
      }


      @Override
      public void taste() {
            System.out.println("Etin en guzel hallerinden biri. ");
      }

      @Override
      public double ucret() {
            return 75;
      }
}
