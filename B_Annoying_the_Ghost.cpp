#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int a[n], b[n], c[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    set<int> s;
    for (int i = 0; i < n; i++)
    {
        cin >> b[i];
        s.insert(b[i]);
    }

    bool y = true;
    for (int i = 0; i < n; ++i)
    {
        auto it = s.lower_bound(a[i]);
        if (it == s.end())
        {
            y = false;
            break;
        }
        c[i] = *it;
        s.erase(it);
    }

    if (!y)
    {
        cout << -1 << '\n';
        return;
    }

    int ans = 0;
    for (int i = 0; i < n; ++i)
    {
        for (int j = i + 1; j < n; ++j)
        {
            if (c[i] > c[j])
            {
                ans++;
            }
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