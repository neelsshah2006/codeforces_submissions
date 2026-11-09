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
        long long a[n] = {0};
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }
        int idx = -1, s = 0;
        int tmp;
        long long mn = LLONG_MAX;
        for (int i = 0; i < n; i++)
        {
            cin >> tmp;
            a[i] -= tmp;
            if (a[i] >= 0)
                mn = min(mn, a[i]);
            else
            {
                s++;
                idx = i;
            }
        }

        if (s == 0 || (s == 1 && mn >= -a[idx]))
        {
            cout << "YES\n";
        }
        else
        {
            cout << "NO\n";
        }
    }
    return 0;
}