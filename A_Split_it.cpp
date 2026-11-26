#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n, k;
    cin >> n >> k;

    string s;
    cin >> s;

    if (n <= 2 * k)
    {
        cout << "NO\n";
        return;
    }

    for (int i = 0; i < k; i++)
    {
        if (s[i] != s[n - 1 - i])
        {
            cout << "NO\n";
            return;
        }
    }

    cout << "YES\n";
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