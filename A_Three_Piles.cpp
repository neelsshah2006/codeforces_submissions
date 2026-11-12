#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int a, b, c;
    cin >> a >> b >> c;
    int mn = min(a, min(b, c));
    int mx = max(a, max(b, c));
    int mid = a ^ b ^ c ^ mn ^ mx;
    if (mx - mid == 1 && mid - mn == 1)
    {
        cout << "YES\n";
    }
    else
        cout << "NO\n";
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