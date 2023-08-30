package Method;

import java.util.Scanner;

public class HourMinSecPrj {
	
	public static long converttoseconds(int hours, int minutes, int seconds)
	{
		return hours * 3600 + minutes * 60 + seconds;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter time in hours:minutes:seconds: format (eg:12:25:36)");
			String input = sc.nextLine();
			
			String[]parts = input.split(":");
			if (parts.length !=3)
			{
				System.out.println("Invalid format.Please try again.");
				continue;
			}
			
			
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);

                if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
                    System.out.println("Invalid time values.");
                    continue;
                }

                long totalSeconds = converttoseconds(hours, minutes, seconds);
                System.out.println("Equivalent time in seconds: " + totalSeconds);
             
               System.out.print("Do you want to continue? (y/n): ");
               	String choice = sc.nextLine();
               	if (!choice.equalsIgnoreCase("y")) {
            break;
        }
		}
		
		
	}

}
