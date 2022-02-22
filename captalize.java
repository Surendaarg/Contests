package leetcode;

import java.util.ArrayList;

public class captalize {

	public static void main(String[] args) {
		captalize o = new captalize();
		System.out.println(o.capitalizeTitle("i lOve leetcode"));
	}

    public String capitalizeTitle(String title) {
        ArrayList<String> list = new ArrayList<String>();
        String temp="";
        for(int i=0; i<title.length(); i++){
        	if(title.charAt(i)!=' '){
        		temp=temp+title.charAt(i);
        	}
        	else{
        		if(temp.length()>0)
        			list.add(temp);
        		temp="";
        	}
        }
        if(temp.length()>0)
			list.add(temp);
        String res="";
        for(String s: list){
        	if(s.length()>2){
        		res = res+s.substring(0,1).toUpperCase();
        		res = res+s.substring(1).toLowerCase()+" ";
        	}
        	else
        		res = res+s.toLowerCase()+" ";
        }
        
		return res.substring(0, res.length()-1);
    }
}
