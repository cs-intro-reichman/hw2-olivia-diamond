public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        String[] timeParts = time.split(":");
    
    int hoursOriginal = Integer.parseInt(timeParts[0]);
    int minutesOriginal = Integer.parseInt(timeParts[1]);

   //System.out.println( "Hours: " + hoursOriginal );
    //System.out.println( "minutes: " + minutesOriginal);
    //System.out.println( "Minutes to add: " + minutesToAdd);

    int totalMinutes = (hoursOriginal * 60) + minutesOriginal + minutesToAdd;
    int totalHours = totalMinutes/60;
    int newHours = totalHours % 24;
    int newMinutes = totalMinutes - (totalHours * 60);

   // System.out.println( "new minutes: " + newMinutes);
   // System.out.println( "new hours: " + newHours);

   String strNewMinutes = String.valueOf(newMinutes);
        strNewMinutes = "0" + strNewMinutes;

    String strNewHours = String.valueOf(newHours);
    
        if (newHours<10){
            strNewHours = "0" + strNewHours;
    }
   
   
    if (newMinutes<10){
        System.out.println(strNewHours + ":" +strNewMinutes );
    }

   if (newMinutes>10){
        System.out.println( strNewHours + ":" + newMinutes);
   }
   
   




    }
}
