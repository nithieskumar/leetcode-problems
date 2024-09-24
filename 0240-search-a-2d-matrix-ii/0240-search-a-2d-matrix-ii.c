

bool searchMatrix(int** m, int ms, int *mc, int k){
    for(int i=0;i<ms;i++)
    {
        for(int j=0;j<mc[0];j++)
        {
               if(m[i][j]==k)
               {
                  return true; 
               }
               
        }
    }
    return false; 
}