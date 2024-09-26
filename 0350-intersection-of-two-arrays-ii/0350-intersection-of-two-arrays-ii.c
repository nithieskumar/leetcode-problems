/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersect(int* nums1, int n1, int* nums2, int n2, int* r) {
    int* result = (int *)malloc((n1 < n2 ? n1 : n2) * sizeof(int));
    int k = 0;
    int* used = (int *)calloc(n2, sizeof(int));
    
    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            if (nums1[i] == nums2[j] && !used[j]) {
                result[k++] = nums1[i];
                used[j] = 1; 
                break;
            }
        }
    }
    *r=k;
    result = (int *)realloc(result, sizeof(int) * k);
   
    
    free(used);
    return result;
}
