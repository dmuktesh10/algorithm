public class SelectionSort
{
  public static void main(String args[])
  {
    int a[] = new int []{23,12,54,2,67,0,3,-1};
    for(int i=0; i<a.length-1;i++)
    {
      int min = a[i];
      for(int j=i+1; j<a.length;j++)
      {
        if(min>a[j])
        {
          min=a[j];
          a[j]=a[i];
          a[i]=min;
        }
      }
    }
    for(int e:a)
    {
      System.out.print(" " + e+" ");
    }
  }
}