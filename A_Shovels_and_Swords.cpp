#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int a, b;
    cin >> a >> b;
    cout << min(a, min(b, (a + b) / 3)) << '\n';
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