public class Testing {
	public static void main(String[] args)
	{
		int j,k,l,m;
		j = 4; k = j++; l = k%2;

		m = proses(j+3,l++);

		System.out.printf("j : %d k: %d m: %d\n",j,k,l,m);
	}

	public static int proses(int a, int b)
	{
		return a++ * ++b;
	}
}


