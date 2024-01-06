import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lowestTemp;
		String lowestCity;
		
		String city;
		int temp;

		city = sc.next();
		temp = sc.nextInt();
		sc.nextLine();

		lowestCity = city;
		lowestTemp = temp;

		while (true) {
			if (city.equals("Waterloo")){
				System.out.println(lowestCity);
				break;
			}

			city = sc.next();
			temp = sc.nextInt();

			if (temp < lowestTemp){
				lowestTemp = temp;
				lowestCity = city;
			}

		}

	}
}
