package Tecent;

public class Ackerman {
	
	private static int ack(int m,int n)
	{
	 if(m==0)
	  return n+1;
	 else if (n==0)
	  return ack(m-1,1);
	 else
	  return ack(m-1,ack(m,n-1));
	}
	
	// http://zh.wikipedia.org/zh/%E9%98%BF%E5%85%8B%E6%9B%BC%E5%87%BD%E6%95%B8
	public static void main(String[] args) {
		int result = ack(3,3);
		System.out.println(result);

	}
}
