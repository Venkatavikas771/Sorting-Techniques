import java.util.Scanner;
class BubbleSort
  {
    public void bubbleSort(int ar[],int size)
    {
      for(int i=1;i<ar.length-1;i++)     // {2,4,1,6,5}
        {
          for(int j=0;j<ar.length-i;j++)
            {
              if(ar[j]>ar[j+1])
              {
                int temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
              }
            }
          BubbleSort.printArr(ar,size);
        }
      BubbleSort.printArr(ar,size);
    }
    static void printArr(int ar[],int size)
  {
  for(int i=0;i<ar.length;i++)
    {
      System.out.println(ar[i]);
    }
  }
  }
class Bubble
  {
    public static void main(String args[])
    {
        BubbleSort b=new BubbleSort();
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
          int size=sc.nextInt();
       System.out.println("Enter the array values");
            int ar[]=new int[size];
          for (int k=0;k<ar.length;k++)
            {
              ar[k]=sc.nextInt();
            }
      b.bubbleSort(ar,size);
    }
  }