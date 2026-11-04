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
        int n, q, l, r;
        cin >> n >> q;
        int a[n], b[n];
        long long pref[n + 1];
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }

        for (int i = 0; i < n; i++)
        {
            cin >> b[i];
        }

        a[n - 1] = max(a[n - 1], b[n - 1]);
        for (int i = n - 2; i >= 0; i--)
        {
            a[i] = max({a[i], b[i], a[i + 1]});
        }

        pref[0] = 0;
        for (int i = 1; i <= n; i++)
        {
            pref[i] = pref[i - 1] + a[i - 1];
        }

        for (int i = 0; i < q; i++)
        {
            cin >> l >> r;
            cout << pref[r] - pref[l - 1] << ' ';
        }
        cout << '\n';
    }
    return 0;
}