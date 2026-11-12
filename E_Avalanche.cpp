#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, k;
    cin >> n >> k;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    vector<int> inc(n + 1, 0);

    int factor = 0;
    int ans = 0;

    for (int i = n; i >= 1; i--)
    {
        factor = (factor + inc[i]) % 2;
        int moves = (a[i - 1] + factor) % 2;
        ans = (ans + moves) % 2;
        int l = max(1, i - k);
        inc[i - 1] = (inc[i - 1] + moves) % 2;
        inc[l - 1] = (inc[l - 1] - moves + 2) % 2;
    }

    cout << (ans ? "Alice\n" : "Bob\n");
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--)
        solve();

    return 0;
}