	//https://practice.geeksforgeeks.org/problems/peak-element/1/?category[]=Arrays&company[]=Amazon&problemStatus=unsolved&problemType=functional&page=1&sortBy=submissions&query=category[]Arrayscompany[]AmazonproblemStatusunsolvedproblemTypefunctionalpage1sortBysubmissions#
  public int peakElement(int[] a,int n)
    {
       //add code here.
       if(a.length==1)
       return 0;
       if(a[0]>a[1])
       return 0;
       for(int i=1;i<=n-2;i++){
           if(a[i]>a[i-1] && a[i]>a[i+1])
           return i;
       }
        if(a[n-1]>a[n-2])
       return n-1;
       return -1;
    }
