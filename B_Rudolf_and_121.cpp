#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    bool ans = true;
    for (int i = 0; i < n - 2; i++)
    {
        if (a[i] < 0)
        {
            ans = false;
            break;
        }
        a[i + 1] -= 2 * a[i];
        a[i + 2] -= a[i];
    }

    ans = ans && a[n - 2] == 0 && a[n - 1] == 0;
    cout << (ans ? "YES\n" : "NO\n");
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