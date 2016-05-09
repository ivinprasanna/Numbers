import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import java.net.*;

class Distance_Between {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the location");
		String city = in.nextLine();
		String latLong[] = getCoordinates(city);
		double lat1 = Double.parseDouble(latLong[0]);
		double lng1 = Double.parseDouble(latLong[1]);
		System.out.println("Latitude: " +lat1 +" Longitude: " +lng1);
		System.out.println("Enter the location");
		String city2 = in.nextLine();
		String latLong2[] = getCoordinates(city2);
		double lat2 = Double.parseDouble(latLong2[0]);
		double lng2 = Double.parseDouble(latLong2[1]);
		System.out.println("Latitude: " +lat2 +" Longitude: " +lng2);
		System.out.println("Distance: " +distance(lat1, lat2, lng1, lng2));
		
		in.close(); 
	}
	
	private static int distance(double lat1, double lat2, double lng1, double lng2) {
		double theta = lng1 - lng2;
		double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
		dist = Math.acos(dist);
		dist = Math.toDegrees(dist);
		dist = dist * 60 * 1.1515;
		return (int)(dist * 1.609344);
	}
			
	private static String[] getCoordinates(String address) throws Exception {
		
		String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
		URL url = new URL(api);
		HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
		httpConnection.connect();
		int responseCode = 0;
		responseCode = httpConnection.getResponseCode();
		if(responseCode == 200) {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse(httpConnection.getInputStream());
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xpath = xPathFactory.newXPath();
			XPathExpression expr = xpath.compile("/GeocodeResponse/status");
			String status = (String)expr.evaluate(document, XPathConstants.STRING);
			if(status.equals("OK")) {
				expr = xpath.compile("//geometry/location/lat");
				String latitude = (String)expr.evaluate(document, XPathConstants.STRING);
				expr = xpath.compile("//geometry/location/lng");
				String longitude = (String)expr.evaluate(document, XPathConstants.STRING);
				return new String[]{latitude, longitude};
			}
			else {
				throw new Exception("Error"+status);
			}
		}
		return null;
	}
}