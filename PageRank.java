//"I, Hasan Qadri, worked on the homework assignment alone, using only course materials."
import java.util.Arrays;
import java.util.Scanner;

public class PageRank {

	public static void main(String[] args) {
		// Getting Info
		System.out.println("Name of the page you are ranking?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		System.out.println("Number of outbound links it has?");
		double outbound = scanner.nextDouble();

		System.out.println("What is the damping factor?");
		double damping = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Available pages:" + "\n" + "Wikipedia" + "\n" + "Facebook\n" + "TechCrunch\n" + "Twitter\n" + "BlueApron\n" + "Instagram\n" + "Pinterest\n"
		+ "Quora\n" + "Grubhub\n" + "Airbnb\n");

		System.out.println("Which pages do your pages link to?");
		String pages = scanner.nextLine();

		//Data available
		double wikiPR = 4;
		double wikiOL = 10;

		double facebookPR = 4;
		double facebookOL = 8;

		double techCrunchPR = 3;
		double techCrunchOL = 6;

		double twitterPR = 4;
		double twitterOL = 6;

		double instagramPR = 1;
		double instagramOL = 1;

		double pinterestPR = 4;
		double pinterestOL = 7;

		double blueApronPR = 1;
		double blueApronOL = 4;

		double quoraPR = 3;
		double quoraOL = 5;

		double grubHubPR = 2;
		double grubHubOL = 2;

		double airbnbPR = 2;
		double airbnbOL = 4;

		double sum = 0;

		//Array creation and manipulation
		String[] otherList  = {"Wikipedia", "Facebook", "TechCrunch", "Twitter", "Instagram", "Pinterest", "BlueApron", "Quora", "GrubHub", "Airbnb"};
		pages = pages.replace(",", "");
		String words[] = pages.split(" ");

		//Value comparisons
		for (int i = 0; i < words.length; i++){
			if (Arrays.asList(otherList).contains(words[i])){
				if(words[i].equals("Facebook")){
					sum = sum + (facebookPR / facebookOL);
				}
				else if(words[i].equals("Wikipedia")){
					 sum = sum + (wikiPR / wikiOL);
				}
				else if(words[i].equals("TechCrunch")){
					 sum = sum + (techCrunchPR / techCrunchOL);
				}
				else if (words[i].equals("Twitter")){
					sum = sum + (twitterPR / twitterOL);
					}
				else if (words[i].equals("Instagram")){
					sum = sum + (instagramPR / instagramOL);
				}
				else if (words[i].equals("Pinterest")){
					sum = sum + (pinterestPR / pinterestOL);
				}
				else if (words[i].equals("BlueApron")){
					sum = sum + (blueApronPR / blueApronOL);
				}
				else if (words[i].equals("Quora")){
					sum = sum + (quoraPR / quoraOL);
				}
				else if (words[i].equals("GrubHub")){
					sum = sum + (grubHubPR / grubHubOL);
				}
				else if (words[i].equals("Airbnb")){
					sum = sum + (airbnbPR / airbnbOL);
				}
			}
		}
		//Wrapping it up
		double dampingFactor = (1 - damping) / outbound;
		double pagesLinked = damping * sum;
		double thePageRank = Math.round((dampingFactor + pagesLinked) * 100.0) / 100.0;
		System.out.println("The PageRank of " + name + " is: " + thePageRank);
		scanner.close();
	}
}
