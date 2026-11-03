// Written by Claude

void main() {
    while (true) {
        String answer = IO.readln("Enter a day and hour, like 3:14 : ");

        try {
            String[] parts = answer.split(":");
            int dayNumber = Integer.parseInt(parts[0]);
            int hour = Integer.parseInt(parts[1]);

            String dayName;
            switch (dayNumber) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                case 7:
                    dayName = "the weekend";
                    break;
                default:
                    dayName = "Unknown";
            }

            IO.println("Meeting on " + dayName + " at " + hour + ":00");
            break;
        } catch (NumberFormatException e) {
            IO.println("Use whole numbers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            IO.println("Put a : between the day and the hour.");
        }
    }
}
