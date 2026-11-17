#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, m;
    cin >> n >> m;
    int prev = 0;
    int curr;
    for (int i = 0; i < n; i++)
    {
        cin >> curr;
        int c = (curr >= prev ? (prev == 0 ? 0 : 1) + (curr - prev) / m : 0);
        cout << c << ' ';
        prev = (curr >= prev ? m - (curr - prev) % m : prev - curr);
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}