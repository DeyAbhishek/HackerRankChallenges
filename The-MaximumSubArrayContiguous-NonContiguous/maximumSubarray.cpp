#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int m;
    cin >> m;
    while(m-- > 0){
        int n;
        cin >> n;
        int arr[n];
        int i = 0;
        for(i = 0; i < n; i++) cin >> arr[i];
        int noncontisum = 0;
        int sum = 0, max = arr[0];
        for(i=0; i < n; i++){
            if(arr[i] > 0) noncontisum += arr[i];
            sum += arr[i];
            if(sum < 0) sum = 0;
            if(max < sum) max = sum;
            
        }
        if(max < 0) max = 0;
        int count = 0;
        int maxElem = arr[0];
        for(i = 0; i < n; i++){
            if(arr[i] < 0) count++;
            if(arr[i] > maxElem) maxElem = arr[i];
        }
        if(count == n) {
            noncontisum = maxElem;
            max = maxElem;
        }
        cout << max << " " << noncontisum << endl;
    }
    
    return 0;
}
