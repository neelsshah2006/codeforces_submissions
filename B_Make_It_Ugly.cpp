#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n;
    while (t-- > 0)
    {
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }

        int len = 0;
        int mn = n;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == arr[0])
            {
                len++;
            }
            else
            {
                mn = min(mn, len);
                len = 0;
            }
        }
        mn = min(mn, len);
        cout << (mn == n ? -1 : mn) << '\n';
    }
    return 0;
}