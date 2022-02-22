package leetcode;

public class Refill {

	public static void main(String[] args) {
		int[] p = {5};
		Refill o = new Refill();
		System.out.println(o.minimumRefill(p, 5, 5));
	}
	public int minimumRefill1(int[] plants, int capacityA, int capacityB)  {
		 int refil = 0;
	        int l =0, r =plants.length-1;
	        int A = capacityA, B = capacityB;
	        int filled =0;
	        while(filled<plants.length){
	        	if(l==r){
	        		if(A>=B){
	        			
	        		}
	        	}
	        }
		return refil;
	}
	public int minimumRefill1(int[] plants, int capacityA, int capacityB) {
        int refil = 0;
        int l =0, r =plants.length-1;
        int A = capacityA, B = capacityB;
        int filled =0;
        while(filled<plants.length){
        	if(l==r){
        		if(A>B){
        			if(A>=plants[l])
                	{
                		A=A-plants[l];
                		filled++;
                		l++;
                	}
                	else{
                		plants[l] = plants[l] - A;
                		refil++;
                		A = capacityA;
                	}
        		}
        		else if(B>A){
        			if(B>=plants[r])
                	{
                		B=B-plants[r];
                		filled++;
                		r--;
                	}
                	else{
                		plants[r] = plants[r] - B;
                		refil++;
                		B = capacityB;
                	}
        		}
        		if(A==B){
        			if(A>=plants[l])
                	{
                		A=A-plants[l];
                		filled++;
                		l++;
                	}
                	else{
                		plants[l] = plants[l] - A;
                		refil++;
                		A = capacityA;
                	}
        		}
        	}
        	else {if(A>=plants[l])
        	{
        		A=A-plants[l];
        		filled++;
        		l++;
        	}
        	else{
        		plants[l] = plants[l] - A;
        		refil++;
        		A = capacityA;
        	}
        	System.out.println("A & L"+A+" "+l);
        	if(filled<plants.length){
        	if(B>=plants[r])
        	{
        		B=B-plants[r];
        		filled++;
        		r--;
        	}
        	else{
        		plants[r] = plants[r] - B;
        		refil++;
        		B = capacityB;
        	}
        	}
        	System.out.println("B & R"+B+" "+r);
        	System.out.println(filled);
        	}
        }
        return refil;
    }
}
