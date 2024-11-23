import java.time.*; //this is joda API 

public class Date_Time2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();
        System.out.println(day+"/"+month+"/"+year);// 21/11/2024


      LocalTime time=  LocalTime.now();
      int hour=time.getHour();
      int min=time.getMinute();
      int sec=time.getSecond();
      int nano=time.getNano();

      System.out.println(hour+" : "+min+" : "+sec+" : "+nano);//19 : 46 : 13 : 253054500

    }
}
