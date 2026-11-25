
#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;

    vector<int> a(n + 1), freq(n + 1, 0);
    bool ans = true;
    for (int i = 1; i <= n; i++)
    {
        cin >> a[i];

        if (a[i] > n)
        {
            ans = false;
            continue;
        }
        else
            freq[a[i]]++;
    }
    if (!ans)
    {
        cout << "NO\n";
        return;
    }

    for (int i = n - 1; i >= 1; i--)
    {
        freq[i] += freq[i + 1];
    }

    for (int i = 1; i <= n; i++)
    {
        if (a[i] != freq[i])
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
