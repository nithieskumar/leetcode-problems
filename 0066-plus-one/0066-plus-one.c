int* plusOne(int* a, int n, int* r) 
{
    int *s=(int *)malloc((n+1)*sizeof(int));
    int sum=0,r1,c=1;
    for(int i=n-1;i>=0;i--)
    {
        sum=a[i]+c;
        s[i+1]=sum%10;
        c=sum/10;
    }
    if(c)
    {
        s[0]=c;
        *r=n+1; 
    }
    else{
        for(int i=0;i<n;i++)
        {
            s[i]=s[i+1];
        }
        *r=n;
    }
    return s;
}