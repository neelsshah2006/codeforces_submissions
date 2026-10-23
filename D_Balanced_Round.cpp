#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k, tmp;
        cin >> n >> k;
        vector<int> arr;
        for(int i = 0; i < n; i++) {
            cin >> tmp;
            arr.push_back(tmp);
        }
        sort(arr.begin(), arr.end());
        
        int len = 1, mx = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] - arr[i - 1] > k) {
                mx = max(len, mx);
                len = 0;
            }
            len++;
        }
        mx = max(len, mx);
        cout << n - mx << '\n';
    }
    return 0;
}