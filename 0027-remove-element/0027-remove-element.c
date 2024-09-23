int removeElement(int* a, int n, int val) {
    int k=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]!=val)
        {
            a[k]=a[i];
            k++;
        }
    }
    return k;
}