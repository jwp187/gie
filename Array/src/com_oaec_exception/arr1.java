package com_oaec_exception;

public class arr1 {
	public static void main(String[] args){
		int [] num={1,4,12,22,43,6};
		int [] num1={1,41,2,25,43,6};
		int temp=0;
		//ц╟ещ
		for(int i=0; i<num.length;i++){             // 0 1
			for(int j=0; j<num.length-1;j++){//0  2
				if(num[i]<num[j]){//0 3
					
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int k=0;k<num.length;k++){
			System.out.println(num[k]);
			
		}
		System.out.println("********************");
		
		for(int i=0; i<num1.length-1;i++){
			for(int j=i; j<num1.length;j++){
				if(num1[i]<num1[j]){
					temp=num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
			     }
			
		      }
		}
			for(int v=0;v<num1.length;v++){
				System.out.println(num1[v]);
			}
	}
}
