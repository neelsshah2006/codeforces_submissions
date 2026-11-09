#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int mn = INT_MAX, tmp;
    long long ans = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> tmp;
        if (tmp < mn)
        {
            ans += (mn - tmp) * i;
            mn = tmp;
        }
        else
        {
            ans += (tmp - mn);
        }
    }
    cout << ans << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t-- > 0)
    {
        solve();
    }
    return 0;
}