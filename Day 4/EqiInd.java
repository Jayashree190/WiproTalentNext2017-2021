public static int balancedSum(List<Integer> arr) {
        int i;
        int lsum=0,sum=0;
        Scanner s= new Scanner(System.in);
        int a[]=new int[arr.size()];
        for(i=0;i<arr.size();i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<arr.size();i++)
        {
            sum=sum+a[i];
        }
        for(i=0;i<arr.size();i++)
            {
                sum=sum-a[i];
                if(lsum==sum)
                    return i;
                lsum+=a[i];
            }
            
        return -1;

        }
    }
