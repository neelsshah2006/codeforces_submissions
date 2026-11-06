#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n;
        cin >> n;
        int arr[n] = {0};
        int zeros = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            if (arr[i] == 0)
                zeros++;
        }

        int left = 0, right = n - 1;
        while (left <= right && arr[left] == left + 1)
            left++;
        while (right >= left && arr[right] == right + 1)
            right--;

        if (zeros > 1 || zeros == 0 || (arr[left] != 0 && arr[right] != 0))
        {
            cout << right - left + 1 << '\n';
            continue;
        }

        int xr = 0;
        for (int i = 1; i <= n; i++)
        {
            xr ^= i ^ arr[i - 1];
        }

        if ((arr[left] == 0 && left + 1 == xr) || (arr[right] == 0 && right + 1 == xr))
        {
            if (arr[left] == 0)
            {
                left++;
                while (left <= right && arr[left] == left + 1)
                    left++;
            }
            else
            {
                right--;
                while (right >= left && arr[right] == right + 1)
                    right--;
            }
        }

        cout << right - left + 1 << '\n';
    }
    return 0;
}