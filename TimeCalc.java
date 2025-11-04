public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        int totalMinutes = (hh * 60) + mm  + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        if (newHours < 10 && newMinutes < 10) {
            System.out.print("0" + newHours + ":0" + newMinutes);
        }
        else if (newHours < 10) {
            System.out.print("0" + newHours + ":" + newMinutes);
        } 
        else if (newMinutes < 10) {
            System.out.print(newHours + ":0" + newMinutes);
        }
        else {
            System.out.println(newHours + ":" + newMinutes);
        }
    }
}
