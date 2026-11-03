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
        int arr[n];
        string s;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            s += "0";
        }

        int min = arr[0], max = arr[n - 1];
        s[0] = s[n - 1] = '1';
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                s[i] = '1';
            }

            if (arr[n - i - 1] > max)
            {
                max = arr[n - i - 1];
                s[n - i - 1] = '1';
            }
        }

        cout << s << '\n';
    }
    return 0;
}