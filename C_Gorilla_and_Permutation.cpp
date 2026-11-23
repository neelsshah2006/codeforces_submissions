#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, m, k;
    cin >> n >> m >> k;

    for (int x = n; x >= k; x--)
        cout << x << ' ';
    for (int x = m + 1; x < k; x++)
        cout << x << ' ';
    for (int x = 1; x <= m; x++)
        cout << x << ' ';

    cout << '\n';
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}