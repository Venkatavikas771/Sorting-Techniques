class SelectionSort
  {
    public static void main(String args[])
    {
      int arr[]={64,25,12,22,11};
        System.out.println("Elements before sort");
      for(int i=0;i<arr.length;i++)
        {
         System.out.println(arr[i]+" "); 
        }
       System.out.println("------------------------------------");
      int len=arr.length;  //6
    for(int i=0;i<len-1;i++)  
      {
        int min_index=i;  //    64  25  12 11
      for(int j=i+1;j<len;j++)   //  25  12  22  11
          {
            if(arr[min_index]>arr[j])    //64>25   25>12   12>22  12>11
            {
              min_index=j;      //  1     2  3 4
            }
          }
        int temp=arr[min_index];                           
        arr[min_index]=arr[i];
        arr[i]=temp;
      }
       System.out.println("Elements after sort");
      for(int i=0;i<len;i++)
        {
         System.out.println(arr[i]+" ");
        }
    }
  }


