
public class StringLiteral {

	public static void main(String[] args) {
		// String Handling
		/*
		 * there is a build in java class in java with many useful methods
		 * Sting is immutable or read only- once a value assigned it could not be modified in the same memory
		 * change is happening in a d/t memory in sting constant pool
		 * .equals compares content
		 * == compares reference
		 * if the content is not going to be modified any time soon
		 */
		String s1 = "edureka";
		String s2 = "edureka";
		String s3 = "Edureka";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		/*
		 * StingBuffer is mutable
		 * java.lang package is default package 
		 * because some of the contents of the package is used by JVM at run time
		 * change is happening in the same memory if updated
		 * used if the data is keeps changing
		 * 
		 */
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		sb.append("edureka");
		System.out.println(sb);
		sb.append("limited");
		System.out.println(sb);
		/*
		 * StringBuilder - mutable and the methods are not synchronised(not thread safe)
		 * intoduced recently JDK 1.5
		 * -default size when StingBulder obj. is  created is 16 (capacity)
		 */

	}

}
