package day02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/*
 * You need to transfer some information through a slow data-link as fast as possible. 
  You consider using a file archiver to compress data before sending.
The first line of input contains an integer dataSize - the size of data you need to transfer 
in bytes.
 1 <= dataSize <= 10000.
 
The second line of input contains an integer transferSpeed - the speed of data transfer 
through the link, in bytes per second. 1 <= transferSpeed <= 10.

The third line of input contains an integer N - the number of archivers you are considering.
 1 <= N <= 2.
The following N lines contain information about archivers, each line describing 
one archiver with
two space-separated integers: processingSpeed - the speed of data processing 
(both compression and extraction) in bytes per second,
and compressionRate - the rate of compression achieved by the archiver 
(i.e. the size of compressed data divided by the size of original data),
in percent. 
1 <= processingSpeed <= 100, 1 <= compressionRate <= 99.

Output the minimal time you'll need to send the data through the data-link, 
including compression and extraction time, rounded up to the nearest integer.
Round up only the final answer, not intermediary calculations results.

Example

	input#
	1000 -datasize
	10	 -transferSpeed in bytes per second
	2	 -the number of archivers you are considering
	
	100 50	-processingSpeed & compressionRate
	60 20	-processingSpeed & compressionRate

	output#
	40

Sending the data uncompressed will take 1000/10 = 100 seconds.
Using first archiver will take 1000/100 + 1000*0.5/10 + 1000*0.5/100 = 65 seconds.
Using second archiver will take 1000/60 + 1000*0.2/10 + 1000*0.2/60 = 39 1/3 seconds, 
rounding up to 40 seconds.
 */

public class IQ_01_DataTransferSpeed {
	
	static Scanner scan = new Scanner(System.in);
	
	static double dataSize;
	static double transferSpeed;
	static double archivers;
	static double processingSpeed;
	static double compressionRate;
	static Optional<Double> optimalTime;
	static List<Double> time= new ArrayList<>();
	
	public static void main(String[] args) {
		
	getParameters();
	
	optimalTime = time.stream().sorted(Comparator.naturalOrder()).findFirst();
		
	System.out.println(Math.round(optimalTime.get()));
	}

	private static void calculateTime() {
		double packagingTime = dataSize/processingSpeed;//time of compressing data before sending
		double numberOfPackages = dataSize*(compressionRate/100);
		double trasferringTime = numberOfPackages/transferSpeed;
		double unpackagingTime= numberOfPackages/processingSpeed;
		double totalTime = packagingTime + trasferringTime + unpackagingTime;
		time.add(totalTime);
	}

	private static void getParameters() {
		System.out.println("Enter data size: ");
		dataSize= scan.nextDouble();
		
		System.out.println("Enter tranferring speed: ");
		transferSpeed = scan.nextDouble();
		
		System.out.println("Enter the number of archivers you are considering: ");
		archivers = scan.nextDouble();
		
		int i=1;
		while (archivers >= i) {
			System.out.println("Enter processingSpeed & compressionRate");
			String s = scan.nextLine();
			while(s.equals("")) {
				s= scan.nextLine();
			}
			
			String arr[] = s.split(" ");
			processingSpeed = Double.parseDouble(arr[0]);
			compressionRate = Double.parseDouble(arr[1]);
			i++;
		}
		calculateTime();
	}

}
