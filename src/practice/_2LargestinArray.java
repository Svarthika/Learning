package practice;

public class _2LargestinArray {



    public static void main(String[] args) {
        int[] arr ={2,8,9,9,1,0};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] < arr[j]) {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                else if(arr[i]==arr[j]){
                  arr[j]=0;
                }
            }


    }

        System.out.println(arr[1]);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }


}
