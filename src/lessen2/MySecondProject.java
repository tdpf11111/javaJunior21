package lessen2;

public class MySecondProject {
    public static void main(String[] args) {
      double roomWight = 5.7 ;
      double roomLength = 4;

      double tableWeight = 2;
      double tableWength = 2.6;

      double ploshadRoom = roomWight * roomLength;
      double ploshadTable = tableWeight * tableWength;


     int cauntTableToInsertTORoom = (int) (ploshadRoom / ploshadTable);
        System.out.println("столов влезет в комнату: " + cauntTableToInsertTORoom);

        double freePloshad = ploshadRoom - cauntTableToInsertTORoom * ploshadTable;
        System.out.println("Сворбодная площадь: " + freePloshad);


    }
}
