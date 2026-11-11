#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int x, y, z;
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> x >> y >> z;
        a += x;
        b += y;
        c += z;
    }
    cout << ((a != 0 || b != 0 || c != 0) ? "NO\n" : "YES\n");
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}