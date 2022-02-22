package leetcode;

public class Addition {

	public static void main(String[] args) {
		Addition o = new Addition();
		System.out.println(o.addStrings("1123", "935"));
	}

public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int carry=0;
        int i=len1, j=len2;
        for(; i>-1 && j>-1; i--, j--){
        	int a = findNum(num1.charAt(i));
        	int b = findNum(num2.charAt(j));
        	System.out.println("a :"+a+" "+b);
        	int sum=a+b+carry;
        	if(sum>9)
        		carry=1;
        	else
        		carry=0;
        	res.append((sum)%10);
        }
        while(i>=0){
        	int a = findNum(num1.charAt(i));
        	int sum=a+carry;
        	if(sum>9)
        		carry=1;
        	else
        		carry=0;
        	res.append((sum)%10);
        	i--;
        }
        while(j>=0){
        	int a = findNum(num2.charAt(j));
        	int sum=a+carry;
        	if(sum>9)
        		carry=1;
        	else
        		carry=0;
        	res.append((sum)%10);
        	j--;
        }
        if(carry==1)
        	res.append("1");
        System.out.println(res.toString());
        return res.reverse().toString();
    }

private int findNum(char ch) {
	switch(ch){
	case '0':
		return 0;
	case '1':
		return 1;
	case '2':
		return 2;
	case '3':
		return 3;
	case '4':
		return 4;
	case '5':
		return 5;
	case '6':
		return 6;
	case '7':
		return 7;
	case '8':
		return 8;
	case '9':
		return 9;
	}
	return 0;
}
}
