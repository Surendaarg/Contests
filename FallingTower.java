package leetcode;

import java.util.Stack;

public class FallingTower {

	public static void main(String[] args) {
		String s="R.R.L";
		FallingTower o = new FallingTower();
		System.out.println(o.pushDominoes(s));
	}

	class Pair{
        char c;
        int i;
        Pair(char c,int i){
            this.c=c;
            this.i=i;
        }
    }
    public String pushDominoes(String dominoes) {
        char ch[]=dominoes.toCharArray();
        int left[]=new int[ch.length];
        int right[]=new int[ch.length];
        Stack<Pair> s=new Stack<>();
        left[ch.length-1]=ch[ch.length-1]=='.'?-1:ch.length-1;
        s.push(new Pair(ch[ch.length-1],ch.length-1));
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='L')
                left[i]=i;
            else if(ch[i]=='R')
                left[i]=-1;
            else{
                
                while(s.size()>0&&(s.peek().c=='.'))
                    s.pop();
                if(s.size()==0||s.peek().c=='R')
                    left[i]=-1;
                else left[i]=s.peek().i;
            }
            s.push(new Pair(ch[i],i));
        }
        right[0]=ch[0]=='R'?0:-1;
        s.clear();
        s.push(new Pair(ch[0],0));
        for(int i=1;i<ch.length;i++){
            if(ch[i]=='R')
                right[i]=i;
            else if(ch[i]=='L')
                right[i]=-1;
            else{
                while(s.size()>0&&s.peek().c=='.')
                    s.pop();
                if(s.size()==0||s.peek().c=='L')
                    right[i]=-1;
                else right[i]=s.peek().i;
            }
            s.push(new Pair(ch[i],i));
        }
        
        StringBuilder str=new StringBuilder();
        for(int i=0;i<left.length;i++){
            if(left[i]==-1&&right[i]==-1)
                str.append(".");
            else if(left[i]==-1)
                str.append("R");
            else if(right[i]==-1)
                str.append("L");
            else {
                if(left[i]-i>i-right[i])
                    str.append("R");
                if(left[i]-i<i-right[i])
                    str.append("L");
                if(left[i]-i==i-right[i])
                    str.append(".");
            }
        }
        return str.toString();
    }
}