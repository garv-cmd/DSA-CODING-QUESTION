public class Main
{
	public static void main(String[] args) {
	    int arr[] = new int[]{1,2,-9,3,-5,2,4,-8};
	//	System.out.println("Hello World");
	    
	    int i=0,j=arr.length-1;
	    while(i<=j){
	        if(arr[i] <0 && arr[j]>0){
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }else if(arr[i]>0 && arr[j]<0){
	            i++;
	            j--;
	        }else if(arr[i]>0){
	            i++;
	        }else if(arr[j]<0){
	            j--;
	        }
	    }
	    int n = arr.length;
	    if(i==0 || i==n)
	    for(int v:arr)
	    System.out.print(v+" ");
	    else{
	        int k=0;
	        while(i<n && k<n){
	            int temp = arr[i];
	            arr[i] = arr[k];
	            arr[k] = temp;
	            i++;
	            k+=2;
	        }
	        for(int v:arr)
	    System.out.print(v+" ");
	    }
	    
	}
}
